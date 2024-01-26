package co.edu.uniquindio.registroasignaturas.model;

public class TeoricoPractica extends Asignatura{
    //Atributos:
    private int cantHorasTeoria;
    private int cantHorasPrectica;
    //Constructor:
    public TeoricoPractica(){}
    public TeoricoPractica(String nombre,String codigo,int cantHorasTeoria, int cantHorasPrectica, int numCreditos, int horasSemanal) {
        super(codigo, nombre, numCreditos, horasSemanal);
        this.cantHorasTeoria = cantHorasTeoria;
        this.cantHorasPrectica = cantHorasPrectica;
    }
    //getters/Setters:
    public int getCantHorasTeoria() {
        return cantHorasTeoria;
    }

    public int getCantHorasPrectica() {
        return cantHorasPrectica;
    }

    public void setCantHorasTeoria(int cantHorasTeoria) {
        this.cantHorasTeoria = cantHorasTeoria;
    }

    public void setCantHorasPrectica(int cantHorasPrectica) {
        this.cantHorasPrectica = cantHorasPrectica;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
