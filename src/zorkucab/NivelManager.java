package zorkucab;

import zengine.*;

public class NivelManager {
    private Nivel nivel;

    public Nivel getNivel() {
        return this.nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;

        nivel.iniciar();
        nivel.mostrar();
    }
}