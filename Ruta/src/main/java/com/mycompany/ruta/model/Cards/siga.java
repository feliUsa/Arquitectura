package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class siga implements Carta{

    @Override
    public void accion(Jugador jugador) {
        jugador.setStop(false);
    }
    
    private String Url = "com/mycompany/ruta/Resources/siga.png";
    
    public String getUrl() {
        return Url;
    }
}
