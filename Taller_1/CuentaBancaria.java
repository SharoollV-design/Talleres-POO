package Taller_1;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Desconocido";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        if(numeroCuenta != null && !numeroCuenta.isEmpty()){
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Numero de cuenta sin especificar se asignara '000000");
            this.numeroCuenta = "000000";
        }

        if(tipoCuenta != null && !tipoCuenta.isEmpty()) {
            this.tipoCuenta = tipoCuenta;
        } else {
            System.out.println("Tipo de cuenta sin especificar se asignara 'Desconocido");
            this.tipoCuenta = "Desconocido";
        }

        this.saldo =0;
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo) {
        if(numeroCuenta != null && !numeroCuenta.isEmpty()){
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Numero de cuenta sin especificar se asignara '000000");
            this.numeroCuenta = "000000";
        }

        if(saldo < 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo errado, se le asigno '0' ");
            this.saldo = 0.0;
        }

        if(tipoCuenta != null && !tipoCuenta.isEmpty()) {
            this.tipoCuenta = tipoCuenta;
        } else {
            System.out.println("Tipo de cuenta sin especificar se asignara 'Desconocido");
            this.tipoCuenta = "Desconocido";
        }

        
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void SetNumeroCuenta(String numeroCuenta) {
        if(numeroCuenta != null && numeroCuenta.isEmpty()){
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Numero de cuenta sin especificar se asigno '00000'");
            this.numeroCuenta = "00000";
        }
    }

    public void SetTipoCuenta(String tipoCuenta) {
        if(tipoCuenta != null && numeroCuenta.isEmpty()) {
        this.tipoCuenta = tipoCuenta;
        } else {
        System.out.println("Tipo de cuenta sin especificar se asigno 'Desconocido'");
        this.tipoCuenta = "Desconocido";
        }
    }

    public void SetSaldo(double saldo){
        if(saldo < 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo errado, se le asigno '0' ");
            this.saldo = 0.0;
        }
    }

}
