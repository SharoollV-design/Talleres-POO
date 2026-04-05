public class Estudiante{
    String nombre; 
    String codigo;
    int semestre;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo estudiantil: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
}

class main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.nombre = "Jessica Mateus";
        est1.codigo = "est1.Jess2026";
        est1.semestre = 6;

        est1.mostrarInfo();
    }

}