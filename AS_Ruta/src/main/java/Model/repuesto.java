package Model;

public class repuesto implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setPinchazo(false);
    }
}
