/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
import java.util.List;
import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int puntuacion;
    private Equipo equipo;
    private List<Carta> cartas;

    //Lista - Para las seis cartas
    public Jugador(String nombre, Equipo equipo) {
        this.nombre = nombre;
        this.puntuacion = 0;
        this.equipo = equipo;
        this.cartas = new ArrayList<>(6); // Inicializamos la lista de cartas con capacidad para 6 cartas
    }
    
    //Permite jugar una carta por su indice en la lista de cartas que tiene 
    public boolean recibirCarta(Carta carta) {
        if (cartas.size() < 6) {
            cartas.add(carta);
            return true;
        } else {
            System.out.println("El jugador ya tiene 6 cartas. No se puede añadir más.");
            return false;
        }
    }
    
    public Carta jugarCarta(int indice) {
        if (indice >= 0 && indice < cartas.size()) {
            return cartas.remove(indice); // Remueve y devuelve la carta seleccionada
        } else {
            System.out.println("Índice de carta no válido.");
            return null;
        }
    }
    
}

