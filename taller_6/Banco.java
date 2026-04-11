package taller_6;

public class Banco {

    // Esto es un error, los datos de un banco, son datos criticos, al tener modificador 
    // de acceso protected pueden modificar el saldo.
    //protected double saldo;  
    
    private double saldo;

    // Por esto hay que validar y no sería correcto llamar en el constructor directamente.
    public Banco(double saldo){
        if(saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo");
        }
    }

    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
        } else {
            System.out.println("Debe depositar un numero positivo");
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
