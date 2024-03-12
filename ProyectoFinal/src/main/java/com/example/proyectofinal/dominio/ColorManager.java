package com.example.proyectofinal.dominio;

public class ColorManager {
    private BaseColor baseColor;
    private String colorSeleccionado;

    public ColorManager() {
    }

    public ColorManager(BaseColor baseColor, String colorSeleccionado) {
        this.baseColor = baseColor;
        this.colorSeleccionado = colorSeleccionado;
    }

    public BaseColor getBaseColor() {
        return baseColor;
    }

    public void setBaseColor(BaseColor baseColor) {
        this.baseColor = baseColor;
    }

    public String getColorSeleccionado() {
        return colorSeleccionado;
    }

    public void setColorSeleccionado(String colorSeleccionado) {
        this.colorSeleccionado = colorSeleccionado;
    }
}
