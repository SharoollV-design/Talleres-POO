package taller_5;

public class Persona {
     
    private String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void SetNombre(String nombre){
        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    void mostrarInfo() {
        System.out.println(" ---- PERSONA ----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " +edad);
    }
}
