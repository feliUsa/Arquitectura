package com.mycompany.ruta.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            System.out.println("Servidor iniciado en el puerto " + port + "\nMaximo Jugadores: " + maxPlayers);
    
            int jugadorActual = 1; // Contador de jugadores conectados
            while (jugadorActual < maxPlayers) {
                System.out.print("Esperando jugadores...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Jugador conectado: " + clientSocket.getInetAddress().getHostAddress());
    
                jugadorActual++; // Incrementar contador de jugadores conectados
            }
    
            // Cuando se alcanza el número máximo de jugadores, imprimir un mensaje y continuar
            System.out.println("Número máximo de jugadores alcanzado. Continuando...");
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }
    

}