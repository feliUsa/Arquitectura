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
        Vista vista = new Vista(new Controlador(null)); // Vista necesita un Controlador, pero no importa para esta instancia
        vista.iniciarJuego(); // Esto muestra el menú y comienza el juego
    }
}
