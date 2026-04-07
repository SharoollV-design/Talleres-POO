package Taller_0;

public class Cafeteria {
    String nombre;
    String ubicacion;
    String especialidad;

    public Cafeteria(String nombre, String ubicacion, String especialidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.especialidad = especialidad;
    }

    void mostrarInfo() {
        System.out.println("Nombre de la cafeteria: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Especialidad: " + especialidad);
    }
}
