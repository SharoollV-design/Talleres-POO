package Taller_0;
public class Celular {
    String marca; 
    int bateria;
    boolean prendido;

    public Celular(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
        this.prendido = false;
    }

    void encender() {
        prendido = true;
    }

    void apagar() {
        prendido = false;
    }

    void cargarBateria() {
        if (bateria <= 20) {
            System.out.println("Bateria baja! Cargue el celular");
        }
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Bateria: " + bateria);
         System.out.println("Celular " + (prendido ? "Encendido" : "Apagado"));
    }
}