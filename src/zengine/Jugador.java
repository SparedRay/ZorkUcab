package zengine;

/**
 *
 * @author SparedRay
 */
public class Jugador extends Entidad {

    public Jugador(float hp, float ataque, float defensa) {
        super(hp, ataque, defensa);
    }
    
    public Jugador() {
        this(100, 10, 0);
    }
    
    public boolean vivo() {
        return this.hp > 0;
    }
    
    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
