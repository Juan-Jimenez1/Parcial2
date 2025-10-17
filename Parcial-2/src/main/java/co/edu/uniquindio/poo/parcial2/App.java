package co.edu.uniquindio.poo.parcial2;

import co.edu.uniquindio.poo.parcial2.model.RealEstate;
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

    private void openViewPrincipal() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("PropertyTable.fxml"));
            AnchorPane rootLayout = loader.load();
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
        this.primaryStage.setTitle("Biblioteca UQ");
        openViewPrincipal();
    }

    public static void main(String[] args) {

        RealEstate realEstate = RealEstate.getInstance();
        realEstate.registerProperty("house","armenia",2,1,2000000,"1213");
        launch(args);
    }
}
