package Model;

public class fullFuel implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setCombustible(true);
    }

}
