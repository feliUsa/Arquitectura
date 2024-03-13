package com.mycompany.ruta.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.ruta.model.Jugador;

public class Server {
    private int port;
    private int maxPlayers;
    private List<Jugador> jugadores;
    private Controller controlador;

    public Server(int port, int maxPlayers, Controller controlador) {
        this.port = port;
        this.maxPlayers = maxPlayers;
        this.controlador = controlador;
        this.jugadores = new ArrayList<>();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port + " with max players: " + maxPlayers);

            while (true) {
                System.out.print("Waiting for players...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Player connected: " + clientSocket.getInetAddress().getHostAddress());

                // Crear un nuevo jugador y agregarlo a la lista
                Jugador jugador = new Jugador("New Player", true, 200, true, false, false, 0); // Puedes pedir el nombre al cliente
                jugadores.add(jugador);

                // Actualizar la lista de jugadores en el controlador
                controlador.setJugadores(jugadores);
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }

}