/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Modelo.Jugador;


/**
 *
 * @author bella
 */
public class playerFactory {

    public List<Jugador> createPlayers() {
        Scanner scanner = new Scanner(System.in);
        List<Jugador> players = new ArrayList<>();

        System.out.print("Ingrese la cantidad de jugadores: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Ingrese el nombre del jugador " + i + ": ");
            String playerName = scanner.nextLine();
            Jugador player = new Jugador(playerName, true, 200, true, false, false, 0);
            players.add(player);
        }

        scanner.close();
        return players;
    }
}