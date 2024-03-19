package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;
import com.example.proyectofinal.dominio.Ficha;
public class Grupo {
    /**
     * Atributos de la clase Grupo
     */
    private List<Ficha> listaFichas;
    private boolean modificado;


    /**
     * Método constructor de un grupo
     * con parámetros
     * @param listaFichas
     * @param modificado
     */
    public Grupo(List<Ficha> listaFichas, boolean modificado) {
        this.listaFichas = listaFichas;
        this.modificado = modificado;
    }

    /**
     * Método constructor de un grupo
     * sin parámetros
     */
    public Grupo() {
        listaFichas =new ArrayList<Ficha>();
    }

    /**
     * Métodos get y set para los atributos
     * @return
     */
    public List<Ficha> getListaFichas() {
        return listaFichas;
    }

    public void setListaFichas(List<Ficha> listaFichas) {
        this.listaFichas = listaFichas;
    }

    public boolean isModificado() {
        return modificado;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }

    /**
     * Método que permite agregar una ficha
     * a la lista de fichas de un grupo
     * @param ficha
     */
    public void agregarFicha(Ficha ficha){
        if (ficha != null) {
            listaFichas.add(ficha);
        }else{
            throw new IllegalStateException("Problemas al agregar la ficha al grupo");
        }
    }

    /**
     * Método que permite validar los
     * movimientos que se realizan a un grupo.
     */
    public void validarMovimientosGrupos(){

    }

    /**
     * Método que permite dividir un grupo
     * al recibir el grupo a dividir y la lista de fichas
     * seleccionadas a dividir.
     * Busca fichas, quita fichas y retorna un nuevo grupo para ser
     * guardado en el tablero.
     * @param grupoDividir
     * @param listaFichasSeleccionadas
     * @return
     */
    public Grupo dividirGrupo(Grupo grupoDividir, List<Ficha> listaFichasSeleccionadas){
        Grupo grupoNuevo = new Grupo();
        boolean fichasRemovidas = false;
        for (int i = 0; i < listaFichasSeleccionadas.size(); i++) {
            if (grupoDividir.getListaFichas().contains(listaFichasSeleccionadas.get(i))){
                grupoDividir.getListaFichas().remove(listaFichasSeleccionadas.get(i));
                fichasRemovidas = true;
                grupoDividir.setModificado(true);
            }
        }
        if (fichasRemovidas == true) {
            for (int i = 0; i < listaFichasSeleccionadas.size(); i++) {
                grupoNuevo.agregarFicha(listaFichasSeleccionadas.get(i));
            }
            return grupoNuevo;
        }else{
            throw new IllegalStateException("No se encontraron las fichas");
        }
    }

    /**
     * Método que permite verificar el colocar una ficha en un grupo
     */
    public void verificarColocarFicha(Grupo grupoModificar, List<Ficha> fichasColocar, Juego juegoJugador){
        // Se verifica que se puedan poner las fichas en el grupo
        if (verificarPonerFicha(grupoModificar, fichasColocar)) {
            //Quitar fichas a jugador
            juegoJugador.getJugadorTurno().quitarFicha(fichasColocar);

        }else{
            throw new IllegalStateException("No se pudo colocar la ficha");
        }
    }


    public boolean verificarPonerFicha(Grupo grupoModificar, List<Ficha> fichasColocar){
        boolean retornar = false;
        if (!grupoModificar.getListaFichas().isEmpty()) {
            for (int i = 0; i < grupoModificar.getListaFichas().size(); i++) {
//                if (grupoModificar.getListaFichas().get(i).getColor()){
//                        retornar = true;
//                }
            }
        }
        return retornar;
    }

    /**
     * Método para validar el estado del grupo, si está en buen estado retorna true, si no false.
     * @return
     */
    public boolean validarGrupo(){
        if (listaFichas.size() > 2) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método para agregar las fichas al grupo
     * @param fichasAgregar
     */
    public void agregarFichas(List<Ficha> fichasAgregar){
        if (!fichasAgregar.isEmpty()) {
            for (int i = 0; i < fichasAgregar.size(); i++) {
                listaFichas.add(fichasAgregar.get(i));
            }
        }
    }
}
