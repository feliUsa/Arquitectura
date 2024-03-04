package Model;

public class distance50 implements Carta {
    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(50);
    }
}
