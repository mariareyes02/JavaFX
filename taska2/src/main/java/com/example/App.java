package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This is the main class for the JavaFX app.
 * It starts the app and loads the first screen.
 */
public class App extends Application {

    // This keeps track of the current screen so we can switch pages.
    private static Scene scene;

    /**
     * This method runs when the app starts.
     * It loads the first FXML file and shows it on the screen.
     *
     * @param primaryStage the main window of the app
     * @throws IOException if the FXML file cannot be opened
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        primaryStage.setTitle("Hello FX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }

    /**
     * This method changes the screen to another FXML page.
     * For example, it can switch from the main page to the second page.
     *
     * @param fxml the name of the FXML file without the .fxml part
     * @throws IOException if the new page cannot load
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * This method loads an FXML file and returns its root object.
     * The root object is the main layout for that page.
     *
     * @param fxml the name of the FXML file without the .fxml part
     * @return the layout for the page
     * @throws IOException if the FXML file cannot be loaded
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * This is the starting point for the whole app.
     * It tells JavaFX to launch the application.
     *
     * @param args command-line arguments
     * @throws Exception if something goes wrong while starting the app
     */
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
