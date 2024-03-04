package Model;

public class distance25 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(25);
    }
}
