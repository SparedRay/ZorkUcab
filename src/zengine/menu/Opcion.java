package zengine.menu;

/**
 *
 * @author Martinor
 */
public class Opcion implements Runnable {

    public String nombre;
    public Runnable accion;

    public Opcion(String nombre, Runnable accion) {
        this.nombre = nombre;
        this.accion = accion;
    }

    @Override
    public void run() {
        this.accion.run();
    }
}
