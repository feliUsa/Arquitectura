/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author isabella
 */
import Controlador.Controlador;
import Modelo.Carta;
import java.util.List;

public class Vista {
    private Controlador controlador;
    
    public void mostrarCartas(List<Carta> cartas) {
        for (Carta carta : cartas) {
            System.out.println(carta.getNombre());
        }
    }
    
}
    
  
