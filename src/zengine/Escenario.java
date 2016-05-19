package zengine;

/**
 *
 * @author SparedRay
 */
public abstract class Escenario implements Juego {
	protected Jugador jugador;

	public Escenario(Jugador jugador) {
		this.jugador = jugador;
	}

	public Escenario() {
		this(new Jugador());
	}

	public abstract void mostrar();
}