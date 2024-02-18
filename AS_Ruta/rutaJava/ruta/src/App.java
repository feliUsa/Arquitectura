import Controlador.Controlador;
import Vista.Vista;

public class App {

    
    public static void main(String[] args) {
        Vista vista = new Vista(null); // Inicializamos vista con un valor nulo por ahora
        Controlador controlador = new Controlador(vista); // Creamos una instancia de Controlador con la vista
        vista.setControlador(controlador); // Establecemos el controlador en la vista
        vista.iniciarJuego(); // Esto muestra el menú y comienza el juego
    }
}
