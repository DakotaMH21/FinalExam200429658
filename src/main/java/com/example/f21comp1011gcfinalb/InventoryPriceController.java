package com.example.f21comp1011gcfinalb;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.util.ResourceBundle;

public class InventoryPriceController implements Initializable {

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


    private void onLoadCarList(){
        carListView.getItems().clear();
        Dealership dealership = APIUtility.getFromJsonFile();
        if(dealership != null)
        {
            carListView.getItems().addAll(dealership.getStock());
            headerLabel.setText("Dealer: " + dealership.getDealer());

            int min =0;
            int max =19999;
            for (int i=0; i<=17; i++) {
                PriceRange range = new PriceRange(min, max);
                min += 20000;
                max += 20000;
                priceListView.getItems().add(range);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        onLoadCarList();
    }
}
