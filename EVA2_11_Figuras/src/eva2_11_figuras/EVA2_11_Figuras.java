/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_figuras;

/**
 *
 * @author 52614
 */
public class EVA2_11_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("________________________________________");
        Triangulo tri = new Triangulo();
        System.out.println("Area: " + tri.calcularArea());
        System.out.println("Perimetro: " + tri.calcularPerimetro());
        
                
    }
    
}
