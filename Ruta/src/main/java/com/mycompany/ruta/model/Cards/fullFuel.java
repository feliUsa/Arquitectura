package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class fullFuel implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setCombustible(true);
    }

}
