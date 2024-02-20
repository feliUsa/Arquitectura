/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
public class CartaSolucion extends Carta {
    public CartaSolucion(String nombre) {
        super(nombre);
    }

    // Definición de cartas de solución como variables estáticas
    public static final CartaSolucion SIGA = new CartaSolucion("Siga");
    public static final CartaSolucion FIN_DE_VELOCIDAD_MAXIMA_50 = new CartaSolucion("Fin de velocidad máxima de 50");
    public static final CartaSolucion COMBUSTIBLE = new CartaSolucion("Combustible");
    public static final CartaSolucion TALLER = new CartaSolucion("Taller");
    public static final CartaSolucion RUEDA_DE_AUXILIO = new CartaSolucion("Rueda de auxilio");
}

