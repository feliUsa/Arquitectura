package Controller;

import java.util.List;

import Model.Carta;
import Model.Jugador;


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
        System.out.println(cardsShufled + "cartas mezcladas desde el controlador. Hay " + cardsShufled.size() + " cartas");
    
        //Repartir Cartas
        cardDealer.dealCards(jugadores, cardsShufled);
    }

}
