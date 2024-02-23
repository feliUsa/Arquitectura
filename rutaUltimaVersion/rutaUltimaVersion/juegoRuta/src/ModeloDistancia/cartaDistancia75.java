package ModeloDistancia;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaDistanciaInterface;;

public class cartaDistancia75 implements cartaDistanciaInterface{
    
    private final int distancia = 75;
    private final int cantidadTotalCartas = 10;
    private final String nombre = "Carta Distancia";
    private final String description = "Esta carta realiza un desplazamiento de " + distancia + " al jugador";
    private String rutaImagen;

    public cartaDistancia75(String rutaImagen){
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

    @Override
    public int obtenerDistancia() {
        return distancia;
    }

    @Override
    public void aplicarEfecto(jugador player) {
        // Implementar logica para aplicar carta a jugador
    }

    @Override
    public void revertirEfecto(jugador player) {
        // Implementar logica para aplicar carta a jugador
    }

    // Metodo para saber si se puede aplicar una carta que cancele esta carta
    @Override
    public boolean esReversible() {
        return true;
        // Implementar logica para aplicar carta a jugador
    }

    

}
