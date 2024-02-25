/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
public class AdaptadorJuego implements InterfazJuego {
    private Juego juego;

    public AdaptadorJuego(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void realizarJugada() {
        // Delegar a la lógica actual del juego
        juego.jugar();
    }
}
