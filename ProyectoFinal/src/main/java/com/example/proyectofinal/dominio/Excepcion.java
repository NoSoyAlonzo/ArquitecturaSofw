package com.example.proyectofinal.dominio;

import javafx.scene.control.Alert;

public class Excepcion {

    public Excepcion() {
    }

    public void mostrarExcepcion(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
