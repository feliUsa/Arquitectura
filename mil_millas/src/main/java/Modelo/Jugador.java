/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
import Controlador.Controlador;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jugador {
    private Controlador controlador;
    private String nombre;

    public Jugador(String nombreJugador, Controlador controlador) {
        this.controlador = controlador;
        this.nombre = nombreJugador;
    }

    public List<Carta> seleccionarCartasAleatorias(int cantidad) {
        List<Carta> mazo = controlador.obtenerMazo();
        List<Carta> cartasSeleccionadas = new ArrayList<>();
        Random random = new Random();

        // Verificar que hay suficientes cartas en el mazo
        if (cantidad > mazo.size()) {
            throw new IllegalArgumentException("No hay suficientes cartas en el mazo.");
        }

        // Iterar para seleccionar cartas aleatorias
        for (int i = 0; i < cantidad; i++) {
            int indiceAleatorio = random.nextInt(mazo.size());
            Carta cartaSeleccionada = mazo.get(indiceAleatorio);
            cartasSeleccionadas.add(cartaSeleccionada);
            mazo.remove(indiceAleatorio);
        }

        return cartasSeleccionadas;
    }
    
    // Método setter para establecer el nombre del jugador
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
