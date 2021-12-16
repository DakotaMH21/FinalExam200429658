module com.example.f21comp1011gcfinalb {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;


    opens com.example.f21comp1011gcfinalb to javafx.fxml;
    exports com.example.f21comp1011gcfinalb;
}