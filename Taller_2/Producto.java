package Taller_2;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public void SetPrecio(double precio){
        if (precio > 0){
        this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo");
        }
    }

    void mostrarProducto() {
        System.out.println("Bienvenido");
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: " + precio);
    }
}
