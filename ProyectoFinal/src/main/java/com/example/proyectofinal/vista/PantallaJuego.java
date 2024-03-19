package com.example.proyectofinal.vista;

import com.example.proyectofinal.controlador.ControlJuego;
import com.example.proyectofinal.modelo.ModeloFiltro;
import com.example.proyectofinal.modelo.Observador;

public class PantallaJuego implements Observador {
    private static PantallaJuego instanciaPantallaJuego;
    private ControlJuego controlJuego;

    private PantallaJuego(){
        controlJuego = ControlJuego.getInstance();
    }

    public static synchronized PantallaJuego getInstance(){
        if (instanciaPantallaJuego == null){
            instanciaPantallaJuego = new PantallaJuego();
        }
        return instanciaPantallaJuego;
    }

    public void notificarCambios(){};
    public void clickPasarTurno(){};
    public void clickJalarFicha(){};
    public void clickDividirGrupo(){};
    public void clickPonerFicha(){};
    public void clickTerminarTurno(){};

    public void update(ModeloFiltro modeloFiltro) {

    }

    @Override
    public void actualizar() {

    }


}
