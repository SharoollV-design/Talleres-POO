package Taller_0;
public class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    public CuentaBancaria () {
        
    }

    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    void mostrarCuenta() {
        System.out.println("Numero de cuenta: " + numero);
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    void consignar(double valor) {
        saldo += valor;
    }

    void retirar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else{
         System.out.println("Saldo insuficiente para retirar");
        }
    }
}
    