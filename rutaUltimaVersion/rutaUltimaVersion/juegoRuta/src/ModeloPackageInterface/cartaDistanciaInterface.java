package ModeloPackageInterface;

import ModeloPackage.jugador;

public interface cartaDistanciaInterface extends carta{
    int obtenerDistancia();
    void aplicarEfecto(jugador player);
    void revertirEfecto(jugador player);
    boolean esReversible();
}
