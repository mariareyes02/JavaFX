package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Starts the JavaFX application and provides helpers for loading its screens.
 */
public class App extends Application {

    private static Scene scene;

    /**
     * Loads the initial view, configures the main window, and displays it.
     *
     * @param primaryStage the main window supplied by the JavaFX runtime
     * @throws IOException if the initial FXML view cannot be loaded
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        primaryStage.setTitle("Hello FX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }

    /**
     * Replaces the content of the shared scene with the requested FXML view.
     *
     * @param fxml the view name, without the .fxml extension
     * @throws IOException if the requested FXML view cannot be loaded
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Loads an FXML file from the same package as this application class.
     *
     * @param fxml the view name, without the .fxml extension
     * @return the root node defined by the FXML file
     * @throws IOException if the FXML file cannot be loaded
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Application entry point; delegates startup to the JavaFX runtime.
     *
     * @param args command-line arguments passed to the application
     * @throws Exception if application startup fails
     */
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
