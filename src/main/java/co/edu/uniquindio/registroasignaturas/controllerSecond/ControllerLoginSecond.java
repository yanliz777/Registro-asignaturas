package co.edu.uniquindio.registroasignaturas.controllerSecond;

import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;
import co.edu.uniquindio.registroasignaturas.fabrica.ModelFactory;
import co.edu.uniquindio.registroasignaturas.model.Universidad_mainLogic;

public class ControllerLoginSecond {
    private Universidad_mainLogic universidad;
    private ModelFactory modelFactory;

    //constructor:
    public  ControllerLoginSecond(ModelFactory modelFactory) {
        this.modelFactory = modelFactory;
        universidad = modelFactory.getUniversidad();
    }

    //getters/setters:
    public Universidad_mainLogic getUniversidad() {
        return universidad;
    }
    public void setUniversidad(Universidad_mainLogic universidad) {
        this.universidad = universidad;
    }

    public boolean autentificar(String user, String password) {

        if (TipoUsuario.ESTUDIANTE.equals(user)){
            return modelFactory.loginUsuarioEstudiante(user,password);
        } else{
            return modelFactory.loginUsuarioProfesor(user,password);
        }
    }
}
