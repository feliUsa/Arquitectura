package com.mycompany.ruta.model;

import com.mycompany.ruta.model.Cards.Carta;

public class Validaciones {
    private Carta cartaSeleccionada;
    private Mesa mesa;

    public void setCartaSeleccionada(Carta cartaSeleccionada) {
        this.cartaSeleccionada = cartaSeleccionada;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void validacion(String sector) {
        if (cartaSeleccionada != null) { // Validación de la carta seleccionada
            if (sector.equals("Aliado Sector Puja")) {
                mesa.aliadoPuja.agregarCarta(cartaSeleccionada);
            } else if (sector.equals("Aliado Sector Limite de velocidad")) {
                mesa.aliadoLimite.agregarCarta(cartaSeleccionada);
            } else if (sector.equals("Aliado Parciales de Distancia")) {
                mesa.aliadoDistanacia.agregarCarta(cartaSeleccionada);
            } else if (sector.equals("Aliado Carta Seguridad 1") || sector.equals("Aliado Carta Seguridad 2")) {
                mesa.aliadoSeguridad.agregarCarta(cartaSeleccionada);
            } else if (sector.equals("Enemigo Sector Puja")) {
                mesa.enemigoPuja.agregarCarta(cartaSeleccionada);
            } else if (sector.equals("Enemigo Sector Limite de velocidad")) {
                mesa.enemigoLimite.agregarCarta(cartaSeleccionada);
            } else if (sector.equals("Enemigo Parciales de Distancia")) {
                mesa.enemigoDistancia.agregarCarta(cartaSeleccionada);
            } else if (sector.equals("Enemigo Carta Seguridad 1") || sector.equals("Enemigo Carta Seguridad 2")) {
                mesa.enemigoSeguridad.agregarCarta(cartaSeleccionada);
            }
        } else {
            System.out.println("Error: La carta seleccionada es nula.");
        }
        cartaSeleccionada = null;
    }
}
