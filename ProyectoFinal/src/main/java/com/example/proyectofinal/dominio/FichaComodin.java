package com.example.proyectofinal.dominio;

public class FichaComodin extends Ficha{
    private String simbolo;

    public FichaComodin() {
    }

    public FichaComodin(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }


}
