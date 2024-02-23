package ModeloRecursos;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaRecursosInterface;

public class taller implements cartaRecursosInterface{

    private final String nombre = "Taller";
    private final String description = "A los pits";
    private final int cantidadTotalCartas = 14;
    private String rutaImagen;

    public taller(String rutaImagen){
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
