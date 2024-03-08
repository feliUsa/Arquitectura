package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class repuesto implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setPinchazo(false);
    }
    
    private String Url = "com/mycompany/ruta/Resources/repuesto.png";
    
    public String getUrl() {
        return Url;
    }
}
