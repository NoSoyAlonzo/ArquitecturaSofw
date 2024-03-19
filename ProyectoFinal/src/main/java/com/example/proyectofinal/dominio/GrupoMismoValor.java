package com.example.proyectofinal.dominio;

import java.util.List;

public class GrupoMismoValor extends Grupo{
    /**
     * Constructor de la clase
     * @param listaFichas
     * @param modificado
     */
    public GrupoMismoValor(List<Ficha> listaFichas, boolean modificado) {
        super(listaFichas, modificado);
    }

    /**
     * Constructor vacio
     */
    public GrupoMismoValor() {
    }


}
