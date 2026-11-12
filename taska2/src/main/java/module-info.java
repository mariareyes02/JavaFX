// This file tells Java which modules the app needs to run.
// JavaFX is required so the app can create windows and UI elements.
module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    // This lets FXML files access fields and methods with @FXML.
    opens com.example to javafx.fxml;

    // This makes the package usable by other parts of the program.
    exports com.example;
}
