package com.mycompany.ruta.model;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.ruta.model.Cards.Carta;

public class AliadoPuja {
    private String tipo;
    private List<Carta> cartas;

    public AliadoPuja(String tipo) {
        this.tipo = tipo;
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        System.out.println(carta.getTipo());
        if (carta.getTipo().equals(tipo)) {
            cartas.add(carta);
            System.out.println("Carata: " + carta +" agregada correctamente a la pila de aliado puja");
        } else {
            System.out.println("Esta pila solo acepta cartas del mismo tipo.");
        }
    }
}
