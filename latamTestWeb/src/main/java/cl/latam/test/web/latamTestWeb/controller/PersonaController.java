package cl.latam.test.web.latamTestWeb.controller;

import cl.latam.test.web.latamTestWeb.model.PersonaInModel;
import cl.latam.test.web.latamTestWeb.model.PersonaOutModel;
import cl.latam.test.web.latamTestWeb.service.IPersonaService;
import cl.latam.test.web.latamTestWeb.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping(value = "/persona/inicio")
    public String inicio(Model model){
        model.addAttribute("personaIn", new PersonaInModel());
        return "personas";
    }

    @PostMapping(value = "/persona/ingreso")
    public String ingresaPersona(Model model,HttpSession session,@ModelAttribute(name = "personaIn") PersonaInModel personaInModel){

        Date fechaNaci = DateUtils.stringToDate(personaInModel.getFechaNac(),"yyyy-MM-dd");
        personaInModel.setFechaNac(DateUtils.dateToString(fechaNaci,"dd-MM-yyyy"));

        PersonaOutModel personaOutModel = personaService.ingresaPersona(personaInModel);
        if(personaOutModel.getPoemaModel()!=null){
            personaOutModel.setPoema(personaOutModel.getPoemaModel().getContent());
        }else{
            personaOutModel.setPoema("---");
        }
        List<PersonaOutModel> personas ;

        if(session.getAttribute("personas") !=null){
            personas = (List<PersonaOutModel>) session.getAttribute("personas");
            personas.add(personaOutModel);
        }else{
            personas = new ArrayList<PersonaOutModel>();
            personas.add(personaOutModel);
            session.setAttribute("personas",personas);
        }

        model.addAttribute("listaPersonas",personas);
        model.addAttribute("personaIn", new PersonaInModel());

        return "personas";

    }


}
