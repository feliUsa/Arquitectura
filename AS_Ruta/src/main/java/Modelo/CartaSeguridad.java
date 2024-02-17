/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabella
 */
public class CartaSeguridad extends Carta {
    public CartaSeguridad(String nombre) {
        super(nombre);
    }

    // Definición de cartas de seguridad como variables estáticas
    public static final CartaSeguridad PRIORIDAD_DE_PASO = new CartaSeguridad("Prioridad de paso");
    public static final CartaSeguridad COMBUSTIBLE_EXTRA = new CartaSeguridad("Combustible extra");
    public static final CartaSeguridad AS_DEL_VOLANTE = new CartaSeguridad("As del volante");
    public static final CartaSeguridad A_PRUEBA_DE_PINCHADURAS = new CartaSeguridad("A prueba de pinchaduras");
}

