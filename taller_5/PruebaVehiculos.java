package taller_5;

import taller_5.Vehiculos.Moto;
import taller_5.Vehiculos.Vehiculo;

public class PruebaVehiculos {
    
    public static void main(String[] args) {

        // ERROR: constructor default
        ////Vehiculo v = new Vehiculo("Terrestre", 4);

        Moto m = new Moto("Terrestre", 2, "Yamaha");

        // ERROR: acceso default
        ///System.out.println(m.tipo);

        // ERROR: método default
        //m.mostrarInfo();

        m.mostrarMoto();
    }
}

// Hay errores de compilación porque para poder acceder, la clase prueba debe estar en el mismo paquete de vehiculos 
