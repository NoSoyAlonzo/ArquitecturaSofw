package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pozo {

    private static Pozo instanciaPozo;
    private List<Ficha> listaFichas;

    private Pozo(){
        listaFichas = new ArrayList <Ficha>();
    }
    //metodos
    public static synchronized Pozo getInstance(){
        if (instanciaPozo == null){
            instanciaPozo = new Pozo();
        }
        return instanciaPozo;
    }
    public void quitarFicha(){}
    public void validarPozoVacio(){}
    public void jalarFicha(){};


}
