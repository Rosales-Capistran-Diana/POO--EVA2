/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClase;

/**
 *
 * @author 52614
 */
public abstract class Producto {

    protected double Precio;
    private String descripcion;
    private String unidadVenta;

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    public Producto() {
        this.Precio = 0;
        this.descripcion = " ";
        this.unidadVenta = " ";
    }

    public Producto(double Precio, String descripcion, String unidadVenta) {
        this.Precio = Precio;
        this.descripcion = descripcion;
        this.unidadVenta = unidadVenta;
    }

    public abstract double precioVenta(int cant);
}
