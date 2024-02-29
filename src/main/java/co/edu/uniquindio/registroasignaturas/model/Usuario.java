package co.edu.uniquindio.registroasignaturas.model;

import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;

public class Usuario extends Persona {
    //atributos:
    private TipoUsuario usuario;
    private String password;
    //constructor:
    public Usuario(){}

    //getters/setters:

    public TipoUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TipoUsuario usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
