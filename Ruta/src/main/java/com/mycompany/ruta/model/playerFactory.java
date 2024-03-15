package com.mycompany.ruta.model;
import java.util.Scanner;

public class playerFactory {
    public static Jugador createPlayer() {

        Scanner p = new Scanner(System.in);
        
        System.out.println("Nombre jugador nuevo");
        String playerName = p.nextLine();

        Jugador player = new Jugador(playerName, true, 200, true, false, false, 0);
        System.out.println("\n\nJugador " + playerName + " creado: " + player.toString()+ "\n\n");
        return player;
    }

}

