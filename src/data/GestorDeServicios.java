package data;

import model.*;

public class GestorDeServicios {

    public void mostrarExperiencias (){

        RutaGastronomica rt1 = new RutaGastronomica("Ruta De Los Colonos",4 ,6, "Si");
        RutaGastronomica rt2 = new RutaGastronomica("Cocina Sur De Chile", 6, 8,"No");


        PaseoLacustre pso1 = new PaseoLacustre("Navegacion Puerto Varas",1,"Lancha", 10);
        PaseoLacustre pso2 = new PaseoLacustre("Tour Combinado",2,"Lancha", 14 );


        ExcursionCultural exc1 = new ExcursionCultural("Tour Por El Museo",2,"Museo Colonial Aleman", 1984 );
        ExcursionCultural exc2 = new ExcursionCultural("Tour Por Llanquihue",4,"Llanquihue", 1968 );


        System.out.println("--Rutas Gastronomicas--");
        System.out.println(rt1);
        System.out.println(rt2);
        System.out.println();
        System.out.println("--Paseos Lacustres--");
        System.out.println(pso1);
        System.out.println(pso2);
        System.out.println();
        System.out.println("--Excursiones Culturales--");
        System.out.println(exc1);
        System.out.println(exc2);

    }
}

