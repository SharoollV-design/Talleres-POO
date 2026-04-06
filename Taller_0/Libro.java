package Taller_0;

public class Libro {
    String titulo;
    String autor;
    int cantidad;

    public Libro() {

    }

    Libro(String titulo, String autor, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
    }
    
    void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Numero de paginas: " + cantidad);
    }
}
