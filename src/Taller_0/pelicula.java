package Taller_0;

public class pelicula {
    String nombre;
    String genero;
    String minutos;

    public pelicula(String nombre, String genero, String minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Duracion: " + minutos);
    }
    
}
