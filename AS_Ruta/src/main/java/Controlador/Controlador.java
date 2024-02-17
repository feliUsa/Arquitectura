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
import Ruta.Jugador;
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

    public void iniciarJuego() {
        int numeroJugadores = vista.obtenerNumeroJugadores(); // Obtener el número de jugadores desde la vista

        // Agregar jugadores a los equipos
        Equipo equipo1 = new Equipo("Equipo 1");
        Equipo equipo2 = new Equipo("Equipo 2");

        // Agregar jugadores a los equipos según el número obtenido
        for (int i = 0; i < numeroJugadores / 2; i++) {
            equipo1.agregarJugador(new Jugador("Jugador " + i, equipo1));
            equipo2.agregarJugador(new Jugador("Jugador " + (i + numeroJugadores / 2), equipo2));
        }
    }
}
