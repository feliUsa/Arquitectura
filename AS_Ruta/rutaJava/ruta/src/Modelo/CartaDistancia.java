/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
public class CartaDistancia extends CartaSeguridad {
    private int distancia;

    public CartaDistancia(String nombre, int distancia) {
        super(nombre);
        this.distancia = distancia;
    }

    public int getDistancia() {
        return distancia;
    }

    // Métodos estáticos para obtener instancias predefinidas de cartas de distancia comunes
    public static CartaDistancia cartaDe25() {
        return new CartaDistancia("Distancia de 25", 25);
    }

    public static CartaDistancia cartaDe50() {
        return new CartaDistancia("Distancia de 50", 50);
    }

    public static CartaDistancia cartaDe75() {
        return new CartaDistancia("Distancia de 75", 75);
    }

    public static CartaDistancia cartaDe100() {
        return new CartaDistancia("Distancia de 100", 100);
    }

    public static CartaDistancia cartaDe200() {
        return new CartaDistancia("Distancia de 200", 200);
    }
}
