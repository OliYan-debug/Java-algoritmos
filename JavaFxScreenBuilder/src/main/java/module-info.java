module com.example.javafxscreenbuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxscreenbuilder to javafx.fxml;
    exports com.example.javafxscreenbuilder;
}