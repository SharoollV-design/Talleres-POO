package Taller_0;

public class FacturaSimple {
    int numero;
    String cliente;
    double valor;

    public FacturaSimple(int numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    void descuento() {
        double descuento = (valor * 0.1);
        double descuentototal = valor - descuento;
        System.out.println("Su descuento es de: " + descuento);
        System.out.println("El valor a pagar es: " + descuentototal);
    }

    void mostrarCuenta() {
        System.out.println("Cliente numero: " + numero);
        System.out.println("Nombre del cliente: " + cliente);
        System.out.println("Valor: " + valor);

        descuento();
    }
}
