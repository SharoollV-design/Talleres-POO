package Taller_0;
public class Tienda {
    String productoI;
    double precio;
    int cantidad;

    public Tienda(String productoI, double precio, int cantidad) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.productoI = productoI;
    }

    void cambiarProducto(String nuevoProducto) {
        productoI = nuevoProducto;
    }

    void mostrarInfo() {
        System.out.println("Producto: " + productoI);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }
}