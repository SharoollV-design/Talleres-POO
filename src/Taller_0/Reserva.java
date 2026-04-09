package Taller_0;

public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public Reserva(String nombreCliente, String fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = false;
    }

    void confirmar() {
        activa = true;
    }

    void cancelar() {
        activa = false;
    }

    void mostrarInfo() {
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Fecha de la reserva: " + fecha);
        System.out.println("Reserva " + (activa ? "Confirmada" : "Cancelada"));
    }
}
