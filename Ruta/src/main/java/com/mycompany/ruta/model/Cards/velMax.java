package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class velMax implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setVelMax(50);
    }

    private String Url = "com/mycompany/ruta/Resources/velMax.png";
    
    public String getUrl() {
        return Url;
    }
}
