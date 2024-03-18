package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class siga implements Carta{

    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/siga.png";
    private String tipo = "Puja";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.setStop(false);
    }
    
    public String getUrl() {
        return Url;
    }

    public String getTipo() {
        return tipo;
    }
}
