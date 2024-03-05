/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author bella
 */
public class CarHandler implements KeyListener{
    CarGameGUI g;

    public CarHandler(CarGameGUI ref) {
        this.g = ref;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //Mirar que llave es pressed
        int code = ke.getKeyCode();
        System.out.println("Key Pressed code:\t" +code);
        if(code==40){
            //Movimiento hacia arriba
            System.out.println("Atras carro 1key pressed");
            int x = g.carPanel.getX();
            int y = g.carPanel.getY();
            System.out.println( x + "," + y);
            
            if(x-g.speed>=0){
            g.carPanel.setLocation(x-g.speed,y);
            
            }
        }
        else if (code==38){
            //Movimiento hacia abajo
            System.out.println("Adelante carro 1 key pressed");
            int x = g.carPanel.getX();
            int y = g.carPanel.getY();
            System.out.println( x + "," + y);
            
            if(x+g.speed>=0){
            g.carPanel.setLocation(x+g.speed,y);
            
            }
            
        }else if(code == 39){
            //Movimiento hacia atras carro 2
            System.out.println("Atras carro 2 key pressed");
            int x = g.carPanel2.getX();
            int y = g.carPanel2.getY();
            System.out.println( x + "," + y);
            
            if(x+g.speed>=0){
            g.carPanel2.setLocation(x+g.speed,y);
            
            }
        
        }else if(code == 37){
            //Movimiento hacia arriba
            System.out.println("Atras carro 2 key pressed");
            int x = g.carPanel2.getX();
            int y = g.carPanel2.getY();
            System.out.println( x + "," + y);
            
            if(x-g.speed>=0){
            g.carPanel2.setLocation(x-g.speed,y);
            
            }
        }
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
        
 
    
}
