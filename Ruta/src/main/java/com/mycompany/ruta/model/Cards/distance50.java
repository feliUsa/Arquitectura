package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class distance50 implements Carta {
    
    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/distance50.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(50);
    }
    
    public String getUrl() {
        return Url;
    }
}
