package co.edu.uniquindio.registroasignaturas.model;

public class Estudiante {
    //Atributos:
    private String nombre;
    private String cedula;

    //Constructores:
    public Estudiante(){}
    public Estudiante(String nombre, String cedula)
    {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    //Getters/setters:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }

}
