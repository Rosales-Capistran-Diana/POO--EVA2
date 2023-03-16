/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author 52614
 */
public class EVA2_9_Super_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Estudiante ");
        /*Estudiante estudiante = new Estudiante();
        estudiante.imprimirDatos();
        System.out.println("Numero de Control: " + estudiante.getNumControl());*/
        Estudiante estudiante = new Estudiante("22550310", "Diana", "Rosales", 19);
        estudiante.imprimirDatos();
        System.out.println(" ");

        System.out.println("Docente");
        /*Docentes docente = new Docentes();
        docente.imprimirDatos();
        System.out.println("Numero de plaza: " + docente.getPlaza());*/
        Docentes docente = new Docentes("2026", "Ruben", "Hernandez", 41);
        docente.imprimirDatos();
    }

}
