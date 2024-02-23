package ModeloRiesgo;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaRiesgoInterface;

public class velocidadMaxima50 implements cartaRiesgoInterface{

    private final String nombre = "Velocidad Maxima 50";
    private final String description = "No tan rapido, hay limite de velocidad";
    private final int cantidadTotalCartas = 4;
    private String rutaImagen;

    public velocidadMaxima50(String rutaImagen){
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
