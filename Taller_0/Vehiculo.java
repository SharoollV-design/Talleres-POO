package Taller_0;
public class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidadActual) {
      this.marca = marca;
      this.modelo = modelo;
      this.velocidadActual = velocidadActual;
    }

    void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual);
    }

    void acelerar () {
        velocidadActual += 10;
    }

    void frenar () {
      if (velocidadActual >= 10) {
        velocidadActual -= 10; 
       } else {
           velocidadActual = 0;
        }
   }
}
    // Ejercicio 45: caso hipotetico en el que el metodo quedara fuera de la clase
    //void frenar () {
    //    if (velocidadActual >= 10) {
    //       velocidadActual -= 10; 
    //    } else {
    //        velocidadActual = 0;
    //   }
    // }