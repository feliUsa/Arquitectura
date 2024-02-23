package ModeloRiesgo;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaRiesgoInterface;

public class stop implements cartaRiesgoInterface{

    private final String nombre = "Stop";
    private final String description = "DETENTE YA";
    private final int cantidadTotalCartas = 5;
    private String rutaImagen;

    public stop(String rutaImagen){
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
