package com.example.proyectofinal.dominio;

import javafx.scene.paint.Color;

public class Ficha {

    /**
     * Atributos de la clase
     * Ficha
     */
    private ColorManager color;

    /**
     * Método constructor de una ficha
     * @param color
     */
    public Ficha(ColorManager color) {
        this.color = color;
    }

    /**
     * Gets y sets de
     * los atributos de
     * una ficha
     * @return
     */
    public ColorManager getColor() {
        return color;
    }

    public void setColor(ColorManager color) {
        this.color = color;
    }
}
