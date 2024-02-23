package ModeloRiesgo;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaRiesgoInterface;

public class pinchadura implements cartaRiesgoInterface{

    private final String nombre = "Pinchadura";
    private final String description = "La llanta ha salido del chat";
    private final int cantidadTotalCartas = 3;
    private String rutaImagen;

    public pinchadura(String rutaImagen){
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
