package Taller_0;

public class Main {
    public static void main(String[] args) {
        System.out.println("Taller #0 Sharooll");

        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio22();

    }

    public static void ejercicio6() {
        Estudiante est1 = new Estudiante();
        est1.nombre = "Jessica Mateus";
        est1.codigo = "est1.Jess2026";
        est1.semestre = 6;
        est1.cambiarSemestre(8);
        est1.mostrarInfo();

        System.out.println("---");

        Estudiante est2 = new Estudiante();
        est2.nombre = "Caleb A";
        est2.codigo = "est2.Caleb2026";
        est2.semestre = 3;
        est2.mostrarInfo();

        System.out.println("---");

        Estudiante est3 = new Estudiante();
        est3.nombre = "Sharoll M";
        est3.codigo = "est3.Sharoll2026";
        est3.semestre = 2;
        est3.mostrarInfo();

        System.out.println("---");

        Estudiante est4 = new Estudiante();
        est4.nombre = "Juan Pablo";
        est4.codigo = "est4.JuanPa2026";
        est4.semestre = 7;
        est4.mostrarInfo();

        System.out.println(" ");

        Estudiante est5 = new Estudiante();
        est5.nombre = "Sara";
        est5.codigo = "est5.Sara2026";
        est5.semestre = 1;
        est5.mostrarInfo();

        System.out.println(" ");

        Estudiante est6 = new Estudiante("Jairo", "est6,Jairo2026");
        est6.mostrarInfo();

        System.out.println();

        Estudiante est7 = new Estudiante("Sofia", "est7.Sofia2026", 9);
        est7.mostrarInfo();

        System.out.println("~~~~~ ");
    }

    public static void ejercicio7() {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Mazda";
        vehiculo1.modelo = "Mazda CX-30";
        vehiculo1.velocidadActual = 100;
        vehiculo1.acelerar();
        vehiculo1.mostrarEstado();

        System.out.println(" ");
        
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Mercedes";
        vehiculo2.modelo = "Mercedes-AMG GT";
        vehiculo2.velocidadActual = 200;
        vehiculo2.frenar();
        vehiculo2.mostrarEstado();

        System.out.println("~~~~~ ");
    }

    public static void ejercicio8() {
        
        Producto produc1 = new Producto();
        produc1.nombre = "Maleta";
        produc1.precio = 90.000;
        produc1.stock = 3;
        produc1.vender(2);
        produc1.mostrarProducto();

        System.out.println("---");

        Producto produc2 = new Producto();
        produc2.nombre = "Billetera";
        produc2.precio = 60.000;
        produc2.stock = 2;
        produc2.reabastecer(3);
        produc2.mostrarProducto();

        System.out.println("---");

        Producto produc3 = new Producto();
        produc3.nombre = "Cinturon";
        produc3.precio = 55.000;
        produc3.stock = 4;
        produc3.mostrarProducto();

        System.out.println("---");

        Producto produc5 = new Producto("Blusa", 70.000, 7);
        produc5.mostrarProducto();

        System.out.println("~~~~~");
    }

    public static void ejercicio9() {
        
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Kimmy";
        mascota1.especie = "Gato";
        mascota1.edad = 1;
        mascota1.cumplirAnios();
        //System.out.println("Estado inicial de la mascota");
        mascota1.mostrarMascota();

        //mascota1.edad = 3;

        //System.out.println("Estado despues del cambio");
       // mascota1.mostrarMascota();

       System.out.println("---");

       Mascota mascota2 = new Mascota();
       mascota2.nombre = "Canela";
       mascota2.especie = "Perro";
       mascota2.edad = 3;
       mascota2.mostrarMascota();

       System.out.println("---");

       Mascota mascota3 = new Mascota();
       mascota3.nombre = "Boss";
       mascota3.especie = "Perro";
       mascota3.edad = 8;
       mascota3.mostrarMascota();

        System.out.println("~~~~~");
    }

    public static void ejercicio10() {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = "A101020267171";
        cuenta1.titular = "Ana Mar";
        cuenta1.saldo = 50000;
        cuenta1.consignar(300);
        cuenta1.mostrarCuenta();

        System.out.println( " --- ");
        
        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numero = "A101020267025";
        cuenta2.titular = "Valentina Moreno";
        cuenta2.saldo = 5000000;
        cuenta1.retirar(60000000);
        cuenta2.mostrarCuenta();

        System.out.println("---");

        CuentaBancaria cuenta3 = new CuentaBancaria("A101020264567", "Andres Rodriguez", 2000); 
        cuenta3.mostrarCuenta();

        System.out.println(" ");

        CuentaBancaria cuenta4 = new CuentaBancaria("A101020265678", "Viviana V", 10000000);
        cuenta4.mostrarCuenta();

        System.err.println(" ");

        CuentaBancaria cuenta5 = new CuentaBancaria("A101020262029", "Carlos R", 55000);
        cuenta5.mostrarCuenta();

        System.out.println("~~~~~");
    }

    public static void ejercicio22() {

        Libro lib1 = new Libro();
        lib1.autor = "Joana Marcus";
        lib1.titulo = "Antes de diciembre";
        lib1.cantidad = 435;
        lib1.mostrarInfo();

        System.out.println("---");

        Libro lib2 = new Libro();
        lib2.autor = "Alice Kellen";
        lib2.titulo = "Nosotros en la luna";
        lib2.cantidad = 500;
        lib2.mostrarInfo(); 

        System.out.println("---");

        Libro lib3 = new Libro();
        lib3.autor = "Karine Bernal";
        lib3.titulo = "El corazón del rey";
        lib3.cantidad = 455;
        lib3.mostrarInfo();

        System.out.println("---");

        Libro lib4 = new Libro();
        lib4.autor = "Jane Austen";
        lib4.titulo = "Orgullo y prejuicio";
        lib4.cantidad = 600;
        lib4.mostrarInfo();

        System.out.println("---");

        Libro lib5 = new Libro("Emma", "Jane Austen", 1000);
        lib5.mostrarInfo();

        System.out.println("~~~~~~");

        
    }
}