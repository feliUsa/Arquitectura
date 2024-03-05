package Model;

public class distance100 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(100);
    }
}
