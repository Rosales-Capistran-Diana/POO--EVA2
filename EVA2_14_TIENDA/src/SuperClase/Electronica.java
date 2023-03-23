/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClase;

/**
 *
 * @author 52614
 */
public abstract class Electronica extends Producto {

    private String fabricante;
    private String modelo;
    private int garantia;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public Electronica() {
        super();

        this.fabricante = " ";
        this.modelo = " ";
        this.garantia = 0;
    }

    public Electronica(String fabricante, String modelo, int garantia, double Precio, String descripcion, String unidadVenta) {
        super(Precio, descripcion, unidadVenta);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }

}
