package Taller_0;
public class Ventilador {
    String marca; 
    int velocidad;
    boolean encendido;

    public Ventilador(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.encendido = false;
    }

    void encender() {
        encendido = true;
    }

    void apagar() {
        encendido = false;
    } 

    void subirVelocidad() {
        if (velocidad == 0) {
            velocidad += 1;
            System.out.println("Ventilador encendido en 1");
        } else if (velocidad >= 1) {
            velocidad += 1;
            System.out.println("Velocidad subida");
        }
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Ventilador " + (encendido ? "Encendido" : "Apagado"));
    }
}
