package Model;

public class finVelMax implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setVelMax(200);
    }

}
