package com.example.proyectofinal.dominio;

public class ColorManager {
    /**
     * Atributos de la clase
     */
    private BaseColor baseColor;
    private String colorSeleccionado;

    /**
     * Constructor de la clase
     */
    public ColorManager() {
    }

    /**
     * Constructor que recibe parámetros
     * @param baseColor
     * @param colorSeleccionado
     */
    public ColorManager(BaseColor baseColor, String colorSeleccionado) {
        this.baseColor = baseColor;
        this.colorSeleccionado = colorSeleccionado;
    }

    /**
     * Métodos get y set
     * @return
     */
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
