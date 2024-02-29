package co.edu.uniquindio.registroasignaturas.controllerSecond;

import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;
import co.edu.uniquindio.registroasignaturas.fabrica.ModelFactory;
import co.edu.uniquindio.registroasignaturas.model.Universidad_mainLogic;
import co.edu.uniquindio.registroasignaturas.model.Usuario;

public class guardarUsuarioControladorSecundario {
    private ModelFactory modelFactory;
    private Universidad_mainLogic universidad_mainLogic;

    public guardarUsuarioControladorSecundario(ModelFactory modelFactory) {
        this.modelFactory = modelFactory;
        universidad_mainLogic = modelFactory.getUniversidad();
    }

    public Usuario guardarUsuario(Usuario usuario) {
        if (usuario.getUsuario().equals(TipoUsuario.ESTUDIANTE)){
            return modelFactory.guardarEstudiante(usuario);
        }
        else {
            return  modelFactory.guardarDocente(usuario);
        }
    }
}
