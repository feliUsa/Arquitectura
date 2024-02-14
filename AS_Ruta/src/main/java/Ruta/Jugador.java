/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruta;

import java.util.Stack;

/**
 *
 * @author isabella
 */

//En la clase Jugador, aún podemos mantener una lista de cartas para representar la mano, pero manipularemos esta lista como si fuera una pila, 
//jugando siempre la última carta agregada.
import java.util.Stack;

import java.util.Stack;

public class Jugador {
    private String nombre;
    private Stack<Carta> mano;
    private int puntuacion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new Stack<>();
        puntuacion = 0;
    }

    public void recibirCarta(Carta carta) {
        mano.push(carta);
        if (carta.getTipo() == TipoCarta.DISTANCIA) {
            puntuacion += carta.getValor();
        }
    }

    public Carta jugarCarta() {
        if (!mano.isEmpty()) {
            Carta cartaJugada = mano.pop();
            if (cartaJugada.getTipo() == TipoCarta.DISTANCIA) {
                puntuacion -= cartaJugada.getValor();
            }
            return cartaJugada;
        } else {
            System.out.println("La mano del jugador está vacía.");
            return null;
        }
    }

    public void tomarCartaDelMazo(Mazo mazo) {
        Carta cartaTomada = mazo.repartirCarta();
        if (cartaTomada != null) {
            recibirCarta(cartaTomada);
        }
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int sumarDistancias() {
    int sumaDistancias = 0;
    for (Carta carta : mano) {
        if (carta.getTipo() == TipoCarta.DISTANCIA) {
            // Obtener el valor de la carta de distancia utilizando los métodos estáticos de CartasDistancia
            if (carta.getValor() == CartasDistancia.cartaDe25().getDistancia()) {
                sumaDistancias += 25;
            } else if (carta.getValor() == CartasDistancia.cartaDe50().getDistancia()) {
                sumaDistancias += 50;
            } else if (carta.getValor() == CartasDistancia.cartaDe75().getDistancia()) {
                sumaDistancias += 75;
            } else if (carta.getValor() == CartasDistancia.cartaDe100().getDistancia()) {
                sumaDistancias += 100;
            } else if (carta.getValor() == CartasDistancia.cartaDe200().getDistancia()) {
                sumaDistancias += 200;
            }
        }
    }
    return sumaDistancias;
}
}



