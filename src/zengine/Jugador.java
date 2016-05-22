package zengine;

/**
 *
 * @author SparedRay
 */
public class Jugador extends Entidad {

    private String nombre;

    public Jugador(String nombre, float hp, float ataque, float defensa) {
        super(hp, ataque, defensa);
        this.nombre = nombre;
    }

    public Jugador(float hp, float ataque, float defensa) {
        this("", hp, ataque, defensa);
    }

    public Jugador(String nombre) {
        this(nombre, 100, 10, 0);
    }
    
    public Jugador() {
        this("", 100, 10, 0);
    }
    
    public boolean vivo() {
        return this.hp > 0;
    }
    
    @Override
    public void mostrar() {
        System.out.println(nombre + " STATS:");
        System.out.println("hp: " + this.hp);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defensa: " + this.defensa);
    }
    
}
