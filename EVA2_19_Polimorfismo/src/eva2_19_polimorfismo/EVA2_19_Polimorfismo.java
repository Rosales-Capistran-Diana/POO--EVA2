/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author 52614
 */
public class EVA2_19_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("22550310", "Diana", "Rosales", 19);
        //estudiante.imprimirDatos();

        System.out.println(" ");

        Docentes docente = new Docentes("2002", "Jose", "Garcia", 34);
        //docente.imprimirDatos();

        /*
           En resumen, polimorfismo es:
            Ocultamos propiedades
        
           Se asignan objetos de una clase a otra
        
         */
        
        System.out.println(" ");

        Persona persona = docente;
        persona.imprimirDatos();

        System.out.println(" ");
        Persona persona2 = estudiante;
        persona2.imprimirDatos();

        /* Ahora al revés:
        No se puede hacer las conversión de super clase a subclase
        Ya que en el siguiente ejemplo, NO existe la plaza
        
        Persona perso = new Persona();
        Docentes docente = perso;
         */
    }

}
