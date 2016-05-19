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
        NivelManager nivel;

        @Override
        public void iniciar() {
            nivel = new NivelManager();
            nivel.setNivel(new Nivel1(jugador, nivel));
        }

        @Override
        public void run() {
            nivel.getNivel().run();
        }

        @Override
        public boolean continuar() {
            return jugador.vivo() && nivel.getNivel().continuar();
        }
    }

}
