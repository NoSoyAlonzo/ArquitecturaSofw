package com.example.proyectofinal.dominio;

public class FichaNumero extends Ficha{
    /**
     * Atributos de la clase
     */
    private int numero;

    /**
     * Constructor con parámetros
     * @param color
     * @param numero
     */
    public FichaNumero(ColorManager color, int numero) {
        super(color);
        this.numero = numero;
    }

    /**
     * Métodos get y set
     * @return
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
