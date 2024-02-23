package ModeloPackageInterface;

import ModeloPackage.jugador;

public interface cartaSeguridadInterface extends carta{

    public void aplicarEfecto(jugador player);
    public int getValorCarta();
    
}