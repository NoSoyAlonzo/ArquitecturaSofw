package com.example.proyectofinal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class MainF extends  Application{
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmload=new FXMLLoader(MainF.class.getResource("JuegoPrincipal.fxml"));
        Scene scene = new Scene(fxmload.load());
        stage.setTitle("Pantalla Menu Principal");
        stage.setScene(scene);
        stage.show();
    }
    public static void main (String[]args){launch();}
}
