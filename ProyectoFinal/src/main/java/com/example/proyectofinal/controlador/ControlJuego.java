package com.example.proyectofinal.controlador;

import com.example.proyectofinal.modelo.ModeloJuego;

public class ControlJuego {

    private static ControlJuego instanciaControlJuego;
    private ModeloJuego modeloJuego;

    private ControlJuego(){
        modeloJuego = modeloJuego.getInstance();
    }

    public static synchronized ControlJuego getInstance(){
        if (instanciaControlJuego == null){
            instanciaControlJuego = new ControlJuego();
        }
        return instanciaControlJuego;
    }

    public void dividirGrupo(){};
    public void terminarTurno(){};
    public void jalarFichaPozo(){};
    public void pasarTurnoJugador(){};
    public void colocarFichaGrupo(){};

}
