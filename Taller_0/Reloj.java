package Taller_0;

public class Reloj {
    int hora; 
    int minuto;
    int segundo; 

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    void mostrarHora() {
        System.out.println("Hora " + hora + ":" + minuto + ":" + segundo);
    }
}
