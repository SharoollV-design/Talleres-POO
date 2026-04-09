package Taller_0;

public class Avion {
    String aerolina;
    String destino; 
    int pasajeros; 

    public Avion(String aerolina, String destino, int pasajeros) {
        this.aerolina = aerolina;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    void abordar(int cantidad) {
        pasajeros = pasajeros + cantidad;

        System.out.println("Han abordado " + cantidad + " pasajeros.");
        System.out.println("Total de pasajeros: " + pasajeros);
    }

    void mostrarInfo() {
        System.out.println("Aerolinea: " + aerolina);
        System.out.println("Destino: " + destino);
        System.out.println("Pasajeros a bordo: " + pasajeros);
    }
}
