/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
public interface FabricaCartas {
    Carta crearCartaSolucion(String nombre);
    Carta crearCartaProblema(String nombre);
    Carta crearCartaSeguridad(String nombre);
    Carta crearCartaDistancia(String nombre, int numero);
}