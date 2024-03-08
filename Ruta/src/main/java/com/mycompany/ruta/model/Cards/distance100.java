package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class distance100 implements Carta{
    
    private String Url = "com/mycompany/ruta/Resources/distance100.png";
    @Override
    
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(100);
    }

    
    public String getUrl() {
        return Url;
    }
    
    
}
