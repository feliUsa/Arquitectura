package com.mycompany.ruta.model;

import java.util.List;
import java.util.Random;

import com.mycompany.ruta.model.Cards.Carta;

public class cardDealer {
    public static void dealCards(List<Jugador> players, List<Carta> deck) {
        Random random = new Random();
        int numCardsPerPlayer = 6; // Número de cartas por jugador

        for (Jugador player : players) {
            for (int i = 0; i < numCardsPerPlayer; i++) {
                if (deck.isEmpty()) {
                    break; // Si ya no hay cartas en el mazo, salir del bucle interno
                }
                int randomIndex = random.nextInt(deck.size());
                Carta card = deck.remove(randomIndex);
                player.addCard(card);
            }
        }
    }
}
