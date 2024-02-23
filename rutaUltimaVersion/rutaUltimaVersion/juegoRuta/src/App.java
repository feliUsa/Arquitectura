import ControladorPackage.controller;
import VistaPackage.view;

public class App {
    public static void main(String[] args) {
        controller controlador = new controller(); // Inicializa el controlador
        view vista = new view(); // Inicializa la vista
        vista.setControlador(controlador); // Establece el controlador en la vista
        controlador.iniciarJuego(); // Muestra el menú y comienza el juego
    }
}
