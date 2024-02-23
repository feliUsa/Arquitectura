package ModeloPackage;

import java.util.List;
import java.util.ArrayList;
import ModeloPackageInterface.*;

public class jugador {
    private String nombre;
    private int puntuacion;
    private equipo team;
    private List<carta> cartas;

    //Lista - Para las seis cartas
    public jugador(String nombre, equipo team) {
        this.nombre = nombre;
        this.puntuacion = 0;
        this.team = team;
        this.cartas = new ArrayList<>(6); // Inicializamos la lista de cartas con capacidad para 6 cartas
    }
    
    //Permite jugar una carta por su indice en la lista de cartas que tiene 
    public boolean recibirCarta(carta card) {
        if (cartas.size() < 6) {
            cartas.add(card);
            return true;
        } else {
            System.out.println("El jugador ya tiene 6 cartas. No se puede añadir más.");
            return false;
        }
    }
    
    public carta jugarCarta(int indice) {
        if (indice >= 0 && indice < cartas.size()) {
            return cartas.remove(indice); // Remueve y devuelve la carta seleccionada
        } else {
            System.out.println("Índice de carta no válido.");
            return null;
        }
    }
    
}