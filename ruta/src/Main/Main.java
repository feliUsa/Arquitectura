/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import ControladorP.Controlador;
import VistaP.Vista;

/**
 *
 * @author isabella
 */
public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador(); // Inicializa el controlador
        Vista vista = new Vista(); // Inicializa la vista
        vista.setControlador(controlador); // Establece el controlador en la vista
        controlador.iniciarJuego(); // Esto muestra el menú y comienza el juego
    }
}
