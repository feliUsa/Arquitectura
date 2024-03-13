package com.mycompany.ruta.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mycompany.ruta.model.Jugador;
import com.mycompany.ruta.model.cardDealer;
import com.mycompany.ruta.model.cardFactory;
import com.mycompany.ruta.model.playerFactory;
import com.mycompany.ruta.model.shuffler;
import com.mycompany.ruta.model.Cards.Carta;
import com.mycompany.ruta.view.View;

public class Controller {

    // Atributos para iniciar el juego
    private List<Carta> objetos;
    private View view;
    private List<Jugador> jugadores = new ArrayList<>(); 

    public Controller(View view) {
        this.view = view;
    }

    public void procesarCartas(List<Carta> listaCartas) {
        for (int i = 0; i < listaCartas.size(); i++) {
            Carta carta = listaCartas.get(i);
            String url = carta.getUrl();
            // Enviar la URL junto con el número (posición) de la carta
            enviarUrlConNumero(url, i + 1);
        }
    }

    private void enviarUrlConNumero(String url, int numero) {
        // Verificar si view está inicializado correctamente
        if (view != null) {
            // Llamar al método en view
            view.asignarURL(numero, url);
        } else {
            System.out.println("Error: view no está inicializado correctamente");
        }
    }
    


    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public int getMaximoP(int mp){
        return mp;
    }


    private static void runServer(Controller controlador, int maxPlayers) {
        int port = 12345; // Cambiar según sea necesario
            Server server = new Server(port, maxPlayers, controlador); // Pasar el controlador al constructor
            server.start();
        
    }

    private static void runClient(Controller controlador) {
        String serverAddress = "127.0.0.1"; // Cambiar según sea necesario
        int port = 12345; // Cambiar según sea necesario
    
        try {
            Client cliente = new Client(serverAddress, port, controlador); // Pasar el controlador al constructor
            System.out.println("CLiente" + cliente +" conectado");
        } catch (IOException e) {
            System.err.println("Error en conexion al servidor " + e.getMessage());
        } 
    }

    public static void test(){
        System.out.println("TTTTT  EEEEE  SSSSS   TTTTT   OO ");
        System.out.println("  T    E      S         T    O  O");
        System.out.println("  T    EEE     SSS      T    O  O");
        System.out.println("  T    E          S     T    O  O");
        System.out.println("  T    EEEEE  SSSSS     T     OO");
    }


    public void iniciarJuego(){

        playerFactory playerFactory = new playerFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea iniciar como servidor o como cliente?");
        System.out.println("1. Servidor");
        System.out.println("2. Cliente");
        int opcion = scanner.nextInt();
    
        if (opcion == 1) {
            playerFactory.createPlayer(jugadores);
            
            // Pedir el número de jugadores a jugar, incluyendo al servidor
            System.out.println("Número de jugadores a jugar (incluyendo al servidor):");
            int maxPlayers = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea después de nextInt()
            
            // Iniciar el servidor y esperar jugadores hasta alcanzar el número máximo
            runServer(this, maxPlayers);
        } else if (opcion == 2) {
            runClient(this);
            playerFactory.createPlayer(jugadores);
        } else {
            System.out.println("Opción no válida.");
        }

        // Creacion de las Cartas
        cardFactory cardFactory = new cardFactory();
        objetos = cardFactory.createCards();
        // System.out.println(objetos + " Cartas desde el controlador");

        // Creacion de los Jugadores
        /*List<Jugador> jugadores1 = playerFactory.createPlayers(maxPlayers);
        this.jugadores = jugadores1;*/
        System.out.println("Cantidad jugadores " + jugadores.size());

        test();
        test();
        test();

        System.out.println("\nJugadores creados:");
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getName());
        }
    
        // Mezclar baraja
        List<Carta> cardsShufled = shuffler.shuffleObjects(objetos);

        // Repartir Cartas
        cardDealer.dealCards(jugadores, objetos);

        List<Carta> mano = jugadores.get(0).getHand();
        System.out.println(mano + "Cartas del jugador");
        procesarCartas(mano);

    }

}