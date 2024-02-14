/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruta;

/**
 *
 * @author isabella
 */
public class CartasDistancia{
    private int distancia;

    // Constructor privado para evitar instanciación externa
    private CartasDistancia(int distancia) {
        this.distancia = distancia;
    }

    // Método para obtener la distancia de la carta
    public int getDistancia() {
        return distancia;
    }

    // Métodos estáticos para obtener instancias predefinidas de cartas de distancia comunes
    public static CartasDistancia cartaDe25() {
        return new CartasDistancia(25);
    }

    public static CartasDistancia cartaDe50() {
        return new CartasDistancia(50);
    }

    public static CartasDistancia cartaDe75() {
        return new CartasDistancia(75);
    }

    public static CartasDistancia cartaDe100() {
        return new CartasDistancia(100);
    }

    public static CartasDistancia cartaDe200() {
        return new CartasDistancia(200);
    }
}
