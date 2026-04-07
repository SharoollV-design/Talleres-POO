package Taller_0;

public class NotaAcademica {
    String asignatura; 
    int nota1, nota2, nota3;

    public NotaAcademica(String asignatura, int nota1, int nota2, int nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    void calcularDefinitiva() {
        int definitiva = (nota1 + nota2 + nota3) / 3;
        System.out.println("Su definitiva es: " + definitiva);
    }

}
