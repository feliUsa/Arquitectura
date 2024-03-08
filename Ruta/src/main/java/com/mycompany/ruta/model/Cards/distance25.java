package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class distance25 implements Carta{

    private String Url = "com/mycompany/ruta/Resources/distance25.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(25);
    }
    
    public String getUrl() {
        return Url;
    }
}
