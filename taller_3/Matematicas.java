package taller_3;

public class Matematicas {
    
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        if (num2 == 0){
            System.out.println("Numero errado: no se debe dividir en cero");
            return 0;
        }
        return num1/num2;
    }

}
