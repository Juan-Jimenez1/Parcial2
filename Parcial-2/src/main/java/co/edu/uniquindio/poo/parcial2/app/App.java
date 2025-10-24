package co.edu.uniquindio.poo.parcial2.app;

import co.edu.uniquindio.poo.parcial2.model.RealEstate;
import co.edu.uniquindio.poo.parcial2.model.RealEstateFacade;
import co.edu.uniquindio.poo.parcial2.viewController.FormViewController;
import co.edu.uniquindio.poo.parcial2.viewController.PrincipalViewController;
import co.edu.uniquindio.poo.parcial2.viewController.PropertyViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private Stage primaryStage;
    public static RealEstate realEstate = RealEstate.getInstance();
    public static RealEstateFacade realEstateFacade = new RealEstateFacade();

    public void openViewPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/parcial2/PrincipalView.fxml"));
            AnchorPane rootLayout = loader.load();
            PrincipalViewController principalViewController = loader.getController();
            principalViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openFormView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/parcial2/FormProperty.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            FormViewController formViewController = loader.getController();
            formViewController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openTableView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/parcial2/PropertyTable.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            PropertyViewController propertyViewController = loader.getController();
            propertyViewController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Real Estate");
        openViewPrincipal();
    }

    public static void main(String[] args) {

        RealEstate realEstate = RealEstate.getInstance();
        realEstate.registerProperty("house","armenia",2,1,2000000,"1213");
        launch(args);
    }
}
