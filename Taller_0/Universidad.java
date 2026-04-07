package Taller_0;

public class Universidad {
    String facultad;
    String carrera;
    int semestre;

    public Universidad(String facultad, String carrera, int semestre) {
        this.facultad = facultad;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    void cambiarCarrera(String nuevaCarrera) {
        carrera = nuevaCarrera;
    }

    void cambiarSemestre(int nuevoSemestre) {
        semestre = nuevoSemestre;
    } 

    void mostrarInfo() {
        System.out.println("Facultad: " + facultad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
