package Taller_0;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    void activar(){
        activo  = true; 
    }

    void desactivar() {
        activo = false;
    }

    void mostrarInfo() {
        System.out.println("Cuenta " + (activo ? "Activa" : "Desactivada"));
    }
}
