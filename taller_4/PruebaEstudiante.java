package taller_4;

public class PruebaEstudiante {
    
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Sharoll", 15, 4.4);

        System.out.println("Nombre del estudiante: " + estudiante1.getNombre());
        System.out.println("Edad: "+ estudiante1.getEdad());
        System.out.println("Nota promedio: " + estudiante1.getNotaPromedio());

        estudiante1.setEdad(11);
        estudiante1.setNotaPromedio(3.5);

        System.out.println("\n--Datos nuevos: ");
        System.out.println("Nombre del estudiante: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota promedio: " + estudiante1.getNotaPromedio());

        estudiante1.setNotaPromedio(8.9);
        estudiante1.setEdad(-15);
    }
}
