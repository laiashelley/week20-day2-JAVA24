// Tienes la clase madre Vehículos, y heredan las clases Coche, Moto y Camión. OK

// ¿Qué características son comunes entre todos los vehículos? ¿Cuales son específicas? OK

// Puedes añadir también métodos específicos en cada clase.

// Crea tres arraylist de coches, motos y camiones. OK.

// - ¿Cómo encontrarías un modelo en específico en cada arraylist? OK

// - Prueba a recorrer cada array por características, del tipo: todos los nombres, marcas precios, etc OK

// - ¿Cómo guardarías todas las marcas aparte? OK

// - ¿Cómo harías un arraylist mixto con coches, motos y camiones?

// +EXTRA: Puedes añadir un descuento global por fin de temporada, que afecte a todas las clases. ¿Cómo lo harías?

import java.util.ArrayList;
import java.util.Arrays;

public class Java24ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        // instanciamos objetos

        Camion camion1 = new Camion("Scania", 120.000f, 4, 90);
        Camion camion2 = new Camion("Mercedes-Benz", 140.000f, 4, 80);
        Camion camion3 = new Camion("Volvo", 150.000f, 4, 60);

        Coche coche1 = new Coche("Toyota", 30.000f, 4, true);
        Coche coche2 = new Coche("Ford", 25.000f, 4, false);
        Coche coche3 = new Coche("BMW", 50.000f, 4, true);

        Moto moto1 = new Moto("Honda", 8.000f, 2, true);
        Moto moto2 = new Moto("Yamaha", 10.000f, 2, true);
        Moto moto3 = new Moto("Ducati", 15.000f, 2, true);

        // creamos arraylist

        ArrayList <Camion> camiones = new ArrayList<>();
        ArrayList <Coche> coches = new ArrayList<>();
        ArrayList <Moto> motos = new ArrayList<>();

        // añado objetos a array:

        camiones.add(camion1);
        camiones.add(camion2);
        camiones.add(camion3);

        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);

        motos.add(moto1);
        motos.add(moto2);
        motos.add(moto3);

        // muestro marcas de cada arraylist

        for (Camion x: camiones){
            System.out.println(x.getMarca());
        }

        for (Coche x: coches){
            System.out.println(x.getMarca());
        }

        for (Moto x: motos){
            System.out.println(x.getMarca());
        }

        // muestro precio de la arraylist coches:

        for (Coche x: coches){
            System.out.println(x.getPrecio());
        }

        // muestro las marcas metiendolas en una arraylist:

        ArrayList<Vehiculos> todasMarcas = new ArrayList<>();

        todasMarcas.add(camion1);
        todasMarcas.add(camion2);
        todasMarcas.add(camion3);

        todasMarcas.add(coche1);
        todasMarcas.add(coche2);
        todasMarcas.add(coche3);

        todasMarcas.add(moto1);
        todasMarcas.add(moto2);
        todasMarcas.add(moto3);

        for (Vehiculos vehiculo : todasMarcas) {
            System.out.println(vehiculo.getMarca());
        }

        // arraylist mixta con todos los vehiculos

        ArrayList <Vehiculos> vehiculos = new ArrayList<>(Arrays.asList(camion1, camion2, camion3, coche1, coche2, coche3, moto1, moto2, moto3));

        for (int i = 0; i<vehiculos.size(); i++){
            System.out.println(vehiculos.get(i).getPrecio() + vehiculos.get(i).getDescuento());
        }

    }
}
