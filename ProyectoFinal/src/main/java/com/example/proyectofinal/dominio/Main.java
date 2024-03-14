package com.example.proyectofinal.dominio;

public class Main {
    public static void main(String[] args) {
        ColorManager color = new ColorManager();
        FichaNumero numero1 = new FichaNumero(color, 1);
        FichaNumero numero2 = new FichaNumero(color, 2);
        FichaNumero numero3 = new FichaNumero(color, 3);

        Grupo grupo = new Grupo();
        grupo.agregarFicha(numero1);
        grupo.agregarFicha(numero2);
        grupo.agregarFicha(numero3);


        Grupo grupo2 = new Grupo();
        grupo2.agregarFicha(numero1);
        Tablero tablero = Tablero.getInstance();
        tablero.obtenerGrupoDividido(grupo);
    }
}
