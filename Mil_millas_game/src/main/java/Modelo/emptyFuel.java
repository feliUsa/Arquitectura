/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author bella
 */
public class emptyFuel implements Carta {

    @Override
    public void accion(Jugador jugador) {
        jugador.setCombustible(false);
    }

}
