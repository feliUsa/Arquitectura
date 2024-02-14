/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruta;

/**
 *
 * @author isabella
 */
public class CartasSolucion {
    private String nombre;

    public CartasSolucion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Definición de las cartas de solución como variables estáticas
    public static final CartasSolucion SIGA = new CartasSolucion("Siga");
    public static final CartasSolucion FIN_DE_VELOCIDAD_MAXIMA_50 = new CartasSolucion("Fin de velocidad máxima de 50");
    public static final CartasSolucion COMBUSTIBLE = new CartasSolucion("Combustible");
    public static final CartasSolucion TALLER = new CartasSolucion("Taller");
    public static final CartasSolucion RUEDA_DE_AUXILIO = new CartasSolucion("Rueda de auxilio");
}

