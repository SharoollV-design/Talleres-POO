package Taller_1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Estudiante";
        this.edad = 0;
        this.curso = "No se registra curso";
    }

    public Estudiante(String nombre, int edad) {

        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("No se registra nombre, se asigna por defecto 'Estudiante'");
            this.nombre = "Estudiante";
        }

        if(edad>0){
            this.edad = edad;
        } else {
            System.out.println("No se registra edad, se asigna por defecto '0'");
            this.edad = 0;
        }

        this.curso = "No se registra curso";
    }

    public Estudiante(String nombre, int edad, String curso) {

        this(nombre,edad);

        if (curso != null && !curso.isEmpty()){
            this.curso = curso;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public void SetNombre(String nombre){
        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        } else {
            this.nombre = "Estudiante";
        }
    }

    public void SetEdad(int edad){
        if(edad>0){
            this.edad = edad;
        } else {
            this.edad = 0;
        }
    }

    public void SetCurso(String curso){
        if(curso != null && !curso.isEmpty()){
            this.curso = curso;
        }
    }

    @Override
    public String toString() {
        return "Estudiante - " +
        "Nombre= '" + nombre + '\'' +
        ", Edad= '" + edad +  '\'' +
        ", Curso= " + curso +
        '-';
    }


}
