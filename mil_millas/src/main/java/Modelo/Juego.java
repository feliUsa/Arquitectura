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
        this.numeroJugadores = numeroJugadores;
        jugadores = new ArrayList<>();
    }
    
    public void iniciarJuego() {
    System.out.println("¡Bienvenido al juego de ruta!");

    Scanner scanner = new Scanner(System.in);
    System.out.println("¿Desea jugar en modo multijugador? (si/no)");
    String opcion = scanner.nextLine();

    if (opcion.equalsIgnoreCase("si")) {
        seleccionarNumeroJugadores();
    } else if (opcion.equalsIgnoreCase("no")) {
        // Si elige un jugador, el sistema jugará automáticamente
        numeroJugadores = 1;
    } else {
        System.out.println("Opción no válida. Saliendo del juego.");
        return;
    }

    jugar(); // Aquí ya se ha seleccionado el número de jugadores, no es necesario volver a preguntar
}


    public void jugar() {
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

    
    public void seleccionarNumeroJugadores() {
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("¿Cuántas personas van a jugar? (2, 4 o 6)");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next(); // Consumir la entrada inválida
        }
        numeroJugadores = scanner.nextInt();
    } while (numeroJugadores != 2 && numeroJugadores != 4 && numeroJugadores != 6);
    scanner.nextLine(); // Consumir el salto de línea
    }
}