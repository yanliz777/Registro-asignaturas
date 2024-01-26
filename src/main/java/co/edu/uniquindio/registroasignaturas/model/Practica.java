package co.edu.uniquindio.registroasignaturas.model;

public class Practica extends Asignatura{
    private int cantHorasLaboratorioSemestre;
    //Constructores:
    public Practica(){}
    public Practica( String nombre,String codigo,int cantHorasLaboratorioSemestre
            ,int numCreditos, int horasSemanal)
    {
        super(codigo, nombre, numCreditos, horasSemanal);
        this.cantHorasLaboratorioSemestre = cantHorasLaboratorioSemestre;
    }
    //getters/setters:
    public void setCantHorasLaboratorioSemestre(int cantHorasLaboratorioSemestre) {
        this.cantHorasLaboratorioSemestre = cantHorasLaboratorioSemestre;
    }

    public int getCantHorasLaboratorioSemestre() {
        return cantHorasLaboratorioSemestre;
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
