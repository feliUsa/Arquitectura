/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author isabella
 */
import Controlador.Controlador;
import Modelo.AdaptadorJuego;
import Modelo.Juego;
import javax.swing.Icon;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        
     String[] options = {"Juego multijugador", " Juego solitario"};
     Icon icon = null;
     int type =0;
     int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Bienvenido a jugar Mil Millas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
     if(seleccion==0){
         //EventosPaginaInicio eventos = new EventosPaginaInicio(new VentanaInicial());
        type =0;
     }else{
         //EventosPaginaInicioLego  eventos = new EventosPaginaInicioLego(new JFPaginaSiguiente_Lego(),type);
         type =1;
     }
        
        Controlador controlador = new Controlador();
        controlador.llenarMazoCartasDistancia();
        controlador.llenarMazoCartaProblema();
        controlador.llenarMazoSeguridad();
        controlador.llenarMazoSolucion();

        Juego juego = new Juego(controlador);
        juego.iniciarJuego(); // Iniciar el juego y seleccionar cartas aleatorias
        
        // Crear el adaptador y realizar la jugada
        //AdaptadorJuego adaptador = new AdaptadorJuego(juego);
       // adaptador.realizarJugada();
    
    }    
    
    
}


        