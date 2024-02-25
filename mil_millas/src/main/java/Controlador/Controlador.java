/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author isabella
 */
import Modelo.Carta;
import Modelo.FabricaCartas;
import Modelo.FabricaCartasStandard;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Carta> mazo;

    public Controlador() {
        mazo = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        mazo.add(carta);
    }

    public List<Carta> obtenerMazo() {
        return mazo;
    }
    
    // Método para llenar el mazo con cartas de distancia específicas
    public void llenarMazoCartasDistancia() {
        FabricaCartas fabrica = new FabricaCartasStandard();
        
        //CARTAS DE 25 - 10
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 25", 25));
        
        //CARTAS DE 50 - 10
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 50", 50));
        
        //CARTAS DE 75 - 10
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 75", 75));
        
        //CARTAS 100 - 12
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 100", 100));
        
        //CARTAS 200 - 4
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 200", 200));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 200", 200));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 200", 200));
        agregarCarta(fabrica.crearCartaDistancia("Carta de Distancia 200", 200));
    }
    
    public void llenarMazoCartaProblema(){
        FabricaCartas fabrica = new FabricaCartasStandard();
        
        //CARTA STOP 5
        agregarCarta(fabrica.crearCartaProblema("Stop"));
        agregarCarta(fabrica.crearCartaProblema("Stop"));
        agregarCarta(fabrica.crearCartaProblema("Stop"));
        agregarCarta(fabrica.crearCartaProblema("Stop"));
        agregarCarta(fabrica.crearCartaProblema("Stop"));
        
        //CARTA VEL MAX 4
        agregarCarta(fabrica.crearCartaProblema("Velocidad máxima de 50"));
        agregarCarta(fabrica.crearCartaProblema("Velocidad máxima de 50"));
        agregarCarta(fabrica.crearCartaProblema("Velocidad máxima de 50"));
        agregarCarta(fabrica.crearCartaProblema("Velocidad máxima de 50"));
        
        // CARTA FALTA COMBUSTIBLE 3
        agregarCarta(fabrica.crearCartaProblema("Falta de combustible"));
        agregarCarta(fabrica.crearCartaProblema("Falta de combustible"));
        agregarCarta(fabrica.crearCartaProblema("Falta de combustible"));
        
        //CARTA CHOQUE 3
        agregarCarta(fabrica.crearCartaProblema("Choque"));
        agregarCarta(fabrica.crearCartaProblema("Choque"));
        agregarCarta(fabrica.crearCartaProblema("Choque"));
        
        //CARTA PINCHADURA 3
        agregarCarta(fabrica.crearCartaProblema("Pinchadura"));
        agregarCarta(fabrica.crearCartaProblema("Pinchadura"));
        agregarCarta(fabrica.crearCartaProblema("Pinchadura"));
        agregarCarta(fabrica.crearCartaProblema("Pinchadura"));
    }
    
    public void llenarMazoSeguridad(){
        FabricaCartas fabrica = new FabricaCartasStandard();
        agregarCarta(fabrica.crearCartaSeguridad("Prioridad de paso"));
        agregarCarta(fabrica.crearCartaSeguridad("Combustible extra"));
        agregarCarta(fabrica.crearCartaSeguridad("As del volante"));
        agregarCarta(fabrica.crearCartaSeguridad("A prueba de pinchaduras"));   
    }
    
    public void llenarMazoSolucion (){
        FabricaCartas fabrica = new FabricaCartasStandard();
        
        //CARTA SIGA - 14
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        agregarCarta(fabrica.crearCartaSolucion("Siga"));
        
        
        //CARTA FIN VEL MAX 50 - 6
        agregarCarta(fabrica.crearCartaSolucion("Fin de velocidad máxima de 50"));
        agregarCarta(fabrica.crearCartaSolucion("Fin de velocidad máxima de 50"));
        agregarCarta(fabrica.crearCartaSolucion("Fin de velocidad máxima de 50"));
        agregarCarta(fabrica.crearCartaSolucion("Fin de velocidad máxima de 50"));
        agregarCarta(fabrica.crearCartaSolucion("Fin de velocidad máxima de 50"));
        agregarCarta(fabrica.crearCartaSolucion("Fin de velocidad máxima de 50"));
        
        //CARTA COMBUSTIBLE - 6
        agregarCarta(fabrica.crearCartaSolucion("Combustible"));
        agregarCarta(fabrica.crearCartaSolucion("Combustible"));
        agregarCarta(fabrica.crearCartaSolucion("Combustible"));
        agregarCarta(fabrica.crearCartaSolucion("Combustible"));
        agregarCarta(fabrica.crearCartaSolucion("Combustible"));
        agregarCarta(fabrica.crearCartaSolucion("Combustible"));
        
        
        //CARTA TALLER - 6
        agregarCarta(fabrica.crearCartaSolucion("Taller")); 
        agregarCarta(fabrica.crearCartaSolucion("Taller")); 
        agregarCarta(fabrica.crearCartaSolucion("Taller")); 
        agregarCarta(fabrica.crearCartaSolucion("Taller")); 
        agregarCarta(fabrica.crearCartaSolucion("Taller")); 
        agregarCarta(fabrica.crearCartaSolucion("Taller")); 
        
        //CARTA RUEDA AUXILIO - 6
        agregarCarta(fabrica.crearCartaSolucion("Rueda de auxilio")); 
        agregarCarta(fabrica.crearCartaSolucion("Rueda de auxilio")); 
        agregarCarta(fabrica.crearCartaSolucion("Rueda de auxilio")); 
        agregarCarta(fabrica.crearCartaSolucion("Rueda de auxilio")); 
        agregarCarta(fabrica.crearCartaSolucion("Rueda de auxilio")); 
        agregarCarta(fabrica.crearCartaSolucion("Rueda de auxilio")); 
    } 
}
