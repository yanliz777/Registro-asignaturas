package co.edu.uniquindio.registroasignaturas.controllers;

import co.edu.uniquindio.registroasignaturas.Main;
import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerLogin {

    Main Ventana = new Main();//para darle manejo a las ventanas

    ControllerRegistro controllerRegistro = new ControllerRegistro();//para comunicarnos con este

    @FXML
    private ComboBox<TipoUsuario> cbxTypeUserLogin;

    @FXML
    private TextField txtPasswordLogin;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtUserLogin;

    @FXML
    private Button btnRegister;

    @FXML
    void btnLogin(ActionEvent event) {

    }

    @FXML
    void btnRegister(ActionEvent event) {

    }
}