/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author bella
 */
public class shuffler {
    public static List<Carta> shuffleObjects(List<Carta> objects) {
        List<Carta> shuffledObjects = new ArrayList<>(objects);
        Collections.shuffle(shuffledObjects);
        System.out.println(shuffledObjects);
        return shuffledObjects;
    }
}