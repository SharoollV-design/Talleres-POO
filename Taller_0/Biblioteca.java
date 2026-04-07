package Taller_0;

public class Biblioteca {
    String genero;
    int cantidad;
    String nombre;

    public Biblioteca(String genero, int cantidad, String nombre) {
        this.genero = genero;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    void cambiarGenero(String nuevoGenero) {
        genero = nuevoGenero;
    }

    void mostrarInfo(){
        System.out.println("Genero: " + genero);
        System.out.println("Cantidad de libros: " + cantidad);
        System.out.println("Nombre: " + nombre);
    }
}
