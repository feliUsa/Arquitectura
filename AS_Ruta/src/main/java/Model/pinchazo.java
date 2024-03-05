package Model;

public class pinchazo implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setPinchazo(true);
    }
}
