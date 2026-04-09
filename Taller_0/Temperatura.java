package Taller_0;

public class Temperatura {
    double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    void convertir(){

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }
}
