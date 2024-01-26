package co.edu.uniquindio.registroasignaturas.model;

public class Teorica extends Asignatura{
    //Atributos:
    private String asignaturaRequisito;
    //Constructores:
    public Teorica(){}
    public Teorica(String nombre,String codigo, int numCreditos, int horasSemanal,String asignaturaRequisito) {
        super(codigo, nombre, numCreditos, horasSemanal);
        this.asignaturaRequisito = asignaturaRequisito;
    }
    //Getter/setter
    public String getAsignaturaRequisito() {
        return asignaturaRequisito;
    }

    public void setAsignaturaRequisito(String asignaturaRequisito) {
        this.asignaturaRequisito = asignaturaRequisito;
    }

    //Aplicando el polimorfismo:
    @Override
    public int calcularHorasSemestre(){
        int cantHorasSemestre = numCreditos * 48;
        return cantHorasSemestre;
    }
    @Override
    public int calcularIntensidadHoraria(){
        int cantHorasSemestre = horasSemanal * 16;
        return cantHorasSemestre;
    }


}
