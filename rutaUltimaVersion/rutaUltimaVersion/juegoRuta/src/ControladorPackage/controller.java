package ControladorPackage;

import ModeloPackage.*;
import VistaPackage.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class controller {
    private view vista;
    private List<equipo> equipos;
    private List<jugador> jugadores;
    private Scanner scanner;
    private Scanner scan;

    public controller() {
        this.vista = new view(); // Crea una instancia de Vista
        this.vista.setControlador(this); // Establece este controlador en la vista
        equipos = new ArrayList<>();
        jugadores = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.scan = new Scanner(System.in);
    }
    

    public void iniciarJuego() {
        vista.mostrarMenu();
    }

    public void crearEquipos(int numeroJugadores){

        System.out.println("Ingrese el número de equipos: ");
        int numEquipos = scanner.nextInt();
        
        if(numEquipos > numeroJugadores){
            System.out.println("Numero de equipos mayor a numero de jugadores");
            System.out.println("Ingrese el número de equipos: ");
            numEquipos = scanner.nextInt();
        }

        scanner.nextLine(); // Limpiar el buffer de entrada

        for (int i = 0; i < numEquipos; i++) {
            System.out.println("Ingrese el nombre del equipo " + (i + 1) + ": ");
            String nombreEquipo = scanner.nextLine();

            equipos.add(new equipo(nombreEquipo, new ArrayList<>()));
        }

        System.out.println("Equipos creados exitosamente.");
    }

    public void crearJugadores(int numJugadores) {


        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i + 1) + ": ");
            String nombreJugador = scan.nextLine();
            jugadores.add(new jugador(nombreJugador, null)); // No asignamos equipo por ahora
        }

        System.out.println("Jugadores creados exitosamente.");
    }

    public int obtenerNumeroJugadores() {
        System.out.print("Ingrese el número de jugadores: ");
        return scanner.nextInt();
    }


}
