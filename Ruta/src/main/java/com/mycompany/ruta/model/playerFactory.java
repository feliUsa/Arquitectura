package com.mycompany.ruta.model;

import java.util.*;

public class playerFactory {
    private static int numPlayers;
    public Scanner s = new Scanner(System.in);;

    public static void setNumPlayers(int num) {
        numPlayers = num;
    }

    public List<Jugador> createPlayers(){
        List<Jugador> players = new ArrayList<>();

        // Pedir al usuario la cantidad de jugadores
        System.out.println("Cantidad de jugadores");
        numPlayers = s.nextInt();

        // Recibir los nombres de los jugadores
        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Nombre jugador " + i + ":");
            s.nextLine(); // Consume el carácter de nueva línea pendiente
            String playerName = s.nextLine();
            Jugador player = new Jugador(playerName, true, 200, true, false, false, 0);
            players.add(player);
        }

        return players;
    }
}
