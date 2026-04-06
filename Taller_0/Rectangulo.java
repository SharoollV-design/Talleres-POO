package Taller_0;
public class Rectangulo {
    double altura;
    double base;

    public Rectangulo(double base, double altura) {
        this.base= base;
        this.altura = altura;
    }

    void calcularArea() {
        double area = base * altura;
        System.out.println("El area es: " + area);
    }

    void calcularPerimetro() {
        double perimetro = 2 * (base+ altura);
        System.out.println("El perimetro es: " + perimetro);
    }

    void mostrarResultado() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);

        calcularArea();
        calcularPerimetro();
    }
    
}
