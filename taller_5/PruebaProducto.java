package taller_5;

public class PruebaProducto {
    
    public static void main(String[] args) {
    Producto p1 = new Producto("Aretes de esmeralda", 70.000, 3);
    p1.mostrarInfo();

    System.out.println("  ");

    p1.setPrecio(80.000);
    p1.setStock(5);

    System.out.println("Nuevo precio: " + p1.getPrecio());
    System.out.println("Nuevo stock: " + p1.getStock());

    System.out.println("  ");
    }
}

