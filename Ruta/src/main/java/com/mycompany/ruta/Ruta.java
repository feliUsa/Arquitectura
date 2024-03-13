package com.mycompany.ruta;

import com.mycompany.ruta.controller.*;
import com.mycompany.ruta.view.View;

import java.io.IOException;
import java.util.Scanner;

public class Ruta {

    public static void main(String[] args) {
        System.out.println("Welcome to Ruta!");

        View vista = new View();
        Controller controlador = new Controller(vista);
        vista.setController(controlador);

        controlador.iniciarJuego();
    }
}
