package com.example.proyectofinal.dominio;

public class FichaComodin extends Ficha{
    /**
     * Atributos de la clase
     */
    private String simbolo;

    /**
     * Constructor con parámetros
     * @param color
     * @param simbolo
     */
    public FichaComodin(ColorManager color, String simbolo) {
        super(color);
        this.simbolo = simbolo;
    }

    /**
     * Métodos get y set
     * @return
     */
    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }


}
