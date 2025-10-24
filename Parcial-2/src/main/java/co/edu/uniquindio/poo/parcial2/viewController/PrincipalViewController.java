package co.edu.uniquindio.poo.parcial2.viewController;

import co.edu.uniquindio.poo.parcial2.app.App;
import javafx.fxml.FXML;

import java.awt.*;

public class PrincipalViewController {

    @FXML
    private Button btnForm;

    @FXML
    private Button btnProperty;

    @FXML
    private App app;


    @FXML
    public void setApp(App app) {
        this.app= app;
    }

    @FXML
    public void onOpenForm(){
        app.openFormView();
    }
    @FXML
    public void onOpenTableProperty(){
        app.openTableView();
    }
}
