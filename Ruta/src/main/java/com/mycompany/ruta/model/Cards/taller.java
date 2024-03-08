package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class taller implements Carta {

    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/taller.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setChoque(false);
    }
    
    public String getUrl() {
        return Url;
    }
}
