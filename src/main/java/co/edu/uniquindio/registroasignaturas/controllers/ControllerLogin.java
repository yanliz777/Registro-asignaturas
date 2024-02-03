package co.edu.uniquindio.registroasignaturas.controllers;

import co.edu.uniquindio.registroasignaturas.Main;
import co.edu.uniquindio.registroasignaturas.controllerSecond.ControllerLoginSecond;
import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;
import co.edu.uniquindio.registroasignaturas.fabrica.ModelFactory;
import co.edu.uniquindio.registroasignaturas.model.Universidad_mainLogic;
import co.edu.uniquindio.registroasignaturas.model.Usuario;
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
    public ModelFactory modelFactory = new ModelFactory();
    ControllerLoginSecond controllerLoginSecond;
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

        Usuario usuario = new Usuario();
        usuario.setUser(user);
        usuario.setPassword(password);

        if(cbxTypeUserLogin.getSelectionModel().getSelectedItem().equals(TipoUsuario.DOCENTE))
        {
            if (!(user.isEmpty() && password.isEmpty()))//si no están vacíos entran al if
            {
                boolean verificar = controllerLoginSecond.autentificar(user, password);

                if (verificar) {
                    cerrarVentana(btnLogin);//cierra la ventana del login
                    ventana.cargarVentanaDocente();//carga la ventana principal
                    //controllerPginaPrincipal.mostrarNombre(user);
                } else {
                    mostrarMensaje("Datos de acceso incorrectos", null, "Registrese !! o asegúrese de introducir  los datos correctos ",
                            Alert.AlertType.ERROR);
                }
            } else {
                mostrarMensaje("Dejo los campos vacíos", null, "Asegúrese en llenar los campos",
                        Alert.AlertType.ERROR);
            }
        }
        else if (cbxTypeUserLogin.getSelectionModel().getSelectedItem().equals(TipoUsuario.ESTUDIANTE))
        {
            if (!(user.isEmpty() && password.isEmpty()))//si no están vacíos entran al if
            {
                boolean verificar = controllerLoginSecond.autentificar(user, password);

                if (verificar) {
                    cerrarVentana(btnLogin);//cierra la ventana del login
                    ventana.cargarVentanaEstudiante();//carga la ventana principal
                    //controllerPginaPrincipal.mostrarNombre(user);
                } else {
                    mostrarMensaje("Datos de acceso incorrectos", null, "Registrese !! o asegúrese de introducir  los datos correctos ",
                            Alert.AlertType.ERROR);
                }
            }
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
     * Me permite mostrar en el combo box los Tipos de usuarios(Estudiante,Docente):
     */
    public void mostrarTiposUser()//para mostrar en el combo box
    {
        tipoUserObservableList.add(TipoUsuario.DOCENTE);
        tipoUserObservableList.add(TipoUsuario.ESTUDIANTE);
        //cargamos los tipos de productos en el combo box:
        cbxTypeUserLogin.setItems(tipoUserObservableList);
    }

    public void iniciar()
    {
        modelFactory = ModelFactory.getInstance();
        controllerLoginSecond = new ControllerLoginSecond(modelFactory);
        new ControllerLogin();
        mostrarTiposUser();
    }

    /**
     *Este método sirve para inicializar/empezar los elementos
     * que necesito agregar en la Gui, por ejemplo, los atributos
     * que necesito que se carguen en el comboBox(mostrarTiposUser()) que tenemos en el loginView
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        iniciar();
    }
}