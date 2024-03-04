package Model;

public class Siga implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setStop(false);
    }
    
}
