package com.example.proyectofinal.vista;

import com.example.proyectofinal.PrincipalR;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipalJ extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalR.class.getResource("juegoView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ProyectoFinal");
        stage.setScene(scene);
        stage.show();
    }
    public static void main (String[]args){
        launch();
    }
}
