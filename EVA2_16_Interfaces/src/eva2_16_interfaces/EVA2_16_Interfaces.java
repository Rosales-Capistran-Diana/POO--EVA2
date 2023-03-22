/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author 52614
 */
public class EVA2_16_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Es incorrecto, ya que no se puede instanciar una interfaz
        Mostrar_Datos obj = new Mostrar_Datos();
         */

        Persona perso = new Persona("Diana Rosales", 19);
        perso.imprimirDatos();
        System.out.println("___________________________________________________");
        Computadora compu = new Computadora("HP", "Intel i7", 22000, "HP");
        compu.imprimirDatos();
    }

}
