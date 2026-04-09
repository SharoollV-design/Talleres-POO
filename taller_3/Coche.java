package taller_3;
public class Coche {
   
    private String marca;
    private String modelo;

    int numeroCoches;

    private static  int contadorCoches = 0;

    public Coche(String marca, String modelo){

        if(marca == null || marca.isEmpty()) {
            this.marca = "Marca Desconocida";
        } else {
            this.marca = marca;
        }

        if(modelo == null || modelo.isEmpty()) {
            this.modelo = "Modelo Deconocido";
        } else {
            this.modelo = modelo;
        }

        contadorCoches++;
        this.numeroCoches = contadorCoches;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getNumeroCoches(){
        return numeroCoches;
    }

    public static int getContadorCoches(){
        return contadorCoches;
    }

    public void mostrarDetalles(){
        String texto = String.format("Coche numero: %d\n\nMarca: %s\nModelo: %s\n",
        numeroCoches, marca, modelo);
    System.out.println(texto);
    }

    public static void main(String[] args) {
        Coche c1= new Coche("Mazda", "Mazda CX-30");
        Coche c2= new Coche("Mercedes", "");
        Coche c3= new Coche("", "Corolla");

        c1.mostrarDetalles();
        c2.mostrarDetalles();
        c3.mostrarDetalles();

        System.out.println("Total de coches: " + Coche.getContadorCoches());
    }
}

