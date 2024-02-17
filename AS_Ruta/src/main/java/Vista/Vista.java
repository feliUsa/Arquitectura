/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author isabella
 */
import Controlador.Controlador;
import java.util.Scanner;

public class Vista {
    private Controlador controlador;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido al juego de cartas.");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int obtenerNumeroJugadores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de jugadores (1 o 2): ");
        return scanner.nextInt();
    }

    public void iniciarJuego() {
        int numeroJugadores = obtenerNumeroJugadores();
        if (numeroJugadores == 1 || numeroJugadores == 2) {
            controlador.iniciarJuego(numeroJugadores);
        } else {
            mostrarMensaje("Número de jugadores no válido. Por favor, seleccione 1 o 2.");
            iniciarJuego(); // Reiniciar el proceso de inicio de juego
        }
    }
}

