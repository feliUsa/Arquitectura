/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author isabella
 */
public class Equipo {
    
    private String nombre;
    private List<Jugador> jugadores;

    // Constructor, métodos para gestionar jugadores
    public Equipo(String nombre, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

   public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public boolean verificarIgualCantidadJugadores(Equipo otroEquipo) {
        return this.jugadores.size() == otroEquipo.jugadores.size();
    } 
}
