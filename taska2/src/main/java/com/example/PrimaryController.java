package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 * This class draws shapes on the main screen and lets us move to the next page.
 */
public class PrimaryController {

    // The pane is the area where we add our drawings.
    @FXML
    private Pane pane;

    /**
     * This runs automatically when the page loads.
     * It creates the letters and adds them to the screen.
     */
    @FXML
    public void initialize() {

        // These lines make the letter M.
        Line m1 = new Line(50, 150, 50, 50);
        Line m2 = new Line(50, 50, 90, 100);
        Line m3 = new Line(90, 100, 130, 50);
        Line m4 = new Line(130, 50, 130, 150);

        // These shapes make the letter R.
        Line r1 = new Line(180, 50, 180, 150);
        Circle r2 = new Circle(205, 75, 25);
        Line r3 = new Line(180, 100, 240, 150);

        // Give some shapes different colors so they stand out.
        r2.setStroke(Color.BLUE);
        m2.setStroke(Color.RED);
        m3.setStroke(Color.PINK);

        // Add all shapes to the pane so they appear on the screen.
        pane.getChildren().addAll(m1, m2, m3, m4, r1, r2, r3);

        // This prints a message to the console for testing.
        System.out.println("Hello World!");
    }

    /**
     * This method switches the app to the second screen.
     */
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
