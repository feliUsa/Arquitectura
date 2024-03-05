/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Carta;
import java.util.ArrayList;
import java.util.List;

import Modelo.crash;
import Modelo.distance100;
import Modelo.distance200;
import Modelo.distance25;
import Modelo.distance50;
import Modelo.distance75;
import Modelo.emptyFuel;
import Modelo.extraFuel;
import Modelo.finVelMax;
import Modelo.fullFuel;
import Modelo.prick;
import Modelo.prioridadPaso;
import Modelo.repuesto;
import Modelo.siga;
import Modelo.steelWheels;
import Modelo.steeringWheelAce;
import Modelo.stop;
import Modelo.taller;
import Modelo.velMax50;

/**
 *
 * @author bella
 */
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
            velMax50 velMax50 = new velMax50();
            objetos.add(velMax50);
        }

        // Carta Falta Combustible
        for (int i = 0; i < 3; i++) {
            emptyFuel emptyFuel = new emptyFuel();
            objetos.add(emptyFuel);
        }

        // Carta Choque 
        for (int i = 0; i < 3; i++) {
            crash choque = new crash();
            objetos.add(choque);
        }

        // Carta Pinchazo
        for (int i = 0; i < 3; i++) {
            prick pinchazo = new prick();
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