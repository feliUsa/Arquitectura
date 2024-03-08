package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class stop implements Carta {

    @Override
    public void accion(Jugador jugador) {
        jugador.setStop(false);
    }
    
    private String Url = "com/mycompany/ruta/Resources/stop.png";
    
    public String getUrl() {
        return Url;
    }
}
