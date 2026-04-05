public class Main {
    public static void main(String[] args) {
        System.out.println("Taller #0 Sharooll");

        ejercicio7();
        ejericio8();
    }

    public static void ejercicio7() {
        Estudiante est1 = new Estudiante();
        est1.nombre = "Jessica Mateus";
        est1.codigo = "est1.Jess2026";
        est1.semestre = 6;

        est1.mostrarInfo();

        System.out.println("~~~~~ ");
    }

    public static void ejericio8() {
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

