package taller_3;

public class PruebaMatematicas {
    public static void main(String[] args) {
        
        double suma = Matematicas.sumar(25, 20);
        double resta = Matematicas.restar(550, 315);
        double multiplicar = Matematicas.multiplicar(12, 34);
        double dividir = Matematicas.dividir( 55, 0); // utilizamos el cero para comprobar

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicar);
        System.out.println("Division: " + dividir);

    }
}
