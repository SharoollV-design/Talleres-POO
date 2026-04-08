package Taller_2;

public class Estudiante {
    String nombre;
    int edad; 

    public Estudiante() {
        this("Sin nombre", 0);
    }

    public Estudiante(String nombre, int edad) {
        if (nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        } else { 
            System.out.println("No tiene nombre, se asigno 'Sin nombre' ");
        }
       
        this.edad = 0;
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
