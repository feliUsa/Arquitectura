package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class velMax25 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setVelMax(25);
    }

}
