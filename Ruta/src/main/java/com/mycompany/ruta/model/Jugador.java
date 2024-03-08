package com.mycompany.ruta.model;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.ruta.model.Cards.Carta;


public class Jugador {

    private String name;
    private List<Object> playerObjects;
    private List<Carta> hand;
    boolean stop = true;
    int velMax = 200;
    boolean combustible = true;
    boolean choque = false;
    boolean pinchazo = false;
    int distancia = 0;

    public Jugador(String name, boolean stop, int velMax, boolean combustible, boolean choque, boolean pinchazo, int distancia) {
        this.name = name;
        this.stop = stop;
        this.velMax = velMax;
        this.combustible = combustible;
        this.choque = choque;
        this.pinchazo = pinchazo;
        this.distancia = distancia;
        playerObjects = new ArrayList<>();
        hand = new ArrayList<>();
    }

    public void addObject(Object obj) {
        playerObjects.add(obj);
    }

    public List<Object> getPlayerObjects() {
        return playerObjects;
    }

    public void addCard(Carta card) {
        hand.add(card);
    }

    public String getName() {
        return name;
    }

    // crear metodo para recibir la carta
    public void recibirCarta(Carta carta) {
        carta.accion(this);
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public boolean isChoque() {
        return choque;
    }

    public void setChoque(boolean choque) {
        this.choque = choque;
    }

    public boolean isCombustible() {
        return combustible;
    }

    public void setCombustible(boolean combustible) {
        this.combustible = combustible;
    }

    public boolean isPinchazo() {
        return pinchazo;
    }

    public void setPinchazo(boolean pinchazo) {
        this.pinchazo = pinchazo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void sumarDistancia(int recorrido){
        distancia += recorrido; 
    }

    public void jugarCartaOponente(Jugador oponente, Carta carta){
        oponente.recibirCarta(carta);
    }
    
    public Carta obtenerPrimerObjeto() {
        if (hand != null && !hand.isEmpty()) {
            return hand.get(0); // Retorna el primer objeto de la lista
        } else {
            return null; // Retorna null si la lista está vacía
        }
    }
    
    public List<Carta> getHand(){
        return hand;
    }
}
