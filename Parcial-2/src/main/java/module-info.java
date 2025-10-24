module co.edu.uniquindio.poo.parcial2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.desktop;

    opens co.edu.uniquindio.poo.parcial2.viewController to javafx.fxml;
    exports co.edu.uniquindio.poo.parcial2.app;
    opens co.edu.uniquindio.poo.parcial2.app to javafx.fxml;
}