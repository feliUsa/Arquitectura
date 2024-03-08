package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class choque implements Carta{
    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/choque.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setChoque(true);
    }
    
    public String getUrl() {
        return Url;
    }
}
