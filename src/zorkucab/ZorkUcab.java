package zorkucab;

import java.util.*;

import zengine.*;
import zengine.menu.*;
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

        while (j.continuar()) {
            j.run();
        }
    }

    private static class Principal implements Juego {

        Jugador jugador = new Jugador();
        NivelManager nivel;
        Menu menuPrincipal;

        @Override
        public void iniciar() {
            nivel = new NivelManager();
            menuPrincipal = new Menu("ZORK u.c.a.b.", "> ", new ArrayList<>());

            menuPrincipal.opciones.add(new Opcion("Iniciar juego", () -> {
                jugador = crearJugador();
                nivel.setNivel(new Nivel1(jugador, nivel));
                menuPrincipal.cerrar();
            }));
            menuPrincipal.opciones.add(new Opcion("Continuar partida", () -> {
                throw new UnsupportedOperationException("Aun no habilitado");
            }));
            menuPrincipal.opciones.add(new Opcion("Salir", () -> {
                jugador.setHp(0);
                menuPrincipal.cerrar();
            }));

            menuPrincipal.run();
        }

        @Override
        public void run() {
            nivel.getNivel().run();
        }

        @Override
        public boolean continuar() {
            return jugador.vivo() && nivel.getNivel().continuar();
        }

        public Jugador crearJugador() {
            Scanner ent = new Scanner(System.in);
            System.out.print("Nombre del jugador: ");
            String nombre = ent.nextLine();

            return new Jugador(nombre);
        }
    }

}
