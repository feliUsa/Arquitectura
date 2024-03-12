package com.mycompany.ruta.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.List;

import com.mycompany.ruta.controller.Controller;
import com.mycompany.ruta.model.Jugador;
import com.mycompany.ruta.model.cardFactory;
import com.mycompany.ruta.model.playerFactory;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private JButton[] botones;
    private static final int BOTON_ANCHO = 120; // Ancho de los botones
    private static final int BOTON_ALTO = 180; // Alto de los botones
    private Controller controller;
    private List<Jugador> jugadores;
    
    public View() {
        super("Juego de Mil Millas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Mostrar mensaje de bienvenida y configuración de la ventana
        mostrarBienvenida();

        // Configurar el contenedor principal con GridBagLayout
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Crear el panel inferior
        JPanel panelInferior = new JPanel(new GridLayout(0, 7, 10, 10)); // GridLayout para los botones
        panelInferior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Añadir un borde vacío para separar los botones del borde de la ventana
        gbc.gridy = 1;
        gbc.weighty = 0.25;
        getContentPane().add(panelInferior, gbc);

        // Crear los botones y agregarlos al panel inferior
        botones = new JButton[7]; // Arreglo para almacenar los botones
        for (int i = 0; i < 7; i++) {
            botones[i] = new JButton(); // Crear botón sin texto
            botones[i].setPreferredSize(new Dimension(BOTON_ANCHO, BOTON_ALTO)); // Establecer tamaño del botón
            panelInferior.add(botones[i]);

            final int buttonIndex = i; // Se necesita una variable final para usar en ActionListener

            // Agregar ActionListener al botón
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Aquí puedes ejecutar la acción deseada cuando se presione el botón
                    System.out.println("Se presionó el botón " + (buttonIndex + 1));
                }
            });
        }

        // Ajustar el tamaño y hacer visible el JFrame
        pack();
        setLocationRelativeTo(null); // Centrar en la pantalla
        setVisible(true);
    }

    // Método para mostrar mensaje de bienvenida y configuración de la ventana
    private void mostrarBienvenida() {
        JOptionPane.showMessageDialog(null,
                "¡Bienvenido al juego en donde tú eres el conductor de tu victoria!"
                        + "\n "
                        + "\n     Cada jugador es un automovilista que deberá recorrer en cada mano 1.000 MILLAS justas, superando las dificultades que los demás "
                        + "\n     jugadores van interponiendo en su camino y tratando al mismo tiempo, de dificultar el viaje de sus contrincantes para evitar que sigan su ruta."
                        + "\n     Este juego está diseñado para que lo jueguen de 2 a 6 jugadores "
                        + "\n     Introducción: "
                        + "\n        1.000 Millas es un juego de cartas en el que cada participante es un automovilista. Cada jugada consiste en tomar una carta y jugar otra "
                        + "\n        implementando estrategias para ser el primero en llegar a la meta."
                        + "\n        A la hora de poner el vehículo en marcha, se pueden observar varios contratiempos, por lo que se recomienda observar las cartas con atención"
                        + "\n        y tomarse unos minutos para comprender las reglas antes de empezar a jugar."
                        + "\n        De cada mano se obtendrá un puntaje y se podrán jugar tantas manos como sean necesarias hasta que alguien sume 5.000 puntos o más."
                        + " ", "Juego de Mil Millas", JOptionPane.PLAIN_MESSAGE, new ImageIcon("Ruta/src/main/java/com/mycompany/ruta/resources/images/ruta.png"));

        // Mostrar mensaje de bienvenida
        JOptionPane.showMessageDialog(null,
                "¡Instrucciones!"
                        + "\n "
                        + "\n     Según el carro que quieras escoger lo podrás mover para mirar a cuánto estás de la meta "
                        + "\n     El carro rojo lo podrás mover con las teclas de arriba y abajo."
                        + "\n     El carro azul lo podrás mover con las teclas de derecha e izquierda. "
                        + " ", "Instrucciones Juego de Mil Millas", JOptionPane.PLAIN_MESSAGE, new ImageIcon("Ruta/src/main/java/com/mycompany/ruta/resources/images/2.png"));


}            
    
    // Método para asignar URL a un botón específico
    public void asignarURL(int numeroCarta, String rutaArchivo) {
        // Verificar si el número de carta es válido
        if (numeroCarta >= 1 && numeroCarta <= 7) {
            // Obtener el botón correspondiente al número de carta
            JButton boton = botones[numeroCarta - 1];

            try {
                // Cargar la imagen desde la URL
                File imagenFile = new File(rutaArchivo);
                BufferedImage originalImage = ImageIO.read(imagenFile);

                // Redimensionar la imagen al tamaño del botón
                Image scaledImage = originalImage.getScaledInstance(BOTON_ANCHO, BOTON_ALTO, Image.SCALE_SMOOTH);

                // Establecer la imagen redimensionada como ícono del botón
                boton.setIcon(new ImageIcon(scaledImage));
                boton.setText(null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Número de carta inválido: " + numeroCarta);
        }
    }

    public void listaJugadores(){
        jugadores = controller.getJugadores();
        System.out.println(jugadores.size());
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

}
