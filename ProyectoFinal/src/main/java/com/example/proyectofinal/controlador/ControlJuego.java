package com.example.proyectofinal.controlador;

import com.example.proyectofinal.dominio.Ficha;
import com.example.proyectofinal.dominio.Grupo;
import com.example.proyectofinal.modelo.ModeloJuego;

import java.util.List;

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

    public void dividirGrupo(Grupo grupo){
        modeloJuego.dividirGrupo(grupo);
    };

    public void terminarTurno(){modeloJuego.validarGrupos();};
    public void jalarFichaPozo(){
        modeloJuego.jalarFichaPozo();
    };
    public void pasarTurnoJugador(){
        modeloJuego.pasarTurno();
    };
    //public void colocarFichaGrupo(){modeloJuego.verifColocarFichaGrupo();}

}
