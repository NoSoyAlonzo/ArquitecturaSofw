package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;
import com.example.proyectofinal.dominio.Ficha;
public class Grupo {
    private List<Ficha> listaFichas;
    private boolean modificado;

    public Grupo(List<Ficha> listaFichas, boolean modificado) {
        this.listaFichas = listaFichas;
        this.modificado = modificado;
    }

    public Grupo() {
        listaFichas =new ArrayList<Ficha>();
    }

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

    //metodos
    public void verificarColocarFicha(){

    }
    public void agregarFicha(Ficha ficha){
        if (ficha != null) {
            listaFichas.add(ficha);
        }else{
            throw new IllegalStateException("Problemas al agregar la ficha al grupo");
        }
    }

    public void validarMovimientosGrupos(){

    }

    public boolean dividirGrupo(Grupo grupoDividir, List<Ficha> listaFichasSeleccionadas){
        boolean fichasRemovidas = false;
        for (int i = 0; i < listaFichasSeleccionadas.size(); i++) {
            if (grupoDividir.getListaFichas().contains(listaFichasSeleccionadas.get(i))){
                listaFichas.remove(listaFichasSeleccionadas.get(i));
                System.out.println("se removió: "+listaFichasSeleccionadas.get(i).getNumero());
                fichasRemovidas = true;
            }
        }
        if (fichasRemovidas == true) {
            agregarGrupo(grupo);
        }else{
            throw new IllegalStateException("No se encontraron las fichas");
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
}
