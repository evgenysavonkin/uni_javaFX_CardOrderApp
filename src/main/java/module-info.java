module com.example.igor5lab {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.evgeny.order to javafx.fxml;
    exports com.evgeny.order;
}