package zengine.menu;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fundafe
 * @param <T>
 */
public class Opcion<T> implements Option<T> {

    public String nombre;
    public Callable<T> accion;

    public Opcion(String nombre, Callable<T> accion) {
        this.nombre = nombre;
        this.accion = accion;
    }

    @Override
    public T accion() {
        try {
            return this.accion.call();
        } catch (Exception ex) {
            Logger.getLogger(Opcion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (T) this.accion;
    }
}
