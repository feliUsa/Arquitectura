/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruta;

/**
 *
 * @author isabella
 */
import Modelo.Carta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a 1000 Millas!");
        System.out.println("¿Cuántos jugadores participarán? (2, 3, 4 o 6)");

        int numJugadores = scanner.nextInt();

        while (numJugadores != 2 && numJugadores != 3 && numJugadores != 4 && numJugadores != 6) {
            System.out.println("Por favor, ingrese un número válido de jugadores (2, 3, 4 o 6):");
            numJugadores = scanner.nextInt();
        }

        // Verificar si el número de jugadores ingresado es un múltiplo de 2 o 3
        while (numJugadores % 2 != 0 && numJugadores % 3 != 0) {
            System.out.println("Por favor, ingrese un número válido de jugadores (2, 3, 4 o 6):");
            numJugadores = scanner.nextInt();
        }

        System.out.println("Comenzando el juego con " + numJugadores + " jugadores.");

        List<String> nombresJugadores = new ArrayList<>();

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Ingrese el nombre del Jugador " + (i + 1) + ":");
            nombresJugadores.add(scanner.next());
        }

        System.out.println("Los jugadores son: " + nombresJugadores);

        // Crear jugadores y repartir seis cartas a cada uno desde el mazo
        Mazo mazo = new Mazo();
        List<Jugador> jugadores = new ArrayList<>();
        for (String nombre : nombresJugadores) {
            Jugador jugador = new Jugador(nombre);
            for (int i = 0; i < 6; i++) {
                Carta carta = mazo.repartirCarta();
                if (carta != null) {
                    jugador.recibirCarta(carta);
                } else {
                    System.out.println("El mazo está vacío.");
                    break;
                }
            }
            jugadores.add(jugador);
        }

        // Agregar algunas cartas al mazo
        mazo.agregarCarta(new Carta("Prioridad de paso", TipoCarta.SEGURIDAD));
        mazo.agregarCarta(new Carta("Combustible extra", TipoCarta.SEGURIDAD));
        mazo.agregarCarta(new Carta(25, TipoCarta.DISTANCIA));
        mazo.agregarCarta(new Carta("Stop", TipoCarta.PROBLEMA));
        mazo.agregarCarta(new Carta("Siga", TipoCarta.SOLUCION));

        // Tomar una carta del mazo y jugarla para el primer jugador
        Carta cartaTomada = mazo.repartirCarta();
        if (cartaTomada != null) {
            jugadores.get(0).recibirCarta(cartaTomada);
            System.out.println("El primer jugador tomó una carta del mazo: " + cartaTomada.getNombre());
        }

        // Jugar una carta para el primer jugador
        Carta cartaJugada = jugadores.get(0).jugarCarta();
        if (cartaJugada != null) {
            System.out.println("Se jugó la carta: " + cartaJugada.getNombre());
        }
    }
}
