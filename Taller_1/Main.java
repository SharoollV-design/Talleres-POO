package Taller_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Objeto de la clase Libro
        System.out.println("Ingrese los datos del libro que sea comprar ");
        System.out.println("Titulo del libro: ");
        String titulo = sc.nextLine();

        System.out.println("Autor del libro: ");
        String autor = sc.nextLine();

        int numeroPaginas;
        while (true) {
            System.out.println("Ingrese numero de paginas: ");
            if(sc.hasNext()) {
                numeroPaginas = sc.nextInt();
                if (numeroPaginas > 0) {
                    break;
                } else {
                    System.out.println("Numero de paginas incorrecto, debe ser mayor a 0.");
                }
            } else {
                System.out.println("Debe ingresar un numero valido");
                sc.next();
            }
        }
        sc.nextLine();

        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // Objeto de la clase Cuenta BancariaA
        System.out.println("Bienvenido al banco");
        System.out.println("Ingrese el numero de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.println("Ingrese tipo de cuenta");
        String tipoCuenta = sc.nextLine();

        double saldo;
        while(true) {
            System.out.println("Ingrese saldo inicial: ");
            if(sc.hasNextDouble()) {
                saldo = sc.nextDouble();
                if(saldo>= 0) {
                    break;
                } else {
                    System.out.println("El saldo no puede ser negativo.");
                }
            } else {
                System.out.println("Debe ingresar un numero valido.");

                sc.next();
            }
        }

        sc.nextLine();
        
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, tipoCuenta, saldo);

        // Objetos de la clase estudiante
        System.out.println("Bienvenido al Colegio Sonrisas y alegria");
        System.out.println("Por favor ingrese sus datos");
        System.out.println("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        int edad;
        while (true) { 
            System.out.println("Ingrese su edad: " );
            if(sc.hasNextInt()) {
                edad = sc.nextInt();
                //sc.nextLine();
                if (edad > 0) {
                    break;
                } else {
                    System.out.println("La edad debe ser mayor a cero.");
                }
            } else {
                System.out.println("Debe ingresar un numero valido");
                sc.nextInt();
            }
        }
        sc.nextLine();

        System.out.println("Ingrese su curso: ");
        String curso = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostramos los datos

        System.out.println("==== Datos ingresados ==== ");
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

    }
}
