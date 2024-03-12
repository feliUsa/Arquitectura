package com.mycompany.ruta.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


import com.mycompany.ruta.model.Jugador;
import com.mycompany.ruta.model.cardDealer;
import com.mycompany.ruta.model.cardFactory;
import com.mycompany.ruta.model.playerFactory;
import com.mycompany.ruta.model.shuffler;
import com.mycompany.ruta.model.Cards.Carta;
import com.mycompany.ruta.view.View;

public class controller {

    private List<Carta> objetos;

    private ServerSocket serverSocket;
    private List<Socket> clients;
    private View view;
    private int maxPlayers;
    private int currentPlayerCount;

    public controller(View view, int maxPlayers) {

        this.view = view;

        this.clients = new ArrayList<>();
        this.maxPlayers = maxPlayers;
        this.currentPlayerCount = 0;

        startServer(12345);

        // Creacion de las Cartas
        cardFactory cardFactory = new cardFactory();
        objetos = cardFactory.createCards();
        // System.out.println(objetos + " Cartas desde el controlador");

        // Creacion de los Jugadores
        playerFactory playerFactory = new playerFactory();
        List<Jugador> jugadores = playerFactory.createPlayers();
        System.out.println("\nJugadores creados:");
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getName());
        }
        // System.out.println(jugadores + " Jugadores desde el controlador");

        // Mezclar baraja
        List<Carta> cardsShufled = shuffler.shuffleObjects(objetos);
        // System.out.println(cardsShufled + "cartas mezcladas desde el controlador. Hay
        // " + cardsShufled.size() + " cartas");

        // Repartir Cartas
        cardDealer.dealCards(jugadores, objetos);

        test();
        // TESTS

        List<Carta> mano = jugadores.get(0).getHand();
        System.out.println(mano + "Cartas del jugador");
        procesarCartas(mano);

        // Creacion de vista
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



// ---------------------------Sockets-------------------------------------

    
    public void startServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + port);
            acceptClients();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void acceptClients() {
        playerFactory playerFactory = new playerFactory();
        while (currentPlayerCount < maxPlayers) {
            try {
                Socket clientSocket = serverSocket.accept();
                clients.add(clientSocket);
                currentPlayerCount++;
                System.out.println("Player " + currentPlayerCount + " connected.");
                if (currentPlayerCount == 1) {
                    // El primer jugador que se conecta será el servidor
                    System.out.println("You are the server.");
                    List<Jugador> jugadores = playerFactory.createPlayers();
                    for (Jugador jugador : jugadores) {
                        System.out.println("Nombre: " + jugador.getName());
                    }
                } else {
                    // Si hay más de un jugador, los otros serán clientes
                    System.out.println("You are a client.");
                    List<Jugador> jugadores = playerFactory.createPlayers();
                    for (Jugador jugador : jugadores) {
                        System.out.println("Nombre: " + jugador.getName());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Max players reached. Game starting...");
        // Aquí puedes iniciar el juego
    }



    public void test(){
        System.out.println("TTTTT  EEEEE  SSSSS   TTTTT   OO ");
        System.out.println("  T    E      S         T    O  O");
        System.out.println("  T    EEE     SSS      T    O  O");
        System.out.println("  T    E          S     T    O  O");
        System.out.println("  T    EEEEE  SSSSS     T     OO");
    }
}