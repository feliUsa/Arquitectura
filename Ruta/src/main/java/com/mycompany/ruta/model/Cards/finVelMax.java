package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class finVelMax implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setVelMax(200);
    }

}
