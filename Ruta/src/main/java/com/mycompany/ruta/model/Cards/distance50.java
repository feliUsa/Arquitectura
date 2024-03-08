package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class distance50 implements Carta {
    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(50);
    }
    
    private String Url = "com/mycompany/ruta/Resources/distance50.png";
    
    public String getUrl() {
        return Url;
    }
}
