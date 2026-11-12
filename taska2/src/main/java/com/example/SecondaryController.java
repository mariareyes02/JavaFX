package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

/** Handles navigation actions on the secondary view. */
public class SecondaryController {

    /** Returns to the primary view when its navigation action is triggered. */
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
