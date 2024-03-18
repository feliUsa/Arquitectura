package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public interface Carta {
    String getUrl();
    void accion(Jugador jugador);
    String getTipo();
}