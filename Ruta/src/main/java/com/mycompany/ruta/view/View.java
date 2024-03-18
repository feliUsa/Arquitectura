package com.mycompany.ruta.view;

import javax.imageio.ImageIO;
import javax.swing.*;

import com.mycompany.ruta.controller.Controller;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private JButton[] botones;
    private Controller controlador;

    public void setController(Controller controlador) {
        this.controlador = controlador;
    }

    public View() {

        super("Ruta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla


        // Crear botones para el sector aliado
        JButton aliadoSectorPuja = new JButton("Aliado Sector Puja");
        aliadoSectorPuja.setBounds(40, 50, 150, 50); // Izquierda - Coordenadas (x, y, ancho, altura)
        add(aliadoSectorPuja);
        
        JButton aliadoSectorLimiteDeVelocidad = new JButton("Aliado Sector Limite de velocidad");
        aliadoSectorLimiteDeVelocidad.setBounds(40, 120, 150, 50); // Izquierda - Coordenadas (x, y, ancho, altura)
        add(aliadoSectorLimiteDeVelocidad);
        
        JButton aliadoParcialesDistancia = new JButton("Aliado Parciales de Distancia");
        aliadoParcialesDistancia.setBounds(40, 190, 150, 50); // Izquierda - Coordenadas (x, y, ancho, altura)
        add(aliadoParcialesDistancia);
        
        JButton aliadoCartaSeguridad1 = new JButton("Aliado Carta Seguridad 1");
        aliadoCartaSeguridad1.setBounds(40, 260, 150, 50); // Izquierda - Coordenadas (x, y, ancho, altura)
        add(aliadoCartaSeguridad1);
        
        JButton aliadoCartaSeguridad2 = new JButton("Aliado Carta Seguridad 2");
        aliadoCartaSeguridad2.setBounds(40, 330, 150, 50); // Izquierda - Coordenadas (x, y, ancho, altura)
        add(aliadoCartaSeguridad2);


        // Crear botones para la zona de puja
        JButton descarte = new JButton("Zona descarte");
        descarte.setBounds(480, 100, 150, 200); // Centro - Coordenadas (x, y, ancho, altura)
        add(descarte);

        JButton toma = new JButton("Zona de toma");
        toma.setBounds(770, 100, 150, 200); // Centro - Coordenadas (x, y, ancho, altura)
        add(toma);


        
        // Crear botones para el sector enemigo
        JButton enemigoSectorPuja = new JButton("Enemigo Sector Puja");
        enemigoSectorPuja.setBounds(1130, 50, 150, 50); // Derecha - Coordenadas (x, y, ancho, altura)
        add(enemigoSectorPuja);

        JButton enemigoSectorLimiteVelocidad = new JButton("Enemigo Sector Limite de velocidad");
        enemigoSectorLimiteVelocidad.setBounds(1130, 120, 150, 50); // Derecha - Coordenadas (x, y, ancho, altura)
        add(enemigoSectorLimiteVelocidad);

        JButton enemigoParcialesDistancia = new JButton("Enemigo Parciales de Distancia");
        enemigoParcialesDistancia.setBounds(1130, 190, 150, 50); // Derecha - Coordenadas (x, y, ancho, altura)
        add(enemigoParcialesDistancia);

        JButton enemigoCartaSeguridad1 = new JButton("Enemigo Carta Seguridad 1");
        enemigoCartaSeguridad1.setBounds(1130, 260, 150, 50); // Derecha - Coordenadas (x, y, ancho, altura)
        add(enemigoCartaSeguridad1);

        JButton enemigoCartaSeguridad2 = new JButton("Enemigo Carta Seguridad 2");
        enemigoCartaSeguridad2.setBounds(1130, 330, 150, 50); // Derecha - Coordenadas (x, y, ancho, altura)
        add(enemigoCartaSeguridad2);

        // Agregar ActionListener a cada botón
        aliadoSectorPuja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        aliadoSectorLimiteDeVelocidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        aliadoParcialesDistancia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        aliadoCartaSeguridad1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        aliadoCartaSeguridad2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });

        descarte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        toma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        enemigoSectorPuja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        enemigoSectorLimiteVelocidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        enemigoParcialesDistancia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        enemigoCartaSeguridad1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });
        
        enemigoCartaSeguridad2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.zona(((JButton) e.getSource()).getText());
            }
        });


        
        // Crear el panel inferior
        JPanel panelInferior = new JPanel(new FlowLayout()); // FlowLayout para los botones
        panelInferior.setBackground(new Color(0, 216, 230));

        // Crear los botones y agregarlos al panel inferior
        botones = new JButton[7]; // Arreglo para almacenar los botones
        for (int i = 0; i < 7; i++) {
            botones[i] = new JButton(); // Crear botón sin texto
            botones[i].setPreferredSize(new Dimension(150, 250));
            panelInferior.add(botones[i]);

            final int buttonIndex = i; // Se necesita una variable final para usar en ActionListener

            // Agregar ActionListener al botón
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Enviar al controlador el botón que se presiona, es decir, la carta en la
                    // lista
                    controlador.carta(buttonIndex);
                }
            });
        }

        // Configurar el contenedor principal con BorderLayout
        getContentPane().setLayout(new BorderLayout());

        // Agregar el panel superior al norte y el panel inferior al sur
        getContentPane().add(panelInferior, BorderLayout.SOUTH);

        // Hacer visible el JFrame
        pack();
        setLocationRelativeTo(null); // Centrar en la pantalla
        setVisible(true);
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
                Image scaledImage = originalImage.getScaledInstance(boton.getWidth(), boton.getHeight(), 0);

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
}
