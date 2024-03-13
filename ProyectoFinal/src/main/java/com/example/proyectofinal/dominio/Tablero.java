package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private static Tablero instanciaTablero;
     private List<Grupo> listaGrupos;

     private Tablero(){
        listaGrupos = new ArrayList<>();
     }
//metodosP

    public static synchronized Tablero getInstance(){
         if (instanciaTablero == null){
             instanciaTablero = new Tablero();
         }
         return instanciaTablero;
    }
    public void obtenerGrupoDividido(){

    }
    public void obtenerGruposModificados(){

    }
}
