package com.example.proyectofinal.broker;

import com.example.proyectofinal.Eventos.EventHandler;
import com.example.proyectofinal.dominio.Juego;

public class broker {
    private Juego juego;
    public broker(){

         juego=Juego.getInstance();
    }
    public void jalarFichaPozo(){
        juego.jalarFichaPozo();
    }

    public void pasarTurno(){

        juego.obtenerTurnoSiguiente();
    }


}
