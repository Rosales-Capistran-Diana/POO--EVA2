/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClase.Electronica;

/**
 *
 * @author 52614
 */
public final class Computadora extends Electronica {

    private int memoria;
    private double tamaPantalla;
    private double discoDuro;
    private String procesador;

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamaPantalla() {
        return tamaPantalla;
    }

    public void setTamaPantalla(double tamaPantalla) {
        this.tamaPantalla = tamaPantalla;
    }

    public double getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(double discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Computadora() {
        super();
        this.memoria = 0;
        this.tamaPantalla = 0;
        this.discoDuro = 0;
        this.procesador = " ";
    }

    public Computadora(int memoria, double tamaPantalla, double discoDuro, String procesador, String fabricante, String modelo, int garantia, double Precio, String descripcion, String unidadVenta) {
        super(fabricante, modelo, garantia, Precio, descripcion, unidadVenta);
        this.memoria = memoria;
        this.tamaPantalla = tamaPantalla;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }

    /*
Antes de cierta cantidad manejamos precio normal
Después de cierta cantidad hay un descuento.
     */

 /*
    Precio está declarado como privado
    para ello, es necesario utilizar 
    el método "get"
    O bien modificar el private a protected
     */
    @Override
    public double precioVenta(int cant) {
        if (cant <= 10) {
            return Precio * cant;
        } else {
            return (Precio * 0.8) * cant;

        }
    }

}
/*
final --> No se puede heredar de una clase marcada con final

class Laptop extends Computadora{
}
 */
