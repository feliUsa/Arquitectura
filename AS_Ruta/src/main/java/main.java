import java.util.List;

import Controller.controller;
import Model.Jugador;
import Model.playerFactory;

public class main {
    public static void main(String[] args) {
        controller controlador = new controller();
        playerFactory playerFactory = new playerFactory();
        List<Jugador> jugadores = playerFactory.createPlayers();

        System.out.println("\nJugadores creados:");
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getName());
        }
    }
}
