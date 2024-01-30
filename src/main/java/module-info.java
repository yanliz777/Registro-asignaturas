module co.edu.uniquindio.registroasignaturas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.desktop;


    opens co.edu.uniquindio.registroasignaturas to javafx.fxml;
    exports co.edu.uniquindio.registroasignaturas;
    exports co.edu.uniquindio.registroasignaturas.controllers;
    opens co.edu.uniquindio.registroasignaturas.controllers to javafx.fxml;
}