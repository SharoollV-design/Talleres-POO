package Taller_0;
public class Cancion {
    String titulo;
    String artista;
    String duracion;
    
    public Cancion(String titulo, String artista, String duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    static Cancion crearCancionBasico(String titulo, String artista, String duracion){
        return new Cancion(titulo, artista, duracion);
    }
    
    void mostrarInfo() {
        System.out.println("Titulo de la cancion: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duracion: " + duracion);
    }
}