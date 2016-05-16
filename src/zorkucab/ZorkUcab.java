package zorkucab;

import zengine.Juego;

/**
 *
    * @author SparedRay
 */
public class ZorkUcab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego j = new Juego();
        j.iniciar();
        
        do {
            j.run();
        } while(j.continuar());
    }
    
}
