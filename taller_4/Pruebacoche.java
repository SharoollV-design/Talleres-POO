package taller_4;

public class Pruebacoche {
    
    public static void main(String[] args) {

        //System.out.println("coche1.marca");
        //coche1.velocidad = 300;
        
        Coche coche1 = new Coche("Mazda", "Mazda CX-30", 200);

        coche1.mostrarInfo();

        coche1.acelerar(20);

        System.out.println("Marca del coche: " + coche1.getMarca());

        coche1.SetVelocidad(220);

        System.out.println("Nueva velocidad: " + coche1.getVelocidad());


    }
}
