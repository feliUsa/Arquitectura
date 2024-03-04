package Model;

public class choque implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setChoque(true);
    }

}
