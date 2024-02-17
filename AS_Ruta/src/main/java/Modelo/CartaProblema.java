/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
public class CartaProblema extends Carta {
    public CartaProblema(String nombre) {
        super(nombre);
    }

    // Definición de cartas de problema como variables estáticas
    public static final CartaProblema STOP = new CartaProblema("Stop");
    public static final CartaProblema VELOCIDAD_MAXIMA_50 = new CartaProblema("Velocidad máxima de 50");
    public static final CartaProblema FALTA_DE_COMBUSTIBLE = new CartaProblema("Falta de combustible");
    public static final CartaProblema CHOQUE = new CartaProblema("Choque");
    public static final CartaProblema PINCHADURA = new CartaProblema("Pinchadura");
}

