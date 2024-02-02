package co.edu.uniquindio.registroasignaturas.model;

import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;

public class Docente extends Usuario{
    public Docente(){}

    public Docente(String user, String password, String name, String lastName, String email, TipoUsuario tipo) {
        super(user, password, name, lastName, email, tipo);
    }
}
