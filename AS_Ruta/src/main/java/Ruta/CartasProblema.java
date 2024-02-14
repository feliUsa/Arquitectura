/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruta;

/**
 *
 * @author isabella
 */
public class CartasProblema {
    private String nombre;

    public CartasProblema(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Definición de las cartas de problema como variables estáticas
    public static final CartasProblema STOP = new CartasProblema("Stop");
    public static final CartasProblema VELOCIDAD_MAXIMA_50 = new CartasProblema("Velocidad máxima de 50");
    public static final CartasProblema FALTA_DE_COMBUSTIBLE = new CartasProblema("Falta de combustible");
    public static final CartasProblema CHOQUE = new CartasProblema("Choque");
    public static final CartasProblema PINCHADURA = new CartasProblema("Pinchadura");
}

