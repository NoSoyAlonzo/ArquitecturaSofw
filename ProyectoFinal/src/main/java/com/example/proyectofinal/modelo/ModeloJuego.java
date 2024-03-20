package com.example.proyectofinal.modelo;

import com.example.proyectofinal.dominio.*;

import java.util.List;


public class ModeloJuego implements ModeloFiltro {

    /**
     * Atributos de la clase ModeloJuego
     */
    private static ModeloJuego instanciaModeloJuego;
    private Pozo pozo;
    private Tablero tablero;
    private Juego juego;
    private Observador observador;

    /**
     * Método constructor de un ModeloJuego
     * privado para aplicar el patrón singleton
     */
    private ModeloJuego(){
        pozo = Pozo.getInstance();
        tablero = Tablero.getInstance();
        juego = Juego.getInstance();
    }

    /**
     * Método que permite obtener una instancia de
     * la clase ModeloJuego
     * @return
     */
    public static synchronized ModeloJuego getInstance(){
        if (instanciaModeloJuego == null){
            instanciaModeloJuego = new ModeloJuego();
        }
        return instanciaModeloJuego;
    }

    /**
     * Método que le habla al dividir grupo del tablero.
     * @param grupo
     */
    public void dividirGrupo(Grupo grupo){
        tablero.obtenerGrupoDividido(grupo);
        notificarCambios();
    }

    /**
     * Método que le habla al método verificarColocarFicha
     * de la clase grupo
     * @param grupo
     */
    public void verifColocarFichaGrupo(Grupo grupo, List<Ficha> fichasColocar){
        tablero.verificarColocarFicha(grupo, fichasColocar, juego);
    }

    /**
     * Método que le habla al método
     * obtenerGruposModificados de la clase Tablero.
     */
    public void validarGrupos(){
        tablero.obtenerGruposModificados();
        notificarCambios();
    }

    /**
     * Método que le habla al método jalarFichaPozo
     * de la clase Juego
     */
    public void jalarFichaPozo(){
        juego.jalarFichaPozo();
        notificarCambios();
    }

    /**
     * Método que le habla al método
     * obtenerTurnoSiguiente de la clase Juego
     */
    public void pasarTurno(){
        juego.obtenerTurnoSiguiente();
        notificarCambios();
    }

    public void setObservador(Observador observador) {
        this.observador = observador;
    }

    public void notificarCambios() {
        if (observador != null) {
            observador.notifyObservers(this);
        }
    }

    @Override
    public Pozo getPozo() {
        return pozo;
    }

    @Override
    public Tablero getTablero() {
        return tablero;
    }

    @Override
    public Juego getJuego() {
        return juego;
    }
}
