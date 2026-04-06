package Taller_0;
public class Puerta {
    String material;
    boolean abierta;

    public Puerta(String material){
        this.material = material;
        this.abierta = false;
    }

    void abrir() {
        abierta = true;
    }

    void cerrar () {
        abierta = false;
    }

    void mostrarInfo() {
        System.out.println("Material " + material);
        System.out.println("Estado: " + (abierta ? "Abierta" : "Cerrada") );
    }
    
}
