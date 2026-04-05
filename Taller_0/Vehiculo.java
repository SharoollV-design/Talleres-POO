public class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual);
    }
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Mazda";
        vehiculo1.modelo = "Mazda CX-30";
        vehiculo1.velocidadActual = 100;
        vehiculo1.mostrarEstado();
        
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Mercedes";
        vehiculo2.modelo = "Mercedes-AMG GT";
        vehiculo2.velocidadActual = 200;
        vehiculo2.mostrarEstado();
    }
 }