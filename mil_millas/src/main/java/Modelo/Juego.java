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
    private int numeroJugadores;

    public Juego(Controlador controlador) {
        this.controlador = controlador;
        jugadores = new ArrayList<>();
    }

    public void jugar() {
        seleccionarNumeroJugadores();
        solicitarNombresJugadores();
        repartirCartasIniciales();
        generarMazoRestante();
        
    }
    
    private void solicitarNombresJugadores() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeroJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i + 1) + ":");
            String nombreJugador = scanner.nextLine();
            Jugador jugador = new Jugador(nombreJugador, controlador);
            jugadores.add(jugador);

            List<Carta> cartasSeleccionadas = jugador.seleccionarCartasAleatorias(6);
            System.out.println("Cartas seleccionadas para " + nombreJugador + ":");
            for (Carta carta : cartasSeleccionadas) {
                System.out.println(carta.getNombre());
            }
        }
    }

    
    
    private void repartirCartasIniciales() {
        Scanner scanner = new Scanner(System.in); // Agregar esta línea
        for (Jugador jugador : jugadores) {
            List<Carta> cartasSeleccionadas = jugador.seleccionarCartasAleatorias(6);
            System.out.println("Cartas seleccionadas para " + jugador.getNombre() + ":");
            for (Carta carta : cartasSeleccionadas) {
                System.out.println(carta.getNombre());
            }
            jugador.setCartasEnMano(cartasSeleccionadas);
        }
    }
        
    //Despues de repartir las cartas, con las que restan hacemos el mazo 
    //para que se puedan coger a medida que los jugadores jueguen
    
    private void generarMazoRestante() {
        List<Carta> mazoRestante = new ArrayList<>(controlador.obtenerMazo());
        for (Jugador jugador : jugadores) {
            mazoRestante.removeAll(jugador.getCartasEnMano());
        }
        controlador.setMazoRestante(mazoRestante);
    }
    
    
    private void seleccionarNumeroJugadores() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("¿Cuántas personas van a jugar? (2, 4 o 6)");
            numeroJugadores = scanner.nextInt();
        } while (numeroJugadores != 2 && numeroJugadores != 4 && numeroJugadores != 6);
        scanner.nextLine(); // Consumir el salto de línea
    }
}