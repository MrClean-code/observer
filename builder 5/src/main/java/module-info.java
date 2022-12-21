module com.example.task5_stroitel {
    requires javafx.controls;
    requires javafx.fxml;


    opens builder to javafx.fxml;
    exports builder;
    exports model;
    opens model to javafx.fxml;
}