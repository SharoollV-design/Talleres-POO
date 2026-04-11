package taller_5;

public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Sharoll", 20);
        
        System.out.println("Nombre: " + persona1.getNombre());

        persona1.SetNombre("Viviana");

        System.out.println("~~~~");

        System.out.println("Nombre actualizado: " + persona1.getNombre());

        System.out.println("    ");

        System.out.println("Edad: " + persona1.edad);

        persona1.edad = 25;

        System.out.println("Edad actualizada: " + persona1.edad);

        persona1.mostrarInfo();
    }
}
