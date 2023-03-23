/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author 52614
 */
public class Circulo implements Figuras, MostrarDatos {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo() {
       super();
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
//La interfaz es como un contrato, te obliga a seguir cierto comportamiento.

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPeri() {
        return Math.PI * (radio * 2);
    }

    @Override
    public void imprmirDatos() {
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPeri());
    }

}
