/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ruta;


import javax.swing.SwingUtilities;

import com.mycompany.ruta.controller.Controller;
import com.mycompany.ruta.view.View;

/**
 *
 * @author juan
 */
public class Ruta {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            View vista = new View();
            //List<Jugador> jugadores = view.obtenerJugadores();
            Controller controlador = new Controller(vista);

            vista.setController(controlador);

            if (args.length == 0) {
                controlador.iniciarServidor();
            } else {
                controlador.connectToServer(args[0], Integer.parseInt(args[1]));
            }
        });
    }
}
