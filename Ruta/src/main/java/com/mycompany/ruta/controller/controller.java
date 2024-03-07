package com.mycompany.ruta.controller;

import java.util.List;

import com.mycompany.ruta.model.Jugador;
import com.mycompany.ruta.model.cardDealer;
import com.mycompany.ruta.model.cardFactory;
import com.mycompany.ruta.model.playerFactory;
import com.mycompany.ruta.model.shuffler;
import com.mycompany.ruta.model.Cards.pinchazo;
import com.mycompany.ruta.model.Cards.Carta;


public class controller {
    
    private List<Carta> objetos;
    
    public controller() {

        
        //Creacion de las Cartas
        cardFactory cardFactory = new cardFactory();
        objetos = cardFactory.createCards();
        // System.out.println(objetos + " Cartas desde el controlador");

        //Creacion de los Jugadores
        playerFactory playerFactory = new playerFactory();
        List<Jugador> jugadores = playerFactory.createPlayers();
        System.out.println("\nJugadores creados:");
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getName());
        }
        // System.out.println(jugadores + " Jugadores desde el controlador");

        //Mezclar baraja
        List<Carta> cardsShufled = shuffler.shuffleObjects(objetos);
        // System.out.println(cardsShufled + "cartas mezcladas desde el controlador. Hay " + cardsShufled.size() + " cartas");
    
        //Repartir Cartas
        cardDealer.dealCards(jugadores, cardsShufled);


        System.out.println("TTTTT  EEEEE  SSSSS   TTTTT   OO ");
        System.out.println("  T    E      S         T    O  O");
        System.out.println("  T    EEE     SSS      T    O  O");
        System.out.println("  T    E          S     T    O  O");
        System.out.println("  T    EEEEE  SSSSS     T     OO");
        //TESTS
        pinchazo pinchazoTest = new pinchazo();
        //jugadores.get(0).jugarCartaOponente(jugadores.get(1), pinchazoTest);
        System.out.println("el atributo pinchazo se encuentra del jugador: " +jugadores.get(1).getName() + "Se encuentra: " + jugadores.get(1).isPinchazo());
    }

}