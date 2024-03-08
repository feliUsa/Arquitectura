package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class pinchazo implements Carta{

    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/pinchazo.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setPinchazo(true);
    }
    
    public String getUrl() {
        return Url;
    }
}
