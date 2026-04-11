package taller_6;

public class Gerente extends Empleado{
    
    protected String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("     Informacion del gerente    ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
