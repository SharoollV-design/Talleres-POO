package Taller_0;

public class Docente {
    String nombre;
    String materia;
    String institucion; 

    public Docente(String nombre, String materia, String institucion) {
        this.nombre = nombre;
        this.materia = materia;
        this.institucion = institucion;
    }

    void cambiarMateria(String nuevaMateria) {
        materia = nuevaMateria;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Materia: " + materia);
        System.out.println("Institucion: " + institucion);
    }
}
