package com.example.proyectofinal.dominio;

import java.util.ArrayList;
import java.util.List;

public class mainPruebas {
    public static void main(String[] args) {
        ColorManager color = new ColorManager();
        FichaNumero numero1 = new FichaNumero(color, 1);
        FichaNumero numero2 = new FichaNumero(color, 2);
        FichaNumero numero3 = new FichaNumero(color, 3);

        Juego juego;
        juego = Juego.getInstance();
        List<Ficha>fichas;
        fichas = new ArrayList<>();
        fichas.add(numero1);
        fichas.add(numero2);
        Jugador jugador1 = new Jugador("lol", "sdf", fichas, null,0);
        List<Ficha>fichas2;
        fichas2 = new ArrayList<>();
        fichas2.add(numero3);
        jugador1.agregarFicha(numero3);

        Grupo grupo = new Grupo();
        grupo.agregarFicha(numero1);
        grupo.agregarFicha(numero2);

        grupo.verificarColocarFicha(grupo, fichas2, juego);






    }
}
