package ModeloRiesgo;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaRiesgoInterface;

public class faltaDeCombustible implements cartaRiesgoInterface{

    private final String nombre = "Falta de Combustible";
    private final String description = "Combustible muy bajo, hora de repostar";
    private final int cantidadTotalCartas = 3;
    private String rutaImagen;

    public faltaDeCombustible(String rutaImagen){
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
