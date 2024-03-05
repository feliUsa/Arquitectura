package Model;

public class distance200 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(200);
    }
}
