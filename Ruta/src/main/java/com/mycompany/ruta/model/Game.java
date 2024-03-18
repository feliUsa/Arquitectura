package com.mycompany.ruta.model;

public class Game {
    private int cantidadJugadores;
    private int jugadorActual;

    public Game(int cantidadJugadores){
        this.cantidadJugadores = cantidadJugadores;
        this.jugadorActual = 0; // Empezamos con el primer jugador
    }

    public void pasarTurno() {
        // Actualiza el jugador actual al siguiente jugador
        jugadorActual = (jugadorActual + 1) % cantidadJugadores;
    }

    public int getJugadorActual() {
        return jugadorActual;
    }
    
}
