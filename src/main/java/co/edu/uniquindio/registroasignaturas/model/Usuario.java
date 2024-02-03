package co.edu.uniquindio.registroasignaturas.model;

import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;

public class Usuario extends Persona {
    //atributos:
    private TipoUsuario tipoUsuario;
    private String user;
    private String password;
    //constructor:
    public Usuario(){}

    //getters/setters:
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
