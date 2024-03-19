package com.example.proyectofinal.dominio;

import java.util.List;

public class GrupoNumero extends Grupo{
    /**
     * Constructor con parámetros
     * @param listaFichas
     * @param modificado
     */
    public GrupoNumero(List<Ficha> listaFichas, boolean modificado) {
        super(listaFichas, modificado);
    }

    /**
     * Constructor vacio
     */
    public GrupoNumero() {
    }
}
