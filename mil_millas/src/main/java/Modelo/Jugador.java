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
    private List<Carta> cartasEnMano;

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
    
    
    public String getNombre() {
        return nombre;
    }

    public List<Carta> getCartasEnMano() {
        return cartasEnMano;
    }
    
    
    public void lanzarCarta(Carta carta) {
        if (cartasEnMano.contains(carta)) {
            cartasEnMano.remove(carta);
            if (controlador.getCartasRestantes().size() > 0) {
                Carta nuevaCarta = controlador.obtenerCartaAleatoriaRestante();
                cartasEnMano.add(nuevaCarta);
                System.out.println("Se lanzó la carta " + carta.getNombre() + ". Se recibió la carta " + nuevaCarta.getNombre() + ".");
            } else {
                System.out.println("Se lanzó la carta " + carta.getNombre() + ". No hay más cartas disponibles.");
            }
        } else {
            System.out.println("La carta seleccionada no está en tu mano.");
        }
    }
    
    public void setCartasEnMano(List<Carta> cartasEnMano) {
        this.cartasEnMano = cartasEnMano;
    }
    
    // Método setter para establecer el nombre del jugador
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
