package Taller_0;
public class Producto {
    String nombre;
    double precio;
    int stock;

    void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    void vender(int cantidad) {
        if(stock >= cantidad) {
            stock -= cantidad;
        } else {
            System.out.println("No tiene el suficiente stock");
        }
    }
}
