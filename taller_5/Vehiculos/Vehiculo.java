package taller_5.Vehiculos;

public class Vehiculo {

    String tipo;
    int ruedas;

    public Vehiculo(){

    }

    public Vehiculo(String tipo, int ruedas){
        this.tipo = tipo;
        this.ruedas = ruedas;
    }

    void mostrarInfo(){
        System.out.println("Tipo de vehiculo: " + tipo);
        System.out.println("Numero de ruedas: " + ruedas);
    }
}
