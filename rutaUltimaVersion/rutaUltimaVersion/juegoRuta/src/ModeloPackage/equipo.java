package ModeloPackage;

import java.util.List;

public class equipo {
    
    private String nombre;
    private List<jugador> jugadores;

    // Constructor, métodos para gestionar jugadores
    public equipo(String nombre, List<jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public List<jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(List<jugador> jugadores) {
        this.jugadores = jugadores;
    }

   public void agregarJugador(jugador jugador) {
        jugadores.add(jugador);
    }

    public boolean verificarIgualCantidadJugadores(equipo otroEquipo) {
        return this.jugadores.size() == otroEquipo.jugadores.size();
    } 
}

