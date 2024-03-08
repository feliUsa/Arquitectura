package com.mycompany.ruta.controller;

import java.util.List;

import com.mycompany.ruta.model.Jugador;
import com.mycompany.ruta.model.cardDealer;
import com.mycompany.ruta.model.cardFactory;
import com.mycompany.ruta.model.playerFactory;
import com.mycompany.ruta.model.shuffler;
import com.mycompany.ruta.model.Cards.Carta;
import com.mycompany.ruta.view.window;


public class controller {
    
    private List<Carta> objetos;
    
    public controller() {

        //Creacion de vista
        window Gui = new window();
        Gui.setVisible(true);
        Gui.setLocationRelativeTo(null);

        //Creacion de las Cartas
        cardFactory cardFactory = new cardFactory();
        objetos = cardFactory.createCards();
        System.out.println(objetos + " Cartas desde el controlador");   

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
        cardDealer.dealCards(jugadores, objetos);


        System.out.println("TTTTT  EEEEE  SSSSS   TTTTT   OO ");
        System.out.println("  T    E      S         T    O  O");
        System.out.println("  T    EEE     SSS      T    O  O");
        System.out.println("  T    E          S     T    O  O");
        System.out.println("  T    EEEEE  SSSSS     T     OO");
        //TESTS
        
        Jugador objeto1 = jugadores.get(0);
        Carta carta1 = objeto1.;
        System.out.println(carta1);
        //Gui.establecerIconoEnBoton(card1,objeto1.);
        
    }
}