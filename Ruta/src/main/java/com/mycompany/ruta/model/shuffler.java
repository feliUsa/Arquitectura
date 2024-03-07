package com.mycompany.ruta.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mycompany.ruta.model.Cards.Carta;

public class shuffler {
    public static List<Carta> shuffleObjects(List<Carta> objects) {
        List<Carta> shuffledObjects = new ArrayList<>(objects);
        Collections.shuffle(shuffledObjects);
        return shuffledObjects;
    }
}
