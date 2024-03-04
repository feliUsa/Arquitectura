package Model;

public class Stop implements Carta {

    @Override
    public void accion(Jugador jugador) {
        jugador.setStop(false);
    }
}
