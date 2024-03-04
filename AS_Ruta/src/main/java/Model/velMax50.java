package Model;

public class velMax50 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setVelMax(50);
    }

}
