package zorkucab.niveles;

import java.util.Scanner;
import java.util.ArrayList;

import zengine.*;
import zengine.menu.*;
import zorkucab.Nivel;
import zorkucab.NivelManager;

/**
 *
 * @author SparedRay
 */
public class Nivel1 extends Nivel {
    private Scanner ent = new Scanner(System.in);
    private ArrayList<Entidad> npc = new ArrayList<>();

    String lore = "Estas parado frente a la salida del metro, parece que hay mucha gente a tu alrededor, pronto escuchas a alguien decir \"Hola soy willie y soy un npc\"";
    private Menu menu = new Menu(lore, "Tu > ", new ArrayList<>());

    public Nivel1(Jugador jugador, NivelManager nivelManager) {
        super(jugador, nivelManager);
    }

    @Override
    public void iniciar() {
        npc.add(new Jugador("Willie"));
    }

    @Override
    public void mostrar() {
        menu.opciones.add(new Opcion<Integer>("Respondes: Hola", () -> {
            System.out.println("Si de hecho creo que ya nos conocemos");
            return 0;
        }));
        menu.opciones.add(new Opcion<Integer>("Examinas a \"Willie\"", () -> {
            npc.get(0).mostrar();
            return 0;
        }));
        menu.opciones.add(new Opcion<Integer>("Caminas al norte", () -> {
            menu.cerrar();
            nivelManager.setNivel(new Nivel2(jugador, nivelManager));
            return 0;
        }));
        menu.opciones.add(new Opcion<Integer>("Te vas de la universidad", () -> {
            menu.cerrar();
            System.out.println("Si tu sigue tu camino eh, no queremos gente como tu aqui");
            jugador.setHp(0);
            return 0;
        }));
    }

    @Override
    public void run() {
        menu.run();
    }

    @Override
    public boolean continuar() {
        return true;
    }
}
