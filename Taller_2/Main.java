package Taller_2;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(" === Probar === ");

        Producto produc1 = new Producto("Camiseta", 50.000);
        produc1.mostrarProducto();

        
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante("Sharoll", 20);

        est1.mostrarEstudiante();
        est2.mostrarEstudiante();
    }
}
