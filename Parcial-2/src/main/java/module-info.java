module co.edu.uniquindio.poo.parcial2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens co.edu.uniquindio.poo.parcial2.viewController to javafx.fxml;
    opens co.edu.uniquindio.poo.parcial2 to javafx.fxml;
    exports co.edu.uniquindio.poo.parcial2;
}