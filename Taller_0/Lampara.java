package Taller_0;

public class Lampara {
    String marca;
    boolean encendida;

    public Lampara(String marca) {
        this.marca = marca;
        this.encendida = false;
    }

    void encender() {
        encendida = true;
    }

    void apagar () {
        encendida = false;
    }
    
    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }
}
