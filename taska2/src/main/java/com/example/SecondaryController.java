package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 * This class controls the second screen.
 * It has the button action to go back to the first screen.
 */
public class SecondaryController {

    /**
     * This method is called when the user wants to return to the main screen.
     */
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
