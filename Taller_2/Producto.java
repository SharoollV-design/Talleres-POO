package Taller_2;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarProducto() {
        System.out.println("Bienvenido");
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: " + precio);
    }
}
