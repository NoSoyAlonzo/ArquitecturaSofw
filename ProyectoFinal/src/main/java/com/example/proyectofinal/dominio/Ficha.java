package com.example.proyectofinal.dominio;

import javafx.scene.paint.Color;

public class Ficha {

    private ColorManager color;

    public Ficha(ColorManager color) {
        this.color = color;
    }

    public ColorManager getColor() {
        return color;
    }

    public void setColor(ColorManager color) {
        this.color = color;
    }
}
