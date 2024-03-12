package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class repuesto implements Carta{

    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/repuesto.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setPinchazo(false);
    }
    
    public String getUrl() {
        return Url;
    }
}
