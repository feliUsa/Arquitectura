package com.mycompany.ruta.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
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
    private List<Jugador> jugadores;

    //Atributos para iniciar sockets
    private ServerSocket serverSocket;
    private List<Socket> clientes;


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


    private static void runServer(Controller controlador) {
        int port = 12345; // Cambiar según sea necesario
        int maxPlayers = 4; // Cambiar según sea necesario
            Server server = new Server(port, maxPlayers, controlador); // Pasar el controlador al constructor
            server.start();
        
    }

    private static void runClient(Controller controlador) {
        String serverAddress = "127.0.0.1"; // Cambiar según sea necesario
        int port = 12345; // Cambiar según sea necesario

        try {
            Client cliente = new Client(serverAddress, port, controlador); // Pasar el controlador al constructor

            Scanner scanner = new Scanner(System.in);
            System.out.println("Como es tu nombre:");
            String playerName = scanner.nextLine();

            cliente.enviarNombre(playerName);

            String serverResponse = cliente.recibirMensaje();
            System.out.println("Server response " + serverResponse);

            cliente.cerrar();
        } catch (IOException e) {
            System.err.println("Error en conexion al servidor " + e.getMessage());
        }
    }

    public void test(){
        System.out.println("TTTTT  EEEEE  SSSSS   TTTTT   OO ");
        System.out.println("  T    E      S         T    O  O");
        System.out.println("  T    EEE     SSS      T    O  O");
        System.out.println("  T    E          S     T    O  O");
        System.out.println("  T    EEEEE  SSSSS     T     OO");
    }


    public void iniciarJuego(){
        Scanner scanner = new Scanner(System.in);
        // Creacion de las Cartas
        cardFactory cardFactory = new cardFactory();
        objetos = cardFactory.createCards();
        // System.out.println(objetos + " Cartas desde el controlador");

        // Creacion de los Jugadores
        playerFactory playerFactory = new playerFactory();
        List<Jugador> jugadores1 = playerFactory.createPlayers();
        this.jugadores = jugadores1;
        System.out.println(jugadores.size());

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

        System.out.println("¿Desea iniciar como servidor o como cliente?");
        System.out.println("1. Servidor");
        System.out.println("2. Cliente");
        int opcion = scanner.nextInt();
    
        if (opcion == 1) {
            runServer(this);
        } else if (opcion == 2) {
            runClient(this);
        } else {
            System.out.println("Opción no válida.");
        }


    }

}