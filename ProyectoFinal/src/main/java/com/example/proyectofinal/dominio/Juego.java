package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Juego {

    /**
     * Atributos de la clase Juego
     */
    private static Juego instanciaJuego;
    private Pozo pozo;
    private List<Jugador> listaJugador;
    private Ficha[] fichasCompletas;
    private Jugador jugadorTurno;

    /**
     * Método constructor de la clase
     * Juego con el singleton aplicado
     */
    private Juego(){
        pozo = Pozo.getInstance();
        listaJugador = new ArrayList<>();
        fichasCompletas =  new Ficha[106];
    }

    /**
     * Métodos get y set
     * @return
     */
    public Jugador getJugadorTurno() {
        return jugadorTurno;
    }

    public void setJugadorTurno(Jugador jugadorTurno) {
        this.jugadorTurno = jugadorTurno;
    }
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


    /**
     * Mpetodo que permite obtener una instancia de Juego
     * @return
     */
    public static synchronized Juego getInstance(){
        if (instanciaJuego == null){
            instanciaJuego = new Juego();
        }
        return instanciaJuego;
    }

    /**
     * Método para cambiar el turno del juego.
     * @return
     */
    public Jugador cambiarTurno(){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaJugador.size());
        return jugadorTurno = listaJugador.get(indiceAleatorio);
    }

    /**
     * Método para obtener el turno siguiente.
     */
    public void obtenerTurnoSiguiente(){
        cambiarTurno();
    };

    /**
     * Método para jalar una ficha del pozo
     */
    public void jalarFichaPozo(){
        pozo.validarPozoVacio();
    };

    /**
     * Método para agregar una ficha a un jugador
     * @param ficha
     */
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


}
