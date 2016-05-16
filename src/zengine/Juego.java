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
    
    public void run() {
        System.out.println("Partida en curso");
    }
    
    public boolean continuar() {
        return jugador.vivo();
    }
}
