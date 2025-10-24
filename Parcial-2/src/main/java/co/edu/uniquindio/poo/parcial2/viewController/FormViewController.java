package co.edu.uniquindio.poo.parcial2.viewController;

import co.edu.uniquindio.poo.parcial2.app.App;
import co.edu.uniquindio.poo.parcial2.controller.FormController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;

public class FormViewController {
    FormController formController;
    ObservableList<String> propertesType = FXCollections.observableArrayList(
            "HOUSE", "APARTMENT", "ESTATE", "PREMISES"
    );


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comboBoxProperties;

    @FXML
    private TextField textFieldPropertyId;

    @FXML
    private TextField textFieldPropertyCity;

    @FXML
    private TextField textFieldPropertyRooms;

    @FXML
    private TextField textFieldPropertyFloors;


    @FXML
    private TextField textFieldPropertyPrice;


    @FXML
    private Button btnAddProperty;

    @FXML
    private Button btnReturn;

    @FXML
    private Button btnClean;

    @FXML
    private App app;

    @FXML
    public void setApp(App app) {
        this.app= app;
        formController = new FormController(App.realEstateFacade);
        initialize();
    }

    @FXML
    private void agregarLibro() {
        if (textFieldPropertyId.getText().isEmpty() ||
                comboBoxProperties.getSelectionModel().isEmpty() ||
                textFieldPropertyCity.getText().isEmpty() ||
                textFieldPropertyRooms.getText().isEmpty() ||
                textFieldPropertyFloors.getText().isEmpty() || textFieldPropertyPrice.getText().isEmpty()) {
            mostrarAlerta("Error", "All fields are required");
            return;
        }
        formController.addProperty(String.valueOf(comboBoxProperties.getValue()),textFieldPropertyCity.getText(),Integer.parseInt(textFieldPropertyRooms.getText()),Integer.parseInt(textFieldPropertyFloors.getText()),Integer.parseInt(textFieldPropertyPrice.getText()),textFieldPropertyId.getText());
        onClean();
    }

    @FXML
    public void initialize() {


        comboBoxProperties.setItems(propertesType);

    }


    @FXML
    void onClean() {
        textFieldPropertyId.clear();
        textFieldPropertyCity.clear();
        textFieldPropertyRooms.clear();
        textFieldPropertyFloors.clear();
        textFieldPropertyPrice.clear();
        comboBoxProperties.getSelectionModel().clearSelection();
    }

    @FXML
    void onReturn()  {
        app.openViewPrincipal();
    }

    private void mostrarAlerta(String title, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
