package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class prioridadPaso implements Carta{
    
    private String Url = "Ruta/src/main/java/com/mycompany/ruta/resources/images/prioridadPaso.png";
    private String tipo = "Seguridad";

    @Override
    public void accion(Jugador jugador) {
        System.out.println("metodo no implementado aun");
    }

    public String getUrl() {
        return Url;
    }

    public String getTipo() {
        return tipo;
    }
}
