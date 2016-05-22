package zengine.menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martinor
 */
public class Menu {

    private int seleccion;
    private String titulo;
    private String subtitulo;
    public ArrayList<Opcion<?>> opciones;

    public Menu(String titulo, String subtitulo, ArrayList<Opcion<?>> opciones) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.opciones = opciones;
    }

    public Menu(String titulo, ArrayList<Opcion<?>> opciones) {
        this(titulo, "\nOpcion: (0 para salir) ", opciones);
    }

    public Menu() {
        this("|-- Mi Aplicacion --|", new ArrayList<>());
    }

    public void mostrar() {
        System.out.println(this.titulo);
        for (int i = 1; i <= opciones.size(); i++) {
            Opcion<?> o = (Opcion<?>) opciones.get(i - 1);
            System.out.println(i + "> " + o.nombre);
        }
    }

    public void run() {
        Scanner ent = new Scanner(System.in);
        do {
            //this.limpiar();
            this.mostrar();
            System.out.print(this.subtitulo);
            seleccion = ent.nextInt();

            if (seleccion != 0) {
                try {
                    opciones.get(seleccion - 1).accion();
                } catch (IndexOutOfBoundsException e) {
                    System.err.println("Opcion invalida");
                }
            }
        } while (seleccion != 0);
    }

    public void cerrar() {
        this.seleccion = 0;
    }

    public void limpiar() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }
}
