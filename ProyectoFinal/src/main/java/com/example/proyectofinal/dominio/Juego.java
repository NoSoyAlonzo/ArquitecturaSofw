package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private static Juego instanciaJuego;
    private Pozo pozo;
    private List<Jugador> listaJugador;

    private Juego(){
        pozo = Pozo.getInstance();
        listaJugador = new ArrayList<>();
    }

    public static synchronized Juego getInstance(){
        if (instanciaJuego == null){
            instanciaJuego = new Juego();
        }
        return instanciaJuego;
    }
    public void cambiarTurno(){};
    public void obtenerTurnoSiguiente(){};
    public void jalarFichasPozo(){};
    public void pasarFichaJugador(){};
}
