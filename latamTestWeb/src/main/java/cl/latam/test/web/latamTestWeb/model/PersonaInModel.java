package cl.latam.test.web.latamTestWeb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "primerNombre",
        "segundoNombre",
        "apellidoPat",
        "apellidoMat",
        "fechaNac",
        "cumpleAnio"
})
public class PersonaInModel {

    @JsonProperty("primerNombre")
    private String primerNombre;
    @JsonProperty("segundoNombre")
    private String segundoNombre;
    @JsonProperty("apellidoPat")
    private String apellidoPat;
    @JsonProperty("apellidoMat")
    private String apellidoMat;
    @JsonProperty("fechaNac")
    private String fechaNac;
    @JsonProperty("cumpleAnio")
    private String cumpleAnio;



    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCumpleAnio() {
        return cumpleAnio;
    }

    public void setCumpleAnio(String cumpleAnio) {
        this.cumpleAnio = cumpleAnio;
    }
}
