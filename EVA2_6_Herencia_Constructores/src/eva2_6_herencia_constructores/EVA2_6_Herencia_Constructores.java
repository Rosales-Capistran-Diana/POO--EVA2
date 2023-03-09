/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_herencia_constructores;

/**
 *
 * @author 52614
 */
public class EVA2_6_Herencia_Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("____ Clase Animal: ____");
        Animal animal = new Animal();
        animal.respirar();
        animal.comer();
        
        
        System.out.println("____ Clase mamifero: ____");
        Mamifero mamifero = new Mamifero();
        /*
        mamifero.respirar();
        mamifero.comer();
        mamifero.tenerPelo();
        */
    }
    
}
