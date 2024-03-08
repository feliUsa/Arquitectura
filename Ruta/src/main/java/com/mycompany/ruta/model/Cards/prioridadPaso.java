package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class prioridadPaso implements Carta{

    @Override
    public void accion(Jugador jugador) {
        System.out.println("metodo no implementado aun");
    }

    private String Url = "com/mycompany/ruta/Resources/prioridadPaso.png";
    
    public String getUrl() {
        return Url;
    }
}
