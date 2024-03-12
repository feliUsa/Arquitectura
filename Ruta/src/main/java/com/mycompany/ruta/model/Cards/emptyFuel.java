package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class emptyFuel implements Carta {

    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/emptyFuel.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setCombustible(false);
    }
    
    public String getUrl() {
        return Url;
    }

}
