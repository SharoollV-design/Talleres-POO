package Taller_0;

public class EquipodeFutbol {
    String nombre;
    int cantjugadores;
    String colorbandera;
    
    public EquipodeFutbol(String nombre, int cantjugadores, String colorbandera) {
        this.nombre = nombre;
        this.cantjugadores = cantjugadores;
        this.colorbandera = colorbandera;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de judarores: " + cantjugadores);
        System.out.println("Color de la bandera: " + colorbandera);
    }
}
