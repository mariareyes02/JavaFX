package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 * Builds the primary view's drawing and handles navigation to the next view.
 */
public class PrimaryController {

    // Injected from primary.fxml; contains the shapes drawn by this controller.
    @FXML
    private Pane pane;

    /** Creates the line and circle shapes when the primary view is loaded. */
    @FXML
    public void initialize() {

        // These connected lines form a stylized "M".
        Line m1 = new Line(50, 150, 50, 50);
        Line m2 = new Line(50, 50, 90, 100);
        Line m3 = new Line(90, 100, 130, 50);
        Line m4 = new Line(130, 50, 130, 150);

        // These shapes form a stylized "R": stem, rounded bowl, and diagonal leg.
        Line r1 = new Line(180, 50, 180, 150);
        Circle r2 = new Circle(205, 75, 25);
        Line r3 = new Line(180, 100, 240, 150);

        // Apply accent colors to selected parts of the drawing.
        r2.setStroke(Color.BLUE);
        m2.setStroke(Color.RED);
        m3.setStroke(Color.PINK);

        // Add all shapes to the pane so they appear in the primary view.
        pane.getChildren().addAll(m1, m2, m3, m4, r1, r2, r3);

        System.out.println("Hello World!");
    }

    /** Switches the displayed view to secondary.fxml. */
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
