package Taller_0;
public class Estudiante{
    String nombre; 
    String codigo;
    int semestre;

    public Estudiante () {

    }

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo estudiantil: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

    void cambiarSemestre(int nuevoSemestre) {
        semestre = nuevoSemestre;
    }

    // Estudiante es una clase ya que es el molde básico en el que se define un nuevo dato
    // además describe que caracteristicas tendrá algo. 

    // Por otro lado est1 es un objeto ya que es una entidad creada a partir e la clase Estudiante
    // Tiene identidad propia y la posibilidad de ejecutar comportamientos, como su nombre. 
}