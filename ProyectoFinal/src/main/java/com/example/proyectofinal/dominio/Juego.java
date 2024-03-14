package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Juego {

    private static Juego instanciaJuego;
    private Pozo pozo;
    private List<Jugador> listaJugador;
    private Ficha[] fichasCompletas;
    private Jugador jugadorTurno;


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

    public Jugador cambiarTurno(){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaJugador.size());
        return jugadorTurno = listaJugador.get(indiceAleatorio);
    }

    public void obtenerTurnoSiguiente(){
        cambiarTurno();
    };

    public void jalarFichaPozo(){
        pozo.validarPozoVacio();
    };

    public void pasarFichaJugador(Ficha ficha){
        if (ficha != null) {
            for (int i = 0; i < listaJugador.size(); i++) {
                if (listaJugador.get(i).getNombreUsuario().equalsIgnoreCase(jugadorTurno.getNombreUsuario())) {
                    listaJugador.get(i).agregarFicha(ficha);
                }
            }
            cambiarTurno();
        }else{
            throw new IllegalStateException("Objeto ficha vacío");
        }
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
