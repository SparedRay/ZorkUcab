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
        System.out.print("\n|------------------------------");
        System.out.print("\n|(ง ͡ʘ ͜ʖ ͡ʘ)ง |   " + nombre);
        System.out.print("\n|---------------");
        System.out.print("\n| hp: " + this.hp);
        System.out.print("\n| Ataque: " + this.ataque);
        System.out.print("\n| Defensa: " + this.defensa);
        System.out.print("\n|------------------------------\n");
    }
    
}
