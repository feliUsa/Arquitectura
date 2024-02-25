/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
import java.util.ArrayList;
import java.util.List;

public class CartasEnMano {
    private List<Carta> cartas;

    public CartasEnMano() {
        cartas = new ArrayList<>();
    }

    public void addCarta(Carta carta) {
        cartas.add(carta);
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
