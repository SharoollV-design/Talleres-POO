package Taller_0;

public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    void valorTotal(){
        double total = (precioUnitario * cantidad);
        System.out.println("Total: " + total);
    }
}
