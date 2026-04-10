package taller_4;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidad;

    public Coche(){
        this.marca = "Sin marca";
        this.modelo = "Deconocido2";
        this.velocidad = 0.0;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public void SetMarca(String marca){
        if(marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("No se registra marca");  
        }
    }

    public void SetModelo(String modelo){
        if(modelo != null && !marca.isEmpty()){
            this.modelo = modelo;
        } else {
            System.out.println("Modelo desconocido");
        }
    }

    public void SetVelocidad(double velocidad){
        if (velocidad > 0) {
            this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad debe ser postiva");
        }
    }

    public Coche(String marca, String modelo, double velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void acelerar(int incremento){
        if (incremento > 0){
            velocidad += incremento;
            System.out.println("El coché acelero, nueva velocidad: " + velocidad);
        } else {
            System.out.println("El incremento debe ser positivo");
        }
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
    }

}