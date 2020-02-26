package cl.latam.test.web.latamTestWeb.service;

import cl.latam.test.web.latamTestWeb.model.PersonaInModel;
import cl.latam.test.web.latamTestWeb.model.PersonaOutModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Value("${cl.latam.test.context}")
    private String contexto;
    @Value("${cl.latam.test.service.persona}")
    private String pathService;

    @Override
    public PersonaOutModel ingresaPersona(PersonaInModel personaInModel) {

        String url = contexto+pathService;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PersonaOutModel> responseEntity = restTemplate.postForEntity(url, personaInModel,PersonaOutModel.class);
        if(responseEntity.getStatusCode() == HttpStatus.OK){
            return responseEntity.getBody();
        }
        return null;
    }
}
