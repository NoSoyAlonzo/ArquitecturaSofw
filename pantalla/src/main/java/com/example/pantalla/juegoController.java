package com.example.pantalla;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class juegoController {
    public Button stile;

    @FXML
    protected void onsile(){

        prueba.setText("sdasdasd");
    }
    @FXML
    private Label prueba;




    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}