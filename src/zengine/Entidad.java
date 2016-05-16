package zengine;

/**
 *
 * @author SparedRay
 */
public abstract class Entidad {
    protected float hp;
    protected float ataque;
    protected float defensa;
    
    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public float getDefensa() {
        return defensa;
    }

    public void setDefensa(float defensa) {
        this.defensa = defensa;
    }
    
    public Entidad(float hp, float ataque, float defensa) {
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public Entidad() {
        this(100, 0, 0);
    }
    
    public abstract void mostrar();
}
