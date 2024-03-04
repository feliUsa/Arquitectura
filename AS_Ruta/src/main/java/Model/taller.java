package Model;

public class taller implements Carta {

    @Override
    public void accion(Jugador jugador) {
        jugador.setChoque(false);
    }
}
