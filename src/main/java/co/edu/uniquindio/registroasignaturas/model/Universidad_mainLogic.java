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

    public boolean loginUsuarioEstudiante(String user, String password) {
        boolean badera = false;
        for (Estudiante estudiante : getListaEstudiantes())
        {
            if (estudiante.getUsuario().equals(user) && estudiante.getPassword().equals(password))
            {
                badera = true;
                break;
            }
        }
        return  badera;
    }



    public Estudiante guardarEstudiante(Usuario usuario) {
        return null;
    }

    public Profesor guardarProfesor(Usuario usuario) {
        return null;
    }

    public boolean loginUsuarioProfesor(String user, String password) {
        boolean badera = false;
        for (Profesor profesor : getListaProfesores())
        {
            if (profesor.getUsuario().equals(user) && profesor.getPassword().equals(password))
            {
                badera = true;
                break;
            }
        }
        return  badera;
    }
}