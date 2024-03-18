package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class finVelMax implements Carta{
    
    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/finVelMax.png";
    private String tipo = "Limite";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setVelMax(200);
    }
    
    public String getUrl() {
        return Url;
    }

    public String getTipo() {
        return tipo;
    }

    
}
