package Taller_0;

public class Voleibol {
    String nombredelequipo;
    String entrenador;
    int victorias;

    public Voleibol (String nombredelequipo, String entrenador, int victorias) {
        this.nombredelequipo = nombredelequipo;
        this.entrenador = entrenador;
        this.victorias = victorias;
    }

    void registrarVictorias() {
        victorias += 1;
    }

    void mostrarInfo() {
        System.out.println("Nombre del equipo: " + nombredelequipo);
        System.out.println("Nombre del entrenador: " + entrenador);
        System.out.println("Numero de victorias: " + victorias);
    }
}
