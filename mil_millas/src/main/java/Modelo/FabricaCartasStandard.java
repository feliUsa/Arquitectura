/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
public class FabricaCartasStandard implements FabricaCartas {
    public Carta crearCartaSolucion(String nombre) {
        return new CartaSolucion(nombre);
    }

    public Carta crearCartaProblema(String nombre) {
        return new CartaProblema(nombre);
    }

    public Carta crearCartaSeguridad(String nombre) {
        return new CartaSeguridad(nombre);
    }

    public Carta crearCartaDistancia(String nombre, int numero) {
        return new CartaDistancia(nombre, numero);
    }
}
