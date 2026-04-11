package taller_5.Vehiculos;

public class Moto extends Vehiculo{
    
    String marca; 

    public Moto(String tipo, int ruedas, String marca){
        super(tipo, ruedas);
        this.marca = marca;
    }

    void mostrarMoto() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo de vehiculo: " + super.tipo);
        System.out.println("Numero de ruedas: " + super.ruedas);
    }
}
