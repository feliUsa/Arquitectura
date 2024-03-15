package com.mycompany.ruta.controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



public class Client {
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;
    private Controller controller;

    public Client(String serverAddress, int port, Controller controller) throws IOException {
        this.socket = new Socket(serverAddress, port);
        this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.output = new PrintWriter(socket.getOutputStream(), true);
        this.controller = controller;

    }

    public void enviarMensaje(String mensaje) {
        output.println(mensaje);
    }
    

    public String recibirMensaje() throws IOException {
        return input.readLine();
    }

    public void cerrar() throws IOException {
        socket.close();
    }

}