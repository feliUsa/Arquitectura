package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class distance75 implements Carta{

    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/distance75.png";
    private String tipo = "Distancia";

    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(75);
    }
    
    public String getUrl() {
        return Url;
    }

    public String getTipo() {
        return tipo;
    }
    
}
