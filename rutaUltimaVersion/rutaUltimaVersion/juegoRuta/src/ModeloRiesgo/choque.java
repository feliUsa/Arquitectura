package ModeloRiesgo;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaRiesgoInterface;

public class choque implements cartaRiesgoInterface{

    private final String nombre = "Choque";
    private final String description = "Te haz chocado, baja del coche";
    private final int cantidadTotalCartas = 3;
    private String rutaImagen;

    public choque(String rutaImagen){
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
