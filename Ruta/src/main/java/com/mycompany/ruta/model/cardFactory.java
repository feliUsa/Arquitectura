package com.mycompany.ruta.model;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.ruta.model.Cards.Carta;
import com.mycompany.ruta.model.Cards.choque;
import com.mycompany.ruta.model.Cards.distance100;
import com.mycompany.ruta.model.Cards.distance200;
import com.mycompany.ruta.model.Cards.distance25;
import com.mycompany.ruta.model.Cards.distance50;
import com.mycompany.ruta.model.Cards.distance75;
import com.mycompany.ruta.model.Cards.emptyFuel;
import com.mycompany.ruta.model.Cards.extraFuel;
import com.mycompany.ruta.model.Cards.finVelMax;
import com.mycompany.ruta.model.Cards.fullFuel;
import com.mycompany.ruta.model.Cards.pinchazo;
import com.mycompany.ruta.model.Cards.prioridadPaso;
import com.mycompany.ruta.model.Cards.repuesto;
import com.mycompany.ruta.model.Cards.siga;
import com.mycompany.ruta.model.Cards.steelWheels;
import com.mycompany.ruta.model.Cards.steeringWheelAce;
import com.mycompany.ruta.model.Cards.stop;
import com.mycompany.ruta.model.Cards.taller;
import com.mycompany.ruta.model.Cards.velMax;

public class cardFactory {
    public List<Carta> createCards() {
        List<Carta> objetos = new ArrayList<>();
        
        // Carta Distacia 25
        objetos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            distance25 distance25 = new distance25();
            objetos.add(distance25);
        }

        // Carta Distacia 50
        for (int i = 0; i < 10; i++) {
            distance50 distance50 = new distance50();
            objetos.add(distance50);
        }

        // Carta Distacia 75
        for (int i = 0; i < 10; i++) {
            distance75 distance75 = new distance75();
            objetos.add(distance75);
        }

        // Carta Distacia 100
        for (int i = 0; i < 12; i++){
            distance100 distance100 = new distance100();
            objetos.add(distance100);
        }

        // Carta Distacia 200
        for (int i = 0; i < 4; i++) {
            distance200 distance200 = new distance200();
            objetos.add(distance200);
        }

        // Carta Distacia Stop
        for (int i = 0; i < 5; i++) {
            stop stop = new stop();
            objetos.add(stop);
        }

        // Carta Distacia Velocidad Maxima
        for (int i = 0; i < 4; i++) {
            velMax velMax50 = new velMax();
            objetos.add(velMax50);
        }

        // Carta Falta Combustible
        for (int i = 0; i < 3; i++) {
            emptyFuel emptyFuel = new emptyFuel();
            objetos.add(emptyFuel);
        }

        // Carta Choque 
        for (int i = 0; i < 3; i++) {
            choque choque = new choque();
            objetos.add(choque);
        }

        // Carta Pinchazo
        for (int i = 0; i < 3; i++) {
            pinchazo pinchazo = new pinchazo();
            objetos.add(pinchazo);
        }

        // Cartas Seguridad
        prioridadPaso prioridadPaso = new prioridadPaso();
        objetos.add(prioridadPaso);
        extraFuel extraFuel = new extraFuel();
        objetos.add(extraFuel);
        steeringWheelAce steeringWheelAce = new steeringWheelAce();
        objetos.add(steeringWheelAce);
        steelWheels steelWheels = new steelWheels();
        objetos.add(steelWheels);

        // Carta Siga
        for (int i = 0; i < 14; i++) {
            siga siga = new siga();
            objetos.add(siga);
        }

        // Carta finVelMax
        for (int i = 0; i < 6; i++) {
            finVelMax finVelMax = new finVelMax();
            objetos.add(finVelMax);
        }

        // Carta fullFuel
        for (int i = 0; i < 6; i++) {
            fullFuel fullFuel = new fullFuel();
            objetos.add(fullFuel);
        }

        // Carta taller
        for (int i = 0; i < 6; i++) {
            taller taller = new taller();
            objetos.add(taller);
        }

        // Carta repuesto
        for (int i = 0; i < 6; i++) {
            repuesto repuesto = new repuesto();
            objetos.add(repuesto);
        } 
        
        return objetos;
    }

}
