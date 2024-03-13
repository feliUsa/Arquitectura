package com.mycompany.ruta.model;

import java.util.*;

public class playerFactory {
    private Scanner s = new Scanner(System.in);

    public void createPlayer(List<Jugador> players) {
        System.out.println("Nombre del nuevo jugador:");
        String playerName = s.nextLine();
        Jugador player = new Jugador(playerName, true, 200, true, false, false, 0);
        players.add(player);
    }
}

