package Taller_1;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        titulo = "Sin titulo";
        autor = "Autor desconocido";
        numeroPaginas = 1;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        if(titulo != null && !titulo.isEmpty()){
          this.titulo = titulo;   
        } else {
            this.titulo = "Sin titulo";
        }

        if(autor != null && !titulo.isEmpty()){
            this.autor = autor;
        } else {
            this.autor = "Autor desconocido";
        }

        if(numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        } else {
            System.out.println("Numero de paginas sin especificar o invalido, se asignará '1' ");
            this.numeroPaginas = 1;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void SetTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        }
    }

    public void SetAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        }
    }

    public void SetNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        }
    }
    
    
    void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
    }
}