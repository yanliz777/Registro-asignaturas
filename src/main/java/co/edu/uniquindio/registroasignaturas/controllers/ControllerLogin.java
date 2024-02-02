package co.edu.uniquindio.registroasignaturas.controllers;

import co.edu.uniquindio.registroasignaturas.Main;
import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private final ObservableList<TipoUsuario> tipoUserObservableList = FXCollections.observableArrayList();
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
    void btnLogin(ActionEvent event) throws IOException {
        TipoUsuario tipoUsuario = cbxTypeUserLogin.getSelectionModel().getSelectedItem();
        String user = txtUserLogin.getText();
        String password = txtPasswordLogin.getText();

        if(!(user.isEmpty() && password.isEmpty() ))//si no están vacíos entran al if
        {

            /*if(UsuarioLogic.autentificar(user,password))
            {
                cerrarVentana(btnLogin);//cierra la ventana del login
                ventana.cargarVentanaDocente();//carga la ventana principal
                //controllerPginaPrincipal.mostrarNombre(user);
            }
            else{
                mostrarMensaje("Datos de acceso incorrectos", null, "Registrese !! o asegúrese de introducir  los datos correctos ",
                        Alert.AlertType.ERROR);
            }*/
        }
        else {
            mostrarMensaje("Dejo los campos vacíos", null, "Asegúrese en llenar los campos",
                    Alert.AlertType.ERROR);
        }


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

    /**
     * Me permite mostrar en el combo box los Tipos de Producto:
     */
    public void mostrarTiposUser()//para mostrar en el combo box
    {
        tipoUserObservableList.add(TipoUsuario.DOCENTE);
        tipoUserObservableList.add(TipoUsuario.ESTUDIANTE);
        //cargamos los tipos de productos en el combo box:
        cbxTypeUserLogin.setItems(tipoUserObservableList);
    }

    /**
     *Este método sirve para inicializar/empezar los elementos
     * que necesito agregar en la Gui, por ejemplo, los atributos
     * que necesito que se carguen en el comboBox que tenemos en el loginView
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mostrarTiposUser();
    }
}