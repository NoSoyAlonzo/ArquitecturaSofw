package com.example.proyectofinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ControladorJuegoP {

        @FXML
        private Button btnJugar;

        @FXML
        private AnchorPane txtJugador;

        @FXML
        void abrirVentana(ActionEvent event) {
            try{
                FXMLLoader fx = new FXMLLoader(this.getClass().getResource("MenuPrincipalJ.fxml"));
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
