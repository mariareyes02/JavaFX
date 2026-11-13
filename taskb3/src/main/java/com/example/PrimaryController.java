package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.Random;
// this

public class PrimaryController {

    @FXML // dont forget to add this annotation, otherwise the pane will be null
    private VBox pane;
    int guessCount = 0;

    @FXML
    private void initialize() {

        // These will only work if you have (look up)
        Label label = new Label();

        Button button = new Button();
        button.setText("Guess");

        TextField textField = new TextField();
        textField.setPromptText("Please enter a guessing number");

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // generates a random number between 1 and 100

        Label guessesMade = new Label("How many guesses you've made: 0");

        // tells the button what to do when it is clicked
        // Event -> "When the button is clicked, run everything inside the brackets."
        button.setOnAction(event -> {

            // turns the string into an int
            String text = textField.getText();
            int guess = Integer.parseInt(text);

            if (guess > randomNumber) {
                label.setText("Too high");
            } else if (guess < randomNumber) {
                label.setText("Too low");
            } else {
                label.setText("You guessed the number correctly !!");
            }

            guessCount++;
            guessesMade.setText("How many guesses you've made: " + guessCount);
        });

        pane.getChildren().addAll(label, button, textField, guessesMade);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
