/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA2_20_Polimorfismo_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Figura es padre de círculo
        Podemos asignar un objeto de círculo a una variable figura
        
        Circulo c = new Circulo(5);
        c.imprmirDatos();

        Figuras f = c;
        System.out.println("Usando figuras");
        System.out.println("Area: " + f.calcularArea());
        System.out.println("Perimetro: " + f.calcularPeri());
         
        int[] arreglo = new int[10]; //Arreglo que guarda 10 enteros
        
        
        Un arreglo donde inicia y dónde termina? 
        Primer posición -> 0
        Última posición -> N -1 (N -> Cantidad de elementos del arreglo
        
        
        arreglo[0] = 100;
        System.out.println(arreglo[0]);
         */
        System.out.println("¿Cuantas figuras necesitas?");
        Scanner input = new Scanner(System.in);
        int cant = input.nextInt();

        Figuras[] f = new Figuras[cant];
        for (int i = 0; i < f.length; i++) {
            System.out.println("¿Qué tipo de figura necesitas? 1 -> Circulo o 2 -> Triangulo");
            int tipo = input.nextInt();
            if (tipo == 1) {  //1 --> Circulo
                Circulo c = new Circulo();
                System.out.println("Introduce el radio que tendra: ");
                c.setRadio(input.nextDouble()); //Es para capturar el dato del usuario
                f[i] = c;
            } else { //Triangulo
                Triangulo t = new Triangulo();
                System.out.println("Introduce la altura que tendra: ");
                t.setBase(input.nextDouble()); //Es para capturar el dato del usuario
                f[i] = t;
                System.out.println("Introduce la altura que tendra: ");
                t.setAltura(input.nextDouble()); //Es para capturar el dato del usuario
                f[i] = t;
            }
        }
        //Imprimir los resultados:
        for (int i = 0; i < f.length; i++) {
            //Instanceof palabra reservada 
            if (f[i] instanceof Circulo) {
                System.out.println("Circulo: " + i);

                /*
                Casting --> Conversión
                Ejemplo:
                int val = (int)(Math.random() * 100)
                 */
                
                Circulo circ = (Circulo) f[i];
                circ.imprmirDatos();
            } else {
                System.out.println("Triangulo: " + i);
                Triangulo trian = (Triangulo) f[i];
                System.out.println("Figura: " + i);
            }
            /*
                System.out.println("Area: " + f[i].calcularArea());
            System.out.println("Perimetro: " + f[i].calcularPeri());
             */
        }

        /*Circulo[] circulos = new Circulo[cant];
        circulos[0] = new Circulo();
        circulos[0].imprmirDatos();

        for (int i = 0; i < cant; i++) {
            circulos[i] = new Circulo();
        }
        for (int i = 0; i < circulos.length; i++) {
            circulos[i].imprmirDatos();
            
        }*/
    }

}
