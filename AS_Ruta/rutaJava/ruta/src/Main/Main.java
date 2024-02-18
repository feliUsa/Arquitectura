/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.Controlador;
import Vista.Vista;

/**
 *
 * @author isabella
 */
public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista(null); // Inicializamos vista con un valor nulo por ahora
        Controlador controlador = new Controlador(vista); // Creamos una instancia de Controlador con la vista
        vista.setControlador(controlador); // Establecemos el controlador en la vista
        vista.iniciarJuego(); // Esto muestra el menú y comienza el juego
    }
}
