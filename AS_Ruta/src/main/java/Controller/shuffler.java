package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Model.Carta;

public class shuffler {
    public static List<Carta> shuffleObjects(List<Carta> objects) {
        List<Carta> shuffledObjects = new ArrayList<>(objects);
        Collections.shuffle(shuffledObjects);
        System.out.println(shuffledObjects);
        return shuffledObjects;
    }
}
