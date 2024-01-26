package co.edu.uniquindio.registroasignaturas.model;

public abstract class Asignatura {
    //Atributos:
    protected String codigo;
    protected String nombre;
    protected int numCreditos;
    protected int horasSemanal;
    //Constructores:
    public Asignatura(){}
    public Asignatura(String codigo, String nombre, int numCreditos, int horasSemanal)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.horasSemanal = horasSemanal;
    }
    //Métodos abstractos:
    public abstract int calcularHorasSemestre();
    public abstract int calcularIntensidadHoraria();
    //getters/setters:
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public void setHorasSemanal(int horasSemanal) {
        this.horasSemanal = horasSemanal;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumCreditos() {
        return numCreditos;
    }
    public int getHorasSemanal() {
        return horasSemanal;
    }
}
