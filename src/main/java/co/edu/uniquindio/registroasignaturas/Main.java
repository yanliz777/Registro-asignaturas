package co.edu.uniquindio.registroasignaturas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Este programa permitirá
 * que el estudiante registre asignaturas y los docentes puedan visualizar a los estudiantes
 * registrados en la universidad. También se podrá verl el valor total del semestre del estudiante
 * según las asignaturas ingresadas.
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 440);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public void cargarVentanaRegistro() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("RegistroView.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.centerOnScreen();
        stage2.setTitle("ventana registro");
        stage2.setScene(scene);
        stage2.setResizable(false);//para tener un tamaño único
        stage2.show();
    }

    public void cargarVentanaDocente() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ProfesorView.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.centerOnScreen();
        stage2.setTitle("ventana docentes");
        stage2.setScene(scene);
        stage2.setResizable(false);//para tener un tamaño único
        stage2.show();
    }

    public static void main(String[] args) {
        launch();
    }
}