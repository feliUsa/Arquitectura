package com.mycompany.ruta.controller;

import java.util.List;

import com.mycompany.ruta.model.Jugador;
import com.mycompany.ruta.model.Validaciones;
import com.mycompany.ruta.model.Game;
import com.mycompany.ruta.model.Cards.Carta;
import com.mycompany.ruta.view.View;

public class Controller{

    private View view;
    private List<Jugador> jugadores;
    private int cartaSeleccionada;
    private String sectorSeleccionado;
    private Game juego;
    private Carta carta;
    private Validaciones validaciones;

    
    public Controller(View view) {
        this.view = view;
    }

    public void setValidaciones(Validaciones validaciones){
        this.validaciones = validaciones;
    }
    
    public void setJugadores(List<Jugador> jugadores){
        this.jugadores = jugadores;
    }

    public void setGame(Game juego){
        this.juego = juego;
    }

    public void carta(int numeroBoton) {
        cartaSeleccionada = numeroBoton;
        System.out.println("El boton: " + cartaSeleccionada + " llego al controlador");
        carta = jugadores.get(juego.getJugadorActual()).getCard(numeroBoton);
        System.out.println("Se selecciono la carta: " + carta);
        validaciones.setCartaSeleccionada(carta);
    }

    public void zona(String zona){
        sectorSeleccionado = zona;
        System.out.println("El sector: " + sectorSeleccionado + " llego al controlador");
        validaciones.validacion(zona);
    }

    public void procesarCartas(List<Carta> listaCartas) {
        for (int i = 0; i < listaCartas.size(); i++) {
            Carta carta = listaCartas.get(i);
            String url = carta.getUrl();
            // Enviar la URL junto con el número (posición) de la carta
            enviarUrlConNumero(url, i + 1);
        }
    }

    private void enviarUrlConNumero(String url, int numero) {
        // Verificar si view está inicializado correctamente
        if (view != null) {
            // Llamar al método en view
            view.asignarURL(numero, url);
        } else {
            System.out.println("Error: view no está inicializado correctamente");
        }
    }


    //Cosas de la vista
    
}