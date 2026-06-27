package ui;

import data.GestorDeServicios;

public class Main {

    public static void main(String[] args) {

        GestorDeServicios gestor = new GestorDeServicios ();

        System.out.println("---EXPERIENCIAS LLANQUIHUE TOUR---");
        System.out.println();

        gestor.mostrarExperiencias();

    }
}