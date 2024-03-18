package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class fullFuel implements Carta{

    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/pinchazo.png";
    private String tipo = "Puja";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setCombustible(true);
    }
    
    public String getUrl() {
        return Url;
    }

    public String getTipo() {
        return tipo;
    }
}
