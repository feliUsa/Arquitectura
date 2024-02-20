/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaP;

/**
 *
 * @author isabella
 */
import ControladorP.Controlador;
import java.util.Scanner;

public class Vista {
    private Controlador controlador;

    public Vista() {
        
    }
    
    // Se establece el controlador necesario para la vista
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        Scanner p = new Scanner(System.in);
        System.out.println("Bienvenido al juego de cartas.");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
        int op = p.nextInt(); // Cambiar a nextInt()
        mostrarMensaje(String.valueOf(op));

    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}

