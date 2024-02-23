package ModeloSeguridad;

import ModeloPackage.jugador;
import ModeloPackageInterface.cartaSeguridadInterface;

public class asDelVolante implements cartaSeguridadInterface{

    private final String nombre = "As del Volante";
    private final String description = "Eres un As del Volante";
    private final int cantidadTotalCartas = 1;
    private final int valorCarta = 100;
    private String rutaImagen;

    public asDelVolante(String rutaImagen){
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
    public int getValorCarta() {
        return valorCarta;
    }

    @Override
    public void aplicarEfecto(jugador player) {
        // Implementar logica para aplicar carta de seguiridad a jugador
    }
    
}
