package com.mycompany.ruta.model;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.ruta.model.Cards.Carta;

public class EnemigoSeguridad {
    private String tipo;
    private List<Carta> cartas;

    public EnemigoSeguridad(String tipo) {
        this.tipo = tipo;
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        if (carta.getTipo().equals(tipo)) {
            cartas.add(carta);
            System.out.println("Carata: " + carta +" agregada correctamente a la pila del enemigo seguridad");
        } else {
            System.out.println("Esta pila solo acepta cartas del mismo tipo.");
        }
    }
}
