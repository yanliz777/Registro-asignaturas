package co.edu.uniquindio.registroasignaturas.model;

import java.util.ArrayList;

public class Universidad_mainLogic {

    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();

    //constructor:
    public Universidad_mainLogic() {}
    //getters/setters
    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

}
