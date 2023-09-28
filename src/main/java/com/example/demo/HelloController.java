package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

@FXML
private Button exitButton;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void onHelloHamzaButtonClick() {
        welcomeText.setText("Hello Hamza!");
    }
    
    @FXML
    protected void setExitButton() {
        exitButton.setOnAction(event -> {
            System.exit(0);
        });
    }
}