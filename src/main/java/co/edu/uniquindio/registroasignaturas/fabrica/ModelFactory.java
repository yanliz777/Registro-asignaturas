package co.edu.uniquindio.registroasignaturas.fabrica;

import co.edu.uniquindio.registroasignaturas.model.Estudiante;
import co.edu.uniquindio.registroasignaturas.model.Profesor;
import co.edu.uniquindio.registroasignaturas.model.Universidad_mainLogic;
import co.edu.uniquindio.registroasignaturas.model.Usuario;
import co.edu.uniquindio.registroasignaturas.persistencia.Persistencia;

import java.io.IOException;
import java.util.ArrayList;

public class ModelFactory
{
    private Persistencia persistencia = new Persistencia();
    public Universidad_mainLogic universidad;

    //constructor:
    public ModelFactory() {
        cargarDatosDesdeArchivos();
    }

    public static class SingletonHolder {
        private final static ModelFactory eINSTANCE = new ModelFactory();
    }
    public static ModelFactory getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    //getters/setters:
    public Persistencia getPersistencia() {
        return persistencia;
    }
    public void setPersistencia(Persistencia persistencia) {
        this.persistencia = persistencia;
    }
    public Universidad_mainLogic getUniversidad() {
        return universidad;
    }
    public void setUniversidad(Universidad_mainLogic universidad) {
        this.universidad = universidad;
    }
    public void cargarDatosDesdeArchivos()
    {
        this.universidad = new Universidad_mainLogic();
        try {
            ArrayList<Estudiante> estudiantes;
            ArrayList<Profesor> profesors;

            estudiantes = persistencia.leerEstudiante();
            profesors = persistencia.leerDocente();

            getUniversidad().getListaEstudiantes().addAll(estudiantes);
            getUniversidad().getListaProfesores().addAll(profesors);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Usuario guardarEstudiante(Usuario usuario) {
        Estudiante est = null;
        try {
            est = getUniversidad().guardarEstudiante(usuario);
            persistencia.guardarEstudiantes(getUniversidad().getListaEstudiantes());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return est;
    }
    public Usuario guardarDocente(Usuario usuario) {
        Profesor profesor = null;
        try {
            profesor = getUniversidad().guardarProfesor(usuario);
            persistencia.guardarDocente(getUniversidad().getListaProfesores());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return profesor;
    }

    public boolean loginUsuarioEstudiante(String user, String password) {
        boolean bandera = false;
            
        try
        {
            bandera = getUniversidad().loginUsuarioEstudiante(user,password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
            return bandera;

    }

    public boolean loginUsuarioProfesor(String user, String password) {
        boolean bandera = false;

        try
        {
            bandera = getUniversidad().loginUsuarioProfesor(user,password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return bandera;

    }

}
