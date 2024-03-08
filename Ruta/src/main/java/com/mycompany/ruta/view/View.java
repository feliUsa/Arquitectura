package com.mycompany.ruta.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.image.BufferedImage;


public class View extends JFrame {

    private JButton[] botones;

    public View() {
        super("Ruta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Crear el panel superior (azul claro)
        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(173, 216, 230)); // Color azul claro

        // Crear el panel inferior
        JPanel panelInferior = new JPanel(new GridLayout(0, 7)); // GridLayout para los botones

        // Crear los botones y agregarlos al panel inferior
        botones = new JButton[7]; // Arreglo para almacenar los botones
        for (int i = 0; i < 7; i++) {
            botones[i] = new JButton(); // Crear botón sin texto
            botones[i].setPreferredSize(new Dimension(100, 100)); 
            panelInferior.add(botones[i]);
        }

        // Configurar el contenedor principal con GridBagLayout
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configurar restricciones para el panel superior
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0.75;
        gbc.fill = GridBagConstraints.BOTH;
        getContentPane().add(panelSuperior, gbc);

        // Configurar restricciones para el panel inferior
        gbc.gridy = 1;
        gbc.weighty = 0.25;
        getContentPane().add(panelInferior, gbc);

        // Ajustar el tamaño y hacer visible el JFrame
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
