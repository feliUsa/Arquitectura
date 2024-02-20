import ControladorP.Controlador;
import VistaP.Vista;


public class App {

    
    public static void main(String[] args) {

        Controlador controlador = new Controlador(); // Inicializa el controlador
        Vista vista = new Vista(); // Inicializa la vista
        vista.setControlador(controlador); // Establece el controlador en la vista
        controlador.iniciarJuego(); // Muestra el menú y comienza el juego
}
}
