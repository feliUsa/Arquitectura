package com.mycompany.ruta.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.ruta.model.Jugador;
import com.mycompany.ruta.model.playerFactory;


public class Server {
    private int port;
    private Socket socket;
    private int maxPlayers;
    private Controller controlador;


    public Server(int port, int maxPlayers, Controller controlador) {
        this.port = port;
        this.maxPlayers = maxPlayers;
        this.controlador = controlador;
    }

    public void start() {
        Jugador server = playerFactory.createPlayer();
        controlador.addJugador(server);
    
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Servidor iniciado en el puerto " + port + "\nMaximo Jugadores: " + maxPlayers + "\n\n");
    
            int jugadorActual = 1;
            while (jugadorActual < maxPlayers) {
                System.out.print("Esperando jugadores...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("\nJugador conectado: " + clientSocket.getInetAddress().getHostAddress());

                Thread thread = new Thread(() -> {
                    try {
                        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        String mensaje;
                        while ((mensaje = input.readLine()) != null) {
                            // Procesa el mensaje recibido del cliente (por ejemplo, imprime en la consola)
                            System.out.println(mensaje);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
    
                Jugador nuevoJugador = playerFactory.createPlayer();
                controlador.addJugador(nuevoJugador);    
                jugadorActual++;
            }
    
            System.out.println("Número máximo de jugadores alcanzado. Continuando...");
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }
    
    public void enviarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
}