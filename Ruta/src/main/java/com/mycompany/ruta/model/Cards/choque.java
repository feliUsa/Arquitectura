package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class choque implements Carta{
    private String Url = "com/mycompany/ruta/Resources/choque.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setChoque(true);
    }
    
    public String getUrl() {
        return Url;
    }
    
}
