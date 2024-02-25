/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author isabella
 */
import Controlador.Controlador;
import Modelo.Juego;


public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.llenarMazoCartasDistancia();
        controlador.llenarMazoCartaProblema();
        controlador.llenarMazoSeguridad();
        controlador.llenarMazoSolucion();

        Juego juego = new Juego(controlador);
        juego.iniciarJuego(); // Iniciar el juego y seleccionar cartas aleatorias
    }
}


        