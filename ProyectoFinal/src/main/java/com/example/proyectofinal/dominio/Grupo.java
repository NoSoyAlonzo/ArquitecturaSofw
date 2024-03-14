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
    public void agregarFicha(){

    }

    public void validarMovimientosGrupos(){

    }

    public void dividirGrupo(){

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
