package co.com.ws.state;

/**
 * Los estados deben iniciar en cero, no se deben cambiar.
 * @author Claudia
 *
 */
public enum EstadoSolicitud {

    ABIERTO(0), CERRADO(1);

    private int estado;

    EstadoSolicitud(int code) {
	estado = code;
    }

    public int getEstado() {
	return estado;
    }
}
