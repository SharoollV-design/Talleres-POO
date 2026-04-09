package Taller_0;
public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto () {

    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    static Producto crearProductoBasico(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }

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

    void reabastecer(int cantidad) {
        stock += cantidad; 
    }
}
