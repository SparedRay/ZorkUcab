package zorkucab;

import zengine.*;
import zorkucab.niveles.*;

/**
 *
 * @author SparedRay
 */
public class ZorkUcab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego j = new Principal();
        j.iniciar();

        do {
            j.run();
        } while (j.continuar());
    }

    private static class Principal implements Juego {

        Jugador jugador = new Jugador();
        Escenario nivel;

        @Override
        public void iniciar() {
            nivel = new Nivel1(jugador);
            nivel.iniciar();
            nivel.mostrar();
        }

        @Override
        public void run() {
            nivel.run();
        }

        @Override
        public boolean continuar() {
            return jugador.vivo() && nivel.continuar();
        }
    }

}
