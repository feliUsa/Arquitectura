package com.mycompany.ruta;

import java.util.List;

import javax.swing.SwingUtilities;

import com.mycompany.ruta.controller.Controller;
import com.mycompany.ruta.model.Jugador;
import com.mycompany.ruta.model.Mesa;
import com.mycompany.ruta.model.Validaciones;
import com.mycompany.ruta.model.cardDealer;
import com.mycompany.ruta.model.cardFactory;
import com.mycompany.ruta.model.Game;
import com.mycompany.ruta.model.playerFactory;
import com.mycompany.ruta.model.shuffler;
import com.mycompany.ruta.model.Cards.Carta;
import com.mycompany.ruta.view.View;

/**
 *
 * @author juan
 */
public class Ruta {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            View vista = new View();
            Controller controlador = new Controller(vista);
            vista.setController(controlador);
            
            // TESTS
            System.out.println("TTTTT  EEEEE  SSSSS   TTTTT   OO ");
            System.out.println("  T    E      S         T    O  O");
            System.out.println("  T    EEE     SSS      T    O  O");
            System.out.println("  T    E          S     T    O  O");
            System.out.println("  T    EEEEE  SSSSS     T     OO ");
            
            // Creacion de las Cartas
            cardFactory cardFactory = new cardFactory();
            List<Carta> objetos = cardFactory.createCards();
            
            // Creacion de los Jugadores
            playerFactory playerFactory = new playerFactory();
            List<Jugador> jugadores = playerFactory.createPlayers();
            controlador.setJugadores(jugadores);
            
            // Creacion del game manager
            Game gameManager = new Game(jugadores.size());
            controlador.setGame(gameManager);

            // Creacion de la mesa junto con las validaciones de la mesa
            Mesa mesa = new Mesa();
            Validaciones validaciones = new Validaciones();
            validaciones.setMesa(mesa);
            controlador.setValidaciones(validaciones);

            // Mezclar baraja
            List<Carta> cardsShufled = shuffler.shuffleObjects(objetos);

            // Repartir Cartas
            cardDealer.dealCards(jugadores, cardsShufled);

            // Proceso para mostrar las cartas en pantalla
            List<Carta> cartasPlayer = jugadores.get(gameManager.getJugadorActual()).getHand();
            controlador.procesarCartas(cartasPlayer);
            
        });
    }
}
