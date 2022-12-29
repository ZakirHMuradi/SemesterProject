module com.example.caloriescalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.caloriescalculator to javafx.fxml;
    exports com.example.caloriescalculator;
}