/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.ruta;

 import java.lang.ModuleLayer.Controller;
 
 import javax.swing.SwingUtilities;
 
 import com.mycompany.ruta.controller.controller;
 
 import com.mycompany.ruta.view.View;
 
 /**
  *
  * @author juan
  */
 public class Ruta {
 
     public static void main(String[] args) {
 
         //SwingUtilities.invokeLater(() -> {
             View vista = new View();
             controller controlador = new controller(vista, 4); // Establece el máximo de jugadores
             if (args.length == 0) {
                 controlador.iniciarServidor();
             } else {
                 controlador.connectToServer(args[0], Integer.parseInt(args[1]));
             }
         //});
     }
 }