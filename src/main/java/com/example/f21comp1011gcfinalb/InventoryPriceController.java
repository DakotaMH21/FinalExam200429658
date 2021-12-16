package com.example.f21comp1011gcfinalb;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;

public class InventoryPriceController{

    @FXML
    private Label numOfCarsLabel;

    @FXML
    private Label avgPriceLabel;

    @FXML
    private ListView<PriceRange> priceListView;

    @FXML
    private ListView<Car> carListView;

    @FXML
    private RadioButton yearRadioButton;

    @FXML
    private RadioButton priceRadioButton;

    @FXML
    private Label headerLabel;


}
