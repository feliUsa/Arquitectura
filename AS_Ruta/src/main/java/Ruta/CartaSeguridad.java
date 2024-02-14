/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruta;

/**
 *
 * @author isabella
 */
public class CartaSeguridad {
    private String nombre;

    public CartaSeguridad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Definición de las cartas de seguridad como variables estáticas
    public static final CartaSeguridad PRIORIDAD_DE_PASO = new CartaSeguridad("Prioridad de paso");
    public static final CartaSeguridad COMBUSTIBLE_EXTRA = new CartaSeguridad("Combustible extra");
    public static final CartaSeguridad AS_DEL_VOLANTE = new CartaSeguridad("As del volante");
    public static final CartaSeguridad A_PRUEBA_DE_PINCHADURAS = new CartaSeguridad("A prueba de pinchaduras");
    
}
    

