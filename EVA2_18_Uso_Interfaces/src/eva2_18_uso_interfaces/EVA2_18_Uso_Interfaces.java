/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author 52614
 */
public class EVA2_18_Uso_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Las interfaces no permiten crear un  objeto, por ejemplo:
        
        Figuras fig= new Figuras();
        MostrarDatos datos = new MostrarDatos();
        
        */

        Circulo c = new Circulo();
        c.setRadio(50);
        c.imprmirDatos();

        Triangulo t = new Triangulo(20, 20);
        t.imprmirDatos();
    }

}
