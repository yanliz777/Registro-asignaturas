package co.edu.uniquindio.registroasignaturas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}