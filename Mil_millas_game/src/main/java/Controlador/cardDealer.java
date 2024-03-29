/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Carta;
import Modelo.Jugador;
import java.util.List;
import java.util.Random;

/**
 *
 * @author bella
 */
public class cardDealer {
    public static void dealCards(List<Jugador> players, List<Carta> deck) {
        Random random = new Random();
        int numCardsPerPlayer = 6; // Número de cartas por jugador

        for (Jugador player : players) {
            System.out.println("Cartas de " + player.getName() + ":"); // Mostrar el nombre del jugador

            for (int i = 0; i < numCardsPerPlayer; i++) {
                if (deck.isEmpty()) {
                    break; // Si ya no hay cartas en el mazo, salir del bucle interno
                }
                int randomIndex = random.nextInt(deck.size());
                Carta card = deck.remove(randomIndex);
                player.addCard(card);
                System.out.println(card); // Mostrar la carta repartida al jugador
            }

            System.out.println(); // Separador entre manos de jugadores
        }
        System.out.println(deck + "Lista de cartas, Hay " + deck.size() + "cartas restantes en el mazo");
    }
}
