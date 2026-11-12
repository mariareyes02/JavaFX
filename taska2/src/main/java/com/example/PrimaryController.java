package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML
    private Pane pane;

    @FXML
    public void initialize() {

        Line m1 = new Line(50, 150, 50, 50);
        Line m2 = new Line(50, 50, 90, 100);
        Line m3 = new Line(90, 100, 130, 50);
        Line m4 = new Line(130, 50, 130, 150);

        Line r1 = new Line(180, 50, 180, 150);
        Circle r2 = new Circle(205, 75, 25);
        Line r3 = new Line(180, 100, 240, 150);

        r2.setStroke(Color.BLUE);
        m2.setStroke(Color.RED);
        m3.setStroke(Color.PINK);

        pane.getChildren().addAll(m1, m2, m3, m4, r1, r2, r3);

        System.out.println("Hello World!");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
