package Taller_0;

public class Curso {
    String nombre;
    int duracion;

    public Curso(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    void mostrarInfo() {
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Duracion del curso: " + duracion);
    }
}
