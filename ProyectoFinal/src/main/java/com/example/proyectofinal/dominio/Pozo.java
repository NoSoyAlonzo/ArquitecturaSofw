package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pozo {

    private static Pozo instanciaPozo;
    private Juego juego;
    Excepcion exc;
    private List<Ficha> listaFichas;

    private Pozo(){
        listaFichas = new ArrayList <Ficha>();
        exc = new Excepcion();
        juego = Juego.getInstance();
    }


    //metodos
    public static synchronized Pozo getInstance(){
        if (instanciaPozo == null){
            instanciaPozo = new Pozo();
        }
        return instanciaPozo;
    }
    public void quitarFicha(){}
    public void validarPozoVacio(){
        if (listaFichas == null || listaFichas.isEmpty()) {
            exc.mostrarExcepcion("Pozo", "Pozo vacío");
        }else{
            juego.pasarFichaJugador(quitarFichaAleatoria());
        }
    }
    public void jalarFicha(){};

    public Ficha quitarFichaAleatoria() {
        Ficha fichaObtenida;
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaFichas.size());
        fichaObtenida = listaFichas.get(indiceAleatorio);
        listaFichas.remove(indiceAleatorio);
        return fichaObtenida;
    }


}
