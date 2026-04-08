package Taller_2;

public class Prueba {
    
    private String nombre;

    // Creamos el constructor

    public Prueba(String nombre){
        this.nombre = nombre;
    }

    // Realizamos un método normal, no un metodo estatico

    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}
