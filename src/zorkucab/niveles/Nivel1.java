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
public class Nivel1 extends Nivel {
    private Scanner ent = new Scanner(System.in);
    private ArrayList<Entidad> npc = new ArrayList<>();

    public Nivel1(Jugador jugador, NivelManager nivelManager) {
        super(jugador, nivelManager);
    }

    @Override
    public void iniciar() {
        npc.add(new Jugador(100, 20, 0));
    }

    @Override
    public void mostrar() {
        System.out.println("Hola soy willie y soy un npc");
        npc.get(0).mostrar();
    }

    @Override
    public void run() {
        System.out.print("Salir? (Y/n) ");
        char salir = ent.next().charAt(0);

        if (salir == 'Y') {
            jugador.setHp(0);
        } else {
        	nivelManager.setNivel(new Nivel2(jugador, nivelManager));
        }
    }

    @Override
    public boolean continuar() {
        return true;
    }
}
