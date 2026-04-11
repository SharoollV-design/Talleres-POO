package taller_6;

public class Moto extends Vehiculo {
    
    private int cilindrada; 

    public Moto(String tipo, String marca, int cilindrada){
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }
    
    void mostrarDatos(){
        System.out.println(" Bienvenidos a Yamaha ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " +marca);
        System.out.println("Cilindrada: " + getCilindrada());
    }
}
