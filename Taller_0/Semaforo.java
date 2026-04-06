package Taller_0;

public class Semaforo {
    String colorActual;

    public Semaforo(String colorActual) {
        this.colorActual = colorActual;
    }
    
    void cambiarColor() {
        if(colorActual.equals("Rojo")) {
            colorActual = "Verde";
        } else if (colorActual.equals("Verde")) {
            colorActual = "Amarillo";
        } else if (colorActual.equals("Amarillo")) {
            colorActual = "Rojo";
        }

        System.out.println("Color actual: " + colorActual);
    }
}
