package zorkucab.niveles;

import java.util.Scanner;
import java.util.ArrayList;

import zorkucab.Nivel;
import zorkucab.NivelManager;
import zengine.*;

/**
 *
 * @author SparedRay
 */
public class Nivel2 extends Nivel {
    private Scanner ent = new Scanner(System.in);
    private ArrayList<Entidad> npc = new ArrayList<>();

    public Nivel2(Jugador jugador, NivelManager nivelManager) {
        super(jugador, nivelManager);
    }

    @Override
    public void iniciar() {
        npc.add(new Jugador(50, 0, 0));
    }

    @Override
    public void mostrar() {
        System.out.println("Hola soy Jose y soy otro npc");
        npc.get(0).mostrar();
    }

    @Override
    public void run() {
        System.out.print("Salir? (Y/n) ");
        char salir = ent.next().charAt(0);

        if (salir == 'Y') {
            jugador.setHp(0);
        } else {
        	System.out.println("Asi que no te quieres ir eh?");
        }
    }

    @Override
    public boolean continuar() {
        return true;
    }
}
