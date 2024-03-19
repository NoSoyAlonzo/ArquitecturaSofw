package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    /**
     * Atributos de la clase Jugador
     */
    private String nombreUsuario;
    private String rutaAvatar;
    private List<Ficha> listaFichas;
    private List<ColorManager> listaColoresSeleccionados;
    private int score;

    /**
     * Método constructor de un jugador
     * @param nombreUsuario
     * @param rutaAvatar
     * @param listaFichas
     * @param listaColoresSeleccionados
     * @param score
     */
    public Jugador(String nombreUsuario, String rutaAvatar, List<Ficha> listaFichas, List<ColorManager> listaColoresSeleccionados, int score) {
        this.nombreUsuario = nombreUsuario;
        this.rutaAvatar = rutaAvatar;
        this.listaFichas = new ArrayList<>();;
        this.listaColoresSeleccionados = new ArrayList<>();
        this.score = score;
    }

    /**
     * Métodos get y set
     * @return
     */
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

    /**
     * Método para quitar las fichas recibidas
     * al jugador
     * @param fichasQuitar
     */
    public void quitarFicha(List<Ficha> fichasQuitar){
        if (!fichasQuitar.isEmpty()) {
            for (int i = 0; i < fichasQuitar.size(); i++) {
                if (listaFichas.contains(fichasQuitar.get(i))) {
                    listaFichas.remove(fichasQuitar.get(i));
                }
            }
        }
    };

    /**
     * Método para agregar la ficha a la lista
     * de fichas del jugador
     * @param ficha
     */
    public void agregarFicha(Ficha ficha){
        if (ficha != null) {
            listaFichas.add(ficha);
        }
    };

}
