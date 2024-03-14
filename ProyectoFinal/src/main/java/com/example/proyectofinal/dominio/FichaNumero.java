package com.example.proyectofinal.dominio;

public class FichaNumero extends Ficha{
    private int numero;

    public FichaNumero(ColorManager color, int numero) {
        super(color);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
