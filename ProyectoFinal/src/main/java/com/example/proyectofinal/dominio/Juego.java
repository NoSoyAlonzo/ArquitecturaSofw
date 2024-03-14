package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private static Juego instanciaJuego;
    private Pozo pozo;
    private List<Jugador> listaJugador;
    private Ficha[] fichasCompletas;

    private Juego(){
        pozo = Pozo.getInstance();
        listaJugador = new ArrayList<>();
        fichasCompletas =  new Ficha[106];
    }

    public static synchronized Juego getInstance(){
        if (instanciaJuego == null){
            instanciaJuego = new Juego();
        }
        return instanciaJuego;
    }
    public void cambiarTurno(){};
    public void obtenerTurnoSiguiente(){};
    public void jalarFichaPozo(){
        pozo.validarPozoVacio();
    };
    public void pasarFichaJugador(Ficha ficha){
        lis
    };

    public Pozo getPozo() {
        return pozo;
    }

    public void setPozo(Pozo pozo) {
        this.pozo = pozo;
    }

    public List<Jugador> getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(List<Jugador> listaJugador) {
        this.listaJugador = listaJugador;
    }
}
