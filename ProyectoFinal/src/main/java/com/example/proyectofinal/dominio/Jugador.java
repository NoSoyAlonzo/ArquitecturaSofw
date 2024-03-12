package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombreUsuario;
    private String rutaAvatar;
    private List<Ficha> listaFichas = new ArrayList<>();
    private List<ColorManager> listaColoresSeleccionados = new ArrayList<>();
    private int score;

    public void quitarFicha(){};
    public void agregarFicha(Ficha ficha){};
    public void pasarTurno(){};
    public void modificarTurno(){};
    public void obtenerTurnoSiguiente(){};


}
