package com.example.proyectofinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class PrincipalR extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalR.class.getResource("juegoView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 920, 750);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        // estilo css
        String cpp=this.getClass().getResource("estilo.css").toExternalForm();
        scene.getStylesheets().add(cpp);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}