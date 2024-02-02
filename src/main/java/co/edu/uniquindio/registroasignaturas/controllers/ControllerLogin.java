package co.edu.uniquindio.registroasignaturas.controllers;

import co.edu.uniquindio.registroasignaturas.Main;
import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLogin implements Initializable {

    Main ventana = new Main();//para darle manejo a las ventanas

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
    void btnRegister(ActionEvent event) throws IOException {
        cerrarVentana(btnLogin);//Me permite cerrar la ventana del login
        //para así darle apertura a la ventana de registro y no tener tantas ventanas abiertas.
        ventana.cargarVentanaRegistro();
    }

    private void mostrarMensaje(String titulo, String head, String content, Alert.AlertType tipo) {
        Alert alerta = new Alert(null);
        alerta.setTitle(titulo);
        alerta.setHeaderText(head);
        alerta.setContentText(content);
        alerta.setAlertType(tipo);
        alerta.show();
    }

    /**
     *Método que me permite cerrar una ventana
     * para darle apertura a otra y de esta manera no tener
     * varias ventanas abiertas, el botón que le envía por parámetro
     * es el de la ventana actual que sería el que se cierra
     */
    public void cerrarVentana(Button btn) {
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}