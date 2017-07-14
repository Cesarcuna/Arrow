package heme.mx.com.arrow.DataBase.Catalogo;

/**
 * Created by Chris on 06/07/2017.
 */

public enum UsuariosDO {
    SERVICIO("SERVICIO"),
    ADMINISTRADOR("ADMINISTRADOR"),
    CLIENTE("CLIENTE");

    private final String nombre;

    private UsuariosDO(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
