package Model;

public class emptyFuel implements Carta {

    @Override
    public void accion(Jugador jugador) {
        jugador.setCombustible(false);
    }

}
