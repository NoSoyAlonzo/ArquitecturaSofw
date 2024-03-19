package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pozo {

    /**
     * Atributos de la clase
     */
    private static Pozo instanciaPozo;
    private Juego juego;
    Excepcion exc;
    private List<Ficha> listaFichas;

    /**
     * Método constructor de la clase
     * en este se aplicó el singleton
     */
    private Pozo(){
        listaFichas = new ArrayList <Ficha>();
        exc = new Excepcion();
        juego = Juego.getInstance();
    }


    /**
     * Método para obtener una instancia de pozo
     * @return
     */
    public static synchronized Pozo getInstance(){
        if (instanciaPozo == null){
            instanciaPozo = new Pozo();
        }
        return instanciaPozo;
    }

    /**
     * Método para validar si el pozo está vacio
     */
    public void validarPozoVacio(){
        if (listaFichas == null || listaFichas.isEmpty()) {
            exc.mostrarExcepcion("Pozo", "Pozo vacío");
        }else{
            juego.pasarFichaJugador(quitarFichaAleatoria());
        }
    }

    /**
     * Método para quitar una ficha aleatoriamente
     * @return
     */
    public Ficha quitarFichaAleatoria() {
        Ficha fichaObtenida;
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaFichas.size());
        fichaObtenida = listaFichas.get(indiceAleatorio);
        listaFichas.remove(indiceAleatorio);
        return fichaObtenida;
    }


}
