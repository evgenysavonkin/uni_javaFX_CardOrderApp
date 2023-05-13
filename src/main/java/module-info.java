module com.example.igor5lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.igor5lab to javafx.fxml;
    exports com.example.igor5lab;
}