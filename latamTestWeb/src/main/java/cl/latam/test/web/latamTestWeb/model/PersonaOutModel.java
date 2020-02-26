package cl.latam.test.web.latamTestWeb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nombre",
        "apellido",
        "edad",
        "diasCumple",
        "poema",
        "fechaNac"
})
public class PersonaOutModel {

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("apellido")
    private String apellido;
    @JsonProperty("edad")
    private int edad;
    @JsonProperty("diasCumple")
    private int diasCumple;
    @JsonProperty("poema")
    private String poema;
    @JsonProperty("poemaModel")
    private PoemaModel poemaModel;
    @JsonProperty("fechaNac")
    private String fechaNac;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasCumple() {
        return diasCumple;
    }

    public void setDiasCumple(int diasCumple) {
        this.diasCumple = diasCumple;
    }

    public String getPoema() {
        return poema;
    }

    public void setPoema(String poema) {
        this.poema = poema;
    }

    public PoemaModel getPoemaModel() {
        return poemaModel;
    }

    public void setPoemaModel(PoemaModel poemaModel) {
        this.poemaModel = poemaModel;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
