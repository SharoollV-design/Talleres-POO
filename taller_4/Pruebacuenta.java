package taller_4;

public class Pruebacuenta {
    
    public static void main(String[] args) {

        Cuenta c1 = new  Cuenta(1000);

        System.out.println("No hubo errores");

        //Intentamos acceder directamente 

        //System.out.println(c1.saldo); // El sistema nos arroja un error saldo tiene un acceso privado
    }
}
