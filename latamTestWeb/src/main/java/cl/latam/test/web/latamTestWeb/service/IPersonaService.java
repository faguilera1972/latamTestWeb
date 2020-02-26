package cl.latam.test.web.latamTestWeb.service;

import cl.latam.test.web.latamTestWeb.model.PersonaInModel;
import cl.latam.test.web.latamTestWeb.model.PersonaOutModel;

public interface IPersonaService {
    PersonaOutModel ingresaPersona(PersonaInModel personaInModel);
}
