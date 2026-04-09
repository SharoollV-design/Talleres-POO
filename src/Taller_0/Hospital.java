package Taller_0;

public class Hospital {
    String nombreDoctor;
    String especialidad;

    public Hospital(String nombreDoctor, String especialidad) {
        this.nombreDoctor = nombreDoctor;
        this.especialidad = especialidad;
    }

    void cambiarNombre(String nuevoNombre) {
        nombreDoctor = nuevoNombre;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombreDoctor);
        System.out.println("Especialidad: " + especialidad);
    }
}
