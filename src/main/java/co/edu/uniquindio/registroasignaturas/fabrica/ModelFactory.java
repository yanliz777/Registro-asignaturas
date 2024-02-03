package co.edu.uniquindio.registroasignaturas.fabrica;

import co.edu.uniquindio.registroasignaturas.model.Estudiante;
import co.edu.uniquindio.registroasignaturas.model.Profesor;
import co.edu.uniquindio.registroasignaturas.model.Universidad_mainLogic;
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
    public void cargarDatosDesdeArchivos() {
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

    public boolean loginUsuarioEstudiante(String user, String password) {
        return true;
    }

    public boolean loginUsuarioProfesor(String user, String password) {
        return true;
    }

}
