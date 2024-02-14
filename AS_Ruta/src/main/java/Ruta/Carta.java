/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruta;

/**
 *
 * @author isabella
 */
public class Carta {
    private String nombre;
    private TipoCarta tipo;
    private int valor;

    public Carta(String nombre, TipoCarta tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Carta(int valor, TipoCarta tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }
}
