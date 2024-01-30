package co.edu.uniquindio.registroasignaturas.model;

import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;

public class Estudiante extends Usuario{
    public Estudiante(){}

    public Estudiante(String user, String password, String name, String lastName, String email, TipoUsuario tipo) {
        super(user, password, name, lastName, email, tipo);
    }
}
