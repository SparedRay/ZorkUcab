package zorkucab;

import zengine.*;

public class NivelManager {
    private Escenario nivel;

    public NivelManager(Escenario nivel) {
        this.nivel = nivel;
    }

    public NivelManager() {
    }

    public Escenario getNivel() {
        return this.nivel;
    }

    public void setNivel(Escenario nivel) {
        this.nivel = nivel;
    }
}