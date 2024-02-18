/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Carta;
import Modelo.CartaDistancia;
import Modelo.CartaProblema;
import Modelo.CartaSeguridad;
import Modelo.CartaSolucion;
import Modelo.Equipo;
import Modelo.Jugador;
import Vista.Vista;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


/**
 *
 * @author isabella
 */

public class Controlador {
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public void iniciarJuego(int numeroJugadores) {
        // Obtener el número de jugadores desde la vista
        numeroJugadores = vista.obtenerNumeroJugadores(); 

        // Lista de jugadores para cada equipo
        List<Jugador> jugadoresEquipo1 = new ArrayList<>();
        List<Jugador> jugadoresEquipo2 = new ArrayList<>();

        // Agregar jugadores a los equipos según el número obtenido
        for (int i = 0; i < numeroJugadores / 2; i++) {
            jugadoresEquipo1.add(new Jugador("Jugador " + i, null)); // Pasamos null temporalmente como equipo
            jugadoresEquipo2.add(new Jugador("Jugador " + (i + numeroJugadores / 2), null)); // Pasamos null temporalmente como equipo
        }

        // Crear equipos con los nombres y las listas de jugadores correspondientes
        Equipo equipo1 = new Equipo("Equipo 1", jugadoresEquipo1);
        Equipo equipo2 = new Equipo("Equipo 2", jugadoresEquipo2);
    }


}
