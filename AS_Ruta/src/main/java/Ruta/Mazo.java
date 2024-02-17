/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruta;

import Modelo.Carta;
import java.util.Stack;

/**
 *
 * @author isabella
 */
public class Mazo {
    private Stack<Carta> cartas;

    public Mazo() {
        cartas = new Stack<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.push(carta);
    }

    public Carta repartirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.pop();
        } else {
            System.out.println("¡El mazo está vacío!");
            return null;
        }
    }
}