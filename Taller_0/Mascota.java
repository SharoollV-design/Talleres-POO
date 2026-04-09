package Taller_0;
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    // Ejercicio 48: Confundir atributos 
    // void mostrarMascota() {
    // String nombre = "Algodon";
    // System.out.println(nombre);
    //}

    // Forma correcta:
    void mostrarMascota() {
        System.out.println("Nombre de la mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }

    void cumplirAnios() {
        edad += 1;
        System.out.println( nombre + " Cumplio un año");
    }
}