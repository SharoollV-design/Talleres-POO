package Taller_0;

public class Computador {
    String marca;
    int ram;

    public Computador(String marca, int ram) {
        this.marca = marca;
        this.ram = ram;
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("RAM: " + ram);
    }
}
