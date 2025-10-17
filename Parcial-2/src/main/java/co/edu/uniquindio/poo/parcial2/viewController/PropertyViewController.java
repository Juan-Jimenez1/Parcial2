package co.edu.uniquindio.poo.parcial2.viewController;

import co.edu.uniquindio.poo.parcial2.App;
import co.edu.uniquindio.poo.parcial2.controller.PropertyController;
import co.edu.uniquindio.poo.parcial2.model.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class PropertyViewController {
   PropertyController propertyController;
    ObservableList<Property> listProperties = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Property> propertyTable;

    @FXML
    private TableColumn<Property, String> typeColumn;

    @FXML
    private TableColumn<Property, String> cityColumn;

    @FXML
    private TableColumn<Property, Integer> roomsColumn;

    @FXML
    private TableColumn<Property, Integer> floorsColumn;

    @FXML
    private TableColumn<Property, Double> priceColumn;
    @FXML
    private App app;

    @FXML
    void initView() {


        initDataBinding();


        obtenerLibrosDigitales();


        propertyTable.getItems().clear();


        propertyTable.setItems(listProperties);


    }

    private void obtenerLibrosDigitales() {
        listProperties.addAll(propertyController.getProperties());
    }

    @FXML
    public void setApp(App app) {
        this.app= app;
        propertyController = new PropertyController(App.realEstate);
        initView();
    }

    @FXML
    public void initDataBinding() {
        typeColumn.setCellValueFactory(celda -> new javafx.beans.property.SimpleStringProperty(celda.getValue().getPropertyType().toString()));
        cityColumn.setCellValueFactory(celda -> new javafx.beans.property.SimpleStringProperty(celda.getValue().getCity()));
        roomsColumn.setCellValueFactory(celda -> new javafx.beans.property.SimpleIntegerProperty(celda.getValue().getRooms()).asObject());
        floorsColumn.setCellValueFactory(celda -> new javafx.beans.property.SimpleIntegerProperty(celda.getValue().getFloors()).asObject());
        priceColumn.setCellValueFactory(celda -> new javafx.beans.property.SimpleDoubleProperty(celda.getValue().getPrice()).asObject());
    }




}
