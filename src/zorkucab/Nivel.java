package zorkucab;

import java.util.Scanner;
import java.util.ArrayList;

import zengine.*;

/**
 *
 * @author SparedRay
 */
public abstract class Nivel extends Escenario {
    protected NivelManager nivelManager;

    public Nivel(Jugador jugador, NivelManager nivelManager) {
        super(jugador);
        this.nivelManager = nivelManager;
    }

    public Nivel(Jugador jugador) {
        super(jugador);
    }

    public void setNivelManager(NivelManager nivelManager) {
        this.nivelManager = nivelManager;
    }

    public abstract boolean continuar();
    public abstract void iniciar();
    public abstract void mostrar();
    public abstract void run();
}
