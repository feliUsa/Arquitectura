package com.mycompany.ruta.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bella
 */

public class CarGameGUI {
    JFrame fr;
    JPanel carPanel;
    JPanel carPanel2;
    JPanel cartasSeguridad;
    JPanel cartasPuja;
    JPanel cartasDistancia;
    JPanel cartasLimVel;
    JLabel selectedCar;
    JLabel background;
    CarHandler hnd;
    int speed;

    public CarGameGUI() {
        // Mostrar mensaje de bienvenida
        JOptionPane.showMessageDialog(null,
                "¡BIenvenido al juego en donde tu eres el conductor de tu victoria!"
                + "\n "
                + "\n     Cada jugador es un automovilista que deberá recorrer en cada mano 1.000 MILLAS justas, superando las dificultades que los demás "
                + "\n     jugadores van interponiendo en su camino y tratando al mismo tiempo, de dificultar el viaje de sus contrincantes para evitar que sigan su ruta."
                + "\n     Este juego esta diseñado para que lo jueguen de 2 a 6 jugadores "
                + "\n     Introducción: "
                + "\n        1.000 Millas es un juego de cartas en el que cada participante es un automovilistico. Cada jugada consiste en tomar una carta y jugar otra "
                + "\n        implementando estrateguas para ser el primero en llegar a la meta."
                + "\n        A la hora de poner el vehiculo en marcha, se pueden observar varios contratiempos, por lo que se recomienda observar las cartas con atención"
                + "\n        y tomarse unos minutos para comprender las reglas antes de empezar a jugar."
                + "\n        De cada mano se obtendrá un puntaje y se podrán jugar tantas manos como sean necesarias hasta que alguien sume 5.000 puntos o más."
                + " ", "Juego de mil millas", JOptionPane.PLAIN_MESSAGE, new ImageIcon("ruta.png"));
        
        // Mostrar mensaje de bienvenida
        JOptionPane.showMessageDialog(null,
                "¡Instrucciones!"
                + "\n "
                + "\n     Segun el carro que quieras escoger lo podras mover para mirar a cuanto estas de la meta "
                + "\n     El carro rojo lo podras mover con las teclas de arriba y abajo."
                + "\n     El carro azul lo podras mover con las teclas de derecha e izquierda. "
                + " ", "Instrucciones Juego de mil millas", JOptionPane.PLAIN_MESSAGE, new ImageIcon("2.png"));
        // Iniciar la ventana principal del juego de mil millas
        speed = 20;
        hnd = new CarHandler(this);
        initGUI();
        }
    

    private void initGUI() {
        fr = new JFrame("Juego de mil millas");
        fr.setLayout(null);
        
        //Panel del primer carro
        carPanel = new JPanel();
        carPanel.setSize(80, 80); // Ajusta el tamaño del panel según tu necesidad
        carPanel.setLocation(60, 6);
        carPanel.setBackground(Color.BLACK);
        
        //Panel del segundo carro
        carPanel2 = new JPanel();
        carPanel2.setSize(80, 80); // Ajusta el tamaño del panel según tu necesidad
        carPanel2.setLocation(59, 65);
        carPanel2.setBackground(Color.BLACK);
        
        //Fondo del racing
        background = new JLabel("", new ImageIcon("5.png"),JLabel.CENTER);
        background.setBounds(0, 0, 800, 170);
        background.add(carPanel);
        background.add(carPanel2);
        
        //Panel cartas de seguridad
        cartasSeguridad = new JPanel();
        cartasSeguridad.setSize(80, 80); 
        cartasSeguridad.setLocation(59, 65);
        
        //Panel cartas de puja
        cartasPuja = new JPanel();
        carPanel2.setSize(80, 80); 
        carPanel2.setLocation(59, 65);
        
        //Panel cartas distancia         
        cartasDistancia = new JPanel();
        cartasDistancia.setSize(80, 80); 
        cartasDistancia.setLocation(59, 65);
        
        //Panel cartas cartas LimVel
        cartasLimVel = new JPanel();
        cartasLimVel.setSize(80, 80); // Ajusta el tamaño del panel según tu necesidad
        cartasLimVel.setLocation(59, 65);
        
        // Añadir la imagen del primer coche
        JLabel car1 = new JLabel(new ImageIcon("carr.png"));
        car1.setSize(50, 30); // Ajustar el tamaño del coche si es necesario
        car1.setLocation(10, 10); // Posicionar el primer coche
        car1.setName("car1"); // Establecer un nombre para identificar la imagen
        car1.setFocusable(true); // Permitir que la imagen sea seleccionable con el teclado
        car1.addKeyListener(hnd); // Agregar el KeyListener a la imagen
        carPanel.add(car1);
        
        // Añadir la imagen del segundo coche
        JLabel car2 = new JLabel(new ImageIcon("car(1).png"));
        car2.setSize(50, 30); // Ajustar el tamaño del coche si es necesario
        car2.setLocation(10, 1150); // Posicionar el segundo coche
        car2.setName("car2"); // Establecer un nombre para identificar la imagen
        car2.setFocusable(true); // Permitir que la imagen sea seleccionable con el teclado
        car2.addKeyListener(hnd); // Agregar el KeyListener a la imagen
        carPanel2.add(car2);
        
        
        // Agregar el paneles al frame
        fr.add(carPanel);
        fr.add(carPanel2);
        fr.add(background);
        fr.add(cartasSeguridad);
        fr.add(cartasPuja);
        fr.add(cartasLimVel);
        fr.add(cartasDistancia);
        
        //Tamaño del frame
        fr.setResizable(false); //Si esta verdadero entonces el tamaño se podra cambiar
        fr.setSize(800, 500);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

