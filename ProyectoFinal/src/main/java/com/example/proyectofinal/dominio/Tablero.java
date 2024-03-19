package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    /**
     * Atributos con los que cuenta
     * la instancia de Tablero
     */
    private static Tablero instanciaTablero;
    private Juego juego;
     private List<Grupo> listaGrupos;

    /**
     * Constructor en el que se aplicó
     * singleton para el control
     * de las instancias.
     */
    private Tablero(){
        listaGrupos = new ArrayList<>();
        juego = Juego.getInstance();
     }

    /**
     * Método para obtener una instancia
     * de Tablero
     * @return
     */
    public static synchronized Tablero getInstance(){
         if (instanciaTablero == null){
             instanciaTablero = new Tablero();
         }
         return instanciaTablero;
    }

    /**
     * Método que dividirá las fichas de un grupo en dos grupos.
     * @param grupo
     */
    public void obtenerGrupoDividido(Grupo grupo){
        //List<Ficha> fichasGrupo = grupo.getListaFichas();
        for (int i = 0; i < listaGrupos.size(); i++) {
            if (listaGrupos.get(i).getListaFichas().containsAll(grupo.getListaFichas())){
                //Se encontró el grupo en la lista
                listaGrupos.get(i).dividirGrupo(listaGrupos.get(i), grupo.getListaFichas());
                dividir(listaGrupos.get(i).getListaFichas(), grupo);
                throw new IllegalStateException("Se encontró grupo dentro del tablero");
            }
        }
    }

    /**
     * Método que le habla a la clase grupoNuevo para dividir el grupo
     * @param listaFicha
     * @param grupo
     */
    public void dividir(List<Ficha> listaFicha, Grupo grupo){
        Grupo grupoNuevo = grupo.dividirGrupo(grupo, listaFicha);
        if (!grupoNuevo.getListaFichas().isEmpty()){
            agregarGrupo(grupoNuevo);
        }else{
            throw new IllegalStateException("No se pudo divir el grupo");
        }
    }

    public void agregarGrupo(Grupo nuevoGrupo){
        if (!nuevoGrupo.getListaFichas().isEmpty()) {
            listaGrupos.add(nuevoGrupo);
        }else{
            throw new IllegalStateException("Grupo a agregar no cuenta con fichas añadidas");
        }
    }


    public void obtenerGruposModificados(){
        List<Grupo> gruposModificados = new ArrayList<>();
        for (int i = 0; i < listaGrupos.size(); i++) {
            if (listaGrupos.get(i).isModificado()){
                gruposModificados.add(listaGrupos.get(i));
            }
        }

        if (validarGrupo(gruposModificados).isEmpty()) {
            throw new IllegalStateException("Los grupos no están correctos");
        }else{
            juego.cambiarTurno();
        }
    }

    /**
     * Método que permite validar los grupos modificados, retorna una lista vacía
     * si todos los grupos estaban según las reglas de negocio.
     * @param gruposModificados
     * @return
     */
    public List<Grupo> validarGrupo(List<Grupo> gruposModificados){
        for (int i = 0; i < gruposModificados.size(); i++) {
            if (gruposModificados.get(i).validarGrupo()){
                gruposModificados.remove(gruposModificados.get(i));
            }
        }
        return gruposModificados;
    }

    /**
     * Método que permite hablarle al método verificarColocarFicha
     * de la clase grupo
     * @param grupoModificar
     * @param fichasColocar
     * @param juegoJugador
     */
    public void verificarColocarFicha(Grupo grupoModificar, List<Ficha> fichasColocar, Juego juegoJugador){
        grupoModificar.verificarColocarFicha(grupoModificar, fichasColocar, juegoJugador);
    }

}
