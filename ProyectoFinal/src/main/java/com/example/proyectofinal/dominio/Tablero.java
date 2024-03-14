package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private static Tablero instanciaTablero;
    private Juego juego;
     private List<Grupo> listaGrupos;

     private Tablero(){
        listaGrupos = new ArrayList<>();
        juego = Juego.getInstance();
     }

    public static synchronized Tablero getInstance(){
         if (instanciaTablero == null){
             instanciaTablero = new Tablero();
         }
         return instanciaTablero;
    }
    public void obtenerGrupoDividido(){

    }
    public void obtenerGruposModificados(){
        List<Grupo> gruposModificados = new ArrayList<>();
        for (int i = 0; i < listaGrupos.size(); i++) {
            if (listaGrupos.get(i).isModificado()){
                gruposModificados.add(listaGrupos.get(i));
            }
        }

        if (validarGrupo(gruposModificados).isEmpty()) {
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

}
