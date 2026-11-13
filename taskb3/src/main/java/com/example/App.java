package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */

/*
    This  starts the app and loads the first screen.
*/
public class App extends Application {

    // Keeps track of the current scene so that we can change it later.

    private static Scene scene;


    // This loads the first screen of the app and shows it to the user.
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        primaryStage.setTitle("Guessing Game");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }

    // This changes the first screen to the second screen when called.
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    // This loads the FXML file and returns the root node of the scene graph.
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    // Launches the JavaFX application.
    public static void main(String[] args) {
        launch(args);
    }

}