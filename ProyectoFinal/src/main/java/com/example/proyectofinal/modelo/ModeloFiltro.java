package com.example.proyectofinal.modelo;

import com.example.proyectofinal.dominio.Juego;
import com.example.proyectofinal.dominio.Pozo;
import com.example.proyectofinal.dominio.Tablero;

public interface ModeloFiltro {

    Pozo getPozo();
    Tablero getTablero();
    Juego getJuego();
}