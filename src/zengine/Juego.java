package zengine;

/**
 *
 * @author SparedRay
 */
public class Juego {
    private Jugador jugador;
    
    public Juego() {
        this.jugador = new Jugador();
    }
    
    public void iniciar() {
        System.out.println("Partida iniciada");
    }
}
