/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClase.Ropa;

/**
 *
 * @author 52614
 */
public class Jeans extends Ropa {

    private String material;
    private String estilo;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String corte) {
        this.estilo = estilo;
    }

    public Jeans() {
        super();
        this.material = " ";
        this.estilo = " ";

    }

    public Jeans(String material, String estilo, String talla, String marca, String color, double Precio, String descripcion, String unidadVenta) {
        super(talla, marca, color, Precio, descripcion, unidadVenta);
        this.material = material;
        this.estilo = estilo;
    }

    @Override
    public double precioVenta(int cant) {
        if (cant <= 5) {
            return Precio * cant;
        } else {
            return (Precio * 0.75) * cant;
        }
    }
}
