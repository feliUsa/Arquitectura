package com.mycompany.ruta.model;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.ruta.model.Cards.Carta;

public class AliadoLimite {
    private String tipo;
    private List<Carta> cartas;

    public AliadoLimite(String tipo) {
        this.tipo = tipo;
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        if (carta.getTipo().equals(tipo)) {
            cartas.add(carta);
            System.out.println("Carata: " + carta +" agregada correctamente a la pila de aliado limite");
        } else {
            System.out.println("Esta pila solo acepta cartas del mismo tipo.");
        }
    }
}
