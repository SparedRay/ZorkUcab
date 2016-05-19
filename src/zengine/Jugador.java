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
        System.out.println("STATS:");
        System.out.println("hp: " + this.hp);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defensa: " + this.defensa);
    }
    
}
