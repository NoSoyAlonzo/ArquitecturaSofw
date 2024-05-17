package com.example.proyectofinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//Clase que controla la pantalla del Lobby
public class controladorLobby {

    @FXML
    private Button botonSeleccionarFicha1;

    @FXML
    private Button botonSeleccionarFicha2;

    @FXML
    private Button botonSeleccionarFicha3;

    @FXML
    private Button botonSeleccionarFicha4;

    @FXML
    private Button btnIniciar;

    @FXML
    private CheckBox checkboxListo1;

    @FXML
    private CheckBox checkboxListo2;

    @FXML
    private CheckBox checkboxListo3;

    @FXML
    private CheckBox checkboxListo4;

    @FXML
    private Label labelContadorJugadores;

    @FXML
    private Label labelTitulo;

    @FXML
    void abrirJuego(ActionEvent event) {
        try{
            FXMLLoader fx = new FXMLLoader(this.getClass().getResource("juegoView.fxml"));
            Parent root1=(Parent) fx.load();
            Stage stage= new Stage();
            stage.setTitle("");
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch(Exception e){
            System.out.println("No se pudo abrir");
        }
    }

}