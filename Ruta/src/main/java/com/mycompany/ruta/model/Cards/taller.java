package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class taller implements Carta {

    @Override
    public void accion(Jugador jugador) {
        jugador.setChoque(false);
    }
}
