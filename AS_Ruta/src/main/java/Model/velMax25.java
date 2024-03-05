package Model;

public class velMax25 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setVelMax(25);
    }

}
