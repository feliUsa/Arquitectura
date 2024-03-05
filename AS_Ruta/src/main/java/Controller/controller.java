package Controller;

import java.util.List;


public class controller {
    
    private List<Object> objetos;

    public controller() {
        cardFactory cardFactory = new cardFactory();
        objetos = cardFactory.createCards();
    }

}
