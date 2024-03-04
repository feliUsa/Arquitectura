package Model;

public class distance75 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(75);
    }
}
