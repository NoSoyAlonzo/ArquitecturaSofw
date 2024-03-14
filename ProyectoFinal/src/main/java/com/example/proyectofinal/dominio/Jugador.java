package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombreUsuario;
    private String rutaAvatar;
    private List<Ficha> listaFichas;
    private List<ColorManager> listaColoresSeleccionados;
    private int score;

    public Jugador(String nombreUsuario, String rutaAvatar, List<Ficha> listaFichas, List<ColorManager> listaColoresSeleccionados, int score) {
        this.nombreUsuario = nombreUsuario;
        this.rutaAvatar = rutaAvatar;
        this.listaFichas = new ArrayList<>();;
        this.listaColoresSeleccionados = new ArrayList<>();
        this.score = score;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getRutaAvatar() {
        return rutaAvatar;
    }

    public void setRutaAvatar(String rutaAvatar) {
        this.rutaAvatar = rutaAvatar;
    }

    public List<Ficha> getListaFichas() {
        return listaFichas;
    }

    public void setListaFichas(List<Ficha> listaFichas) {
        this.listaFichas = listaFichas;
    }

    public List<ColorManager> getListaColoresSeleccionados() {
        return listaColoresSeleccionados;
    }

    public void setListaColoresSeleccionados(List<ColorManager> listaColoresSeleccionados) {
        this.listaColoresSeleccionados = listaColoresSeleccionados;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void quitarFicha(){};
    public void agregarFicha(Ficha ficha){};
    public void pasarTurno(){};
    public void modificarTurno(){};
    public void obtenerTurnoSiguiente(){};


}
