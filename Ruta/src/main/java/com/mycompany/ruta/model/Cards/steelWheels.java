package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class steelWheels implements Carta{

    @Override
    public void accion(Jugador jugador) {
        System.out.println("metodo aun no implementado");
    }
    
    private String Url = "com/mycompany/ruta/Resources/steelWheels.png";
    
    public String getUrl() {
        return Url;
    }

}