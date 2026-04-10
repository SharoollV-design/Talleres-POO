package taller_5;

public class Producto {
    String nombre;
    double precio; 
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    String getNombre(){
        return nombre;
    }

    double getPrecio(){
        return  precio;
    }

    int getStock(){
        return stock;
    }

    void setNombre(String nombre){
        if (nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar sin rellenar.");
        }
    }

    void setPrecio(double precio){
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser un negativo.");
        }
    }    

    void setStock(int stock){
        if(stock > 0){
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo");
        }
    }

    void mostrarInfo(){
        System.out.println(" ---- Bienvenidos a tiendas SAVIM ---- ");
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock disponible: " + stock);
    }
}