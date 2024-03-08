package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class velMax implements Carta{

    private String Url = "Ruta/src/main/java/com/mycompany/ruta1/resources/images/velMax.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setVelMax(50);
    }

    public String getUrl() {
        return Url;
    }
}
