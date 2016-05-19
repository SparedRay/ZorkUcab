package zorkucab.niveles;

import java.util.Scanner;
import java.util.ArrayList;
import zengine.*;

/**
 *
 * @author SparedRay
 */
public class Nivel1 extends Escenario {

    Scanner ent = new Scanner(System.in);
    ArrayList<Entidad> npc = new ArrayList<>();

    public Nivel1(Jugador jugador) {
        super(jugador);
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
        }
    }

    @Override
    public boolean continuar() {
        return true;
    }
}
