package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class emptyFuel implements Carta {

    @Override
    public void accion(Jugador jugador) {
        jugador.setCombustible(false);
    }
    
    private String Url = "com/mycompany/ruta/Resources/emptyFuel.png";
    
    public String getUrl() {
        return Url;
    }

}
