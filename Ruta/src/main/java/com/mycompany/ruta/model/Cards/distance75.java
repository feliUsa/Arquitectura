package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class distance75 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(75);
    }
}
