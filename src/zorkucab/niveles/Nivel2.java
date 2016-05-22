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
public class Nivel2 extends Nivel {
    private Scanner ent = new Scanner(System.in);
    private ArrayList<Entidad> npc = new ArrayList<>();

    String lore = "En tu camino parece no faltarte gente, rapidamente escuchas \"Hola soy Jose y soy otro npc\"";
    Menu menu = new Menu(lore, "Tu > ", new ArrayList<>());

    public Nivel2(Jugador jugador, NivelManager nivelManager) {
        super(jugador, nivelManager);
    }

    @Override
    public void iniciar() {
        npc.add(new Jugador("Jose", 50, 0, 0));
    }

    @Override
    public void mostrar() {
        menu.opciones.add(new Opcion<Integer>("Respondes: Hola", () -> {
            System.out.println("Espero que no te encontraras a Willie, este tipo es un pesao.");
            return 0;
        }));
        menu.opciones.add(new Opcion<Integer>("Examinas a \"Willie\"", () -> {
            npc.get(0).mostrar();
            return 0;
        }));
        menu.opciones.add(new Opcion<Integer>("Regresas a la entrada", () -> {
            menu.cerrar();
            nivelManager.setNivel(new Nivel1(jugador, nivelManager));
            return 0;
        }));
        menu.opciones.add(new Opcion<Integer>("Te vas de la universidad", () -> {
            menu.cerrar();
            System.out.println("Asi que te quieres ir eh?");
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
