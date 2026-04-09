package taller_4;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(){
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.notaPromedio = 0.0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return  edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNombre(String nombre){
        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        } else { 
            System.out.println("El nombre no puede estar sin rellenar");
        }
    }

    public void setEdad(int edad){
        if(edad < 6 && edad < 20) {
            this.edad = edad;
        } else {
            System.out.println("Edad errada, debe ser entre 6 años y 20 años");
        }
    }

    public void setNotaPromedio(double notaPromedio){
        if(notaPromedio >= 0 && notaPromedio <= 5){
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota debe estar entre 0 y 5");
        }
    }

    public Estudiante(String nombre, int edad, double notaPromedio){
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    void mostrarInfo(){
        System.out.println(" ----- Bienvenidos al colegio sonrisas y alegrias -----");
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota promedio: " + notaPromedio);
    }
}
