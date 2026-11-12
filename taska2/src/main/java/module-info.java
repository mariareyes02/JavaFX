// Declares the Java module and the JavaFX modules it depends on.
module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    // Allow FXML to access controller members annotated with @FXML.
    opens com.example to javafx.fxml;

    // Make the application's package available to other modules.
    exports com.example;
}
