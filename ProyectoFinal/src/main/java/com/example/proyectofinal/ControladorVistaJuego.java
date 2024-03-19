package com.example.proyectofinal;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControladorVista {
    @FXML
    private Label welcomeText;
    @FXML
    public void OpenGame(){

    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}