package ModeloRecursos;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaRecursosInterface;

public class combustible implements cartaRecursosInterface{

    private final String nombre = "Combustible";
    private final String description = "A la bomba, puedes repostar combustible";
    private final int cantidadTotalCartas = 6;
    private String rutaImagen;

    public combustible(String rutaImagen){
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