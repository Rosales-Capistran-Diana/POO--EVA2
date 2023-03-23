/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClase;

/**
 *
 * @author 52614
 */
public abstract class Ropa extends Producto {

    private String talla;
    private String marca;
    private String color;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ropa() {
        super();
        this.talla = " ";
        this.marca = " ";
        this.color = " ";
    }

    public Ropa(String talla, String marca, String color, double Precio, String descripcion, String unidadVenta) {
        super(Precio, descripcion, unidadVenta);
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

}
