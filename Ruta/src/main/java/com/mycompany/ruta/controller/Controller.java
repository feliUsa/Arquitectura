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
    playerFactory playerFactory = new playerFactory();
    private Client client;



    public Controller(View view) {
        this.view = view;
        this.client = null;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    
    public void mostrarListaJugadores() {
        System.out.println("Lista de jugadores:");
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getName());
        }
    }
    

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
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


    private static void runServer(Controller controlador, int maxPlayers) {
        int port = 12345; // Cambiar según sea necesario
        Server server = new Server(port, maxPlayers, controlador); // Pasar la instancia de playerFactory
        server.start();
    
        // Crear y establecer el cliente en el controlador
        try {
            Client cliente = new Client("192.168.0.4", port, controlador); // Crear instancia del cliente
            controlador.setClient(cliente); // Establecer el cliente en el controlador
            System.out.println("Cliente " + cliente + " conectado");
        } catch (IOException e) {
            System.err.println("Error en conexión al servidor " + e.getMessage());
        }
    }
    

    private static void runClient(Controller controlador) {
        String serverAddress = "192.168.0.4"; // Cambiar según sea necesario
        int port = 12345; // Cambiar según sea necesario
    
        try {
            Client cliente = new Client(serverAddress, port, controlador); // Crear instancia del cliente
            controlador.setClient(cliente); // Establecer el cliente en el controlador
            System.out.println("Cliente " + cliente + " conectado");
        } catch (IOException e) {
            System.err.println("Error en conexión al servidor " + e.getMessage());
        }
    }
    

    public void enviarMensajeAlServidor(String mensaje) {
        if (client != null) {
            client.enviarMensaje(mensaje); // Llama al método de enviar mensaje del cliente
        } else {
            System.out.println("Error: No se puede enviar el mensaje. Cliente no inicializado.");
        }
    }

    

    public static void test(){
        System.out.println("TTTTT  EEEEE  SSSSS   TTTTT   OO ");
        System.out.println("  T    E      S         T    O  O");
        System.out.println("  T    EEE     SSS      T    O  O");
        System.out.println("  T    E          S     T    O  O");
        System.out.println("  T    EEEEE  SSSSS     T     OO");
    }

    public void primeraParte(){

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("¿Desea iniciar como servidor o como cliente?");
        System.out.println("1. Servidor");
        System.out.println("2. Cliente");
        int opcion = scanner.nextInt();
    
        if (opcion == 1) {
            System.out.println("Número de jugadores a jugar (incluyendo al servidor):");
            int maxPlayers = scanner.nextInt();
            runServer(this, maxPlayers);
    
        } else if (opcion == 2) {
            runClient(this);
        } else {
            System.out.println("Opción no válida.");
        }
    
        System.out.println("Para continuar presionar Enter");
        scanner.nextLine();
        scanner.nextLine();
    
    }
    


    public void iniciarJuego(){

        //Scanner p = new Scanner(System.in);

        // Creacion de las Cartas
        cardFactory cardFactory = new cardFactory();
        objetos = cardFactory.createCards();
        System.out.println(objetos + " Cartas desde el controlador");

        primeraParte();

        System.out.println("\nJugadores creados:" + jugadores.size());
        mostrarListaJugadores();
    
        // Mezclar baraja
        List<Carta> cardsShufled = shuffler.shuffleObjects(objetos);

        // Repartir Cartas
        cardDealer.dealCards(jugadores, objetos);

/*        List<Carta> mano = jugadores.get(0).getHand();
        System.out.println(mano + "Cartas del jugador");
        procesarCartas(mano);
*/

    }

    // que cada jugador obtenga sus cartas
    // verificar que si hayan varios jugadores en la partida
    // probarlo con que aparezca jugador x presiono el boton #

}