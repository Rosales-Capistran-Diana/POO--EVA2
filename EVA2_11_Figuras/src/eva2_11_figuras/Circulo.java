/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_figuras;

/**
 *
 * @author 52614
 */
public class Circulo extends Figuras {
 private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this.radio = 100;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
 @Override
    public double calcularArea(){
       return Math.PI * (radio * radio); 
    }
 @Override
    public double calcularPerimetro(){
        return Math.PI * (radio * 2);
    }
}
