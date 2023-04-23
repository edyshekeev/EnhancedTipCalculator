module com.example.enhancedtipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.enhancedtipcalculator to javafx.fxml;
    exports com.example.enhancedtipcalculator;
}