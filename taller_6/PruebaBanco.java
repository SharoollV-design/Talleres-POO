package taller_6;

public class PruebaBanco {
    
    public static void main(String[] args) {
        
        Banco cuenta1 = new Banco(300.000);
        cuenta1.depositar(50.000);

        System.out.println("Saldo actual: " + cuenta1.getSaldo());
    }
}
