package com.example.proyectofinal.dominio;

import javafx.scene.control.Alert;

public class Excepcion {

    /**
     * Constructor de la clase
     */
    public Excepcion() {
    }

    /**
     * Método que muestra un mensaje
     * @param titulo
     * @param mensaje
     */
    public void mostrarExcepcion(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
