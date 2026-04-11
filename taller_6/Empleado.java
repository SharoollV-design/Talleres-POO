package taller_6;

public class Empleado {
    protected String nombre; 
    protected double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    void mostrarInfo(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario: " + salario);
    }
}


