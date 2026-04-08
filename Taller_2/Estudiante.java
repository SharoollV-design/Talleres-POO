package Taller_2;

public class Estudiante {
    String nombre;
    int edad; 

    public Estudiante() {
        this("Sin nombre", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public void SetEdad(int edad){
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Bienvenido al colegio risas y sonrisas:)");
        System.out.println("Ingrese el nombre: " + nombre);
        System.out.println("Ingrese su edad: " + edad);
    }
}
