package Model;

public class siga implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setStop(false);
    }
    
}
