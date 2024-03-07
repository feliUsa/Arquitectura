package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class distance200 implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(200);
    }
}
