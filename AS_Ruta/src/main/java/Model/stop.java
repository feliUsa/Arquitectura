package Model;

public class stop implements Carta {

    @Override
    public void accion(Jugador jugador) {
        jugador.setStop(false);
    }
}
