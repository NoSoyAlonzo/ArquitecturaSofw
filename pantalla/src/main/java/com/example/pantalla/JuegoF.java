package com.example.pantalla;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class JuegoF extends Application {
    private ImageView imageb;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JuegoF.class.getResource("pantallaJuego.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 900);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        //imagen background
       // Image imag=null;
       // imag = new Image(new FileInputStream("/com.example.pantalla.imagenes/player.png"));
        //this.imageb.setFitHeight(450);
        //this.imageb.setFitWidth(400);

        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}