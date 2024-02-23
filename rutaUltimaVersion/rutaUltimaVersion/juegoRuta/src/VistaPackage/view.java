package VistaPackage;

import java.util.Scanner;
import ControladorPackage.*;

public class view {
   private controller controlador;
   private final Scanner scanner;

   public view() {
    this.scanner = new Scanner(System.in);
}
    
    // Se establece el controlador necesario para la vista
    public void setControlador(controller controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        int opcion;
        System.out.println("Bienvenido al juego de cartas.");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        if(opcion == 1){
            int numeroJugadores = controlador.obtenerNumeroJugadores();
            controlador.crearJugadores(numeroJugadores);
            controlador.crearEquipos(numeroJugadores);
        }else if(opcion == 2){
            System.exit(0);
        }
    }

}
