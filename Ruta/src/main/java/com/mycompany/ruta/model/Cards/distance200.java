package com.mycompany.ruta.model.Cards;

import com.mycompany.ruta.model.Jugador;

public class distance200 implements Carta{

    public String Url = "com/mycompany/ruta/Resources/distance200.png";
    
    @Override
    public void accion(Jugador jugador) {
        jugador.sumarDistancia(200);
    }
   
    public String getUrl(){
        return Url;
    }
}
