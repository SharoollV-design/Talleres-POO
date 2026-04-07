package Taller_0;

public class Paciente {
    String nombre;
    String enfermedad;
    int edad; 

    public Paciente(String nombre, String enfermedad, int edad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.edad = edad;
    }

    public Paciente(Paciente otroPaciente) {
        this.nombre = otroPaciente.nombre;
        this.enfermedad = otroPaciente.enfermedad;
        this.edad = otroPaciente.edad;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Enfermedad: " + enfermedad);
        System.out.println("Edad: " + edad);
    }
}
