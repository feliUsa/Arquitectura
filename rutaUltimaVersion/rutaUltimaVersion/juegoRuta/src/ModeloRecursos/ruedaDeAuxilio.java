package ModeloRecursos;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaRecursosInterface;

public class ruedaDeAuxilio implements cartaRecursosInterface{

    private final String nombre = "Rueda de Auxilio";
    private final String description = "Rueda++";
    private final int cantidadTotalCartas = 6;
    private String rutaImagen;

    public ruedaDeAuxilio(String rutaImagen){
        this.rutaImagen = rutaImagen;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDescripcion() {
        return description;
    }

    @Override
    public String getRutaImagen() {
        return rutaImagen;
    }

    @Override
    public int getCantidadTotalCartas() {
        return cantidadTotalCartas;
    }

    public void aplicarEfecto(jugador player){
        // Realizar logica para aplicar efecto a jugador
    }
}
