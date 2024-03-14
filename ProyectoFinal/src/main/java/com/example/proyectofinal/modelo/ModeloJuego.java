package com.example.proyectofinal.modelo;

import com.example.proyectofinal.dominio.*;


public class ModeloJuego {

    private static ModeloJuego instanciaModeloJuego;
    private Pozo pozo;
    private Tablero tablero;
    private Juego juego;

    private ModeloJuego(){
        pozo = Pozo.getInstance();
        tablero = Tablero.getInstance();
        juego = Juego.getInstance();
    }

    public static synchronized ModeloJuego getInstance(){
        if (instanciaModeloJuego == null){
            instanciaModeloJuego = new ModeloJuego();
        }
        return instanciaModeloJuego;
    }

    //metodos
    public void dividirGrupo(){
        tablero.obtenerGrupoDividido();
    }

    public void verifColocarFichaGrupo(){
        tablero.obtenerGrupoDividido();
    }

    public void validarGrupos(){
        tablero.obtenerGruposModificados();
    }

    public void jalarFichaPozo(){
        juego.jalarFichaPozo();
    }

    public void pasarTurno(){
        juego.obtenerTurnoSiguiente();
    }

}
