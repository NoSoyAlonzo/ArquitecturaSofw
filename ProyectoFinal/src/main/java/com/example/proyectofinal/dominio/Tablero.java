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

    public void dividir(List<Ficha> listaFicha, Grupo grupo){
        boolean fichasRemovidas = false;
        for (int i = 0; i < listaFicha.size(); i++) {
            if (grupo.getListaFichas().contains(listaFicha.get(i))){
                listaFicha.remove(listaFicha.get(i));
                System.out.println("se removió: "+listaFicha.get(i).getNumero());
                fichasRemovidas = true;
            }
        }
        if (fichasRemovidas == true) {
            agregarGrupo(grupo);
        }else{
            throw new IllegalStateException("No se encontraron las fichas");
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
