package taller_6;

public class PruebaEmpleado {
    
    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente("Sharoll", 100.000, "Sistemas");
        gerente1.mostrarInfo();

        Empleado empleado1 = new Empleado("Sofia", 20.000);
        empleado1.mostrarInfo();

    }
}
