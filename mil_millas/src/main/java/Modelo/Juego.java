/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
import Controlador.Controlador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private List<Jugador> jugadores;
    private Controlador controlador;

    public Juego(Controlador controlador) {
        this.controlador = controlador;
        jugadores = new ArrayList<>();
    }

    public void jugar() {
        seleccionarNumeroJugadores();
        
    }

    private void seleccionarNumeroJugadores() {
    Scanner scanner = new Scanner(System.in);
    int numeroJugadores;
    do {
        System.out.println("¿Cuántas personas van a jugar? (2, 4 o 6)");
        numeroJugadores = scanner.nextInt();
    } while (numeroJugadores != 2 && numeroJugadores != 4 && numeroJugadores != 6);
    scanner.nextLine(); // Consumir el salto de línea
    // Crear jugadores dependiendo del número seleccionado
    for (int i = 0; i < numeroJugadores; i++) {
        // Pedir el nombre del jugador
        System.out.println("Ingrese el nombre del jugador " + (i+1) + ":");
        String nombreJugador = scanner.nextLine();
        // Crear una instancia de Jugador y agregarla a la lista de jugadores
        Jugador jugador = new Jugador(nombreJugador, controlador);
        jugadores.add(jugador);
        // Seleccionar cartas aleatorias para el jugador
        List<Carta> cartasSeleccionadas = jugador.seleccionarCartasAleatorias(6);
        // Imprimir las cartas seleccionadas para el jugador
        System.out.println("Cartas seleccionadas para " + nombreJugador + ":");
        for (Carta carta : cartasSeleccionadas) {
            System.out.println(carta.getNombre());
        }
    }
}
}