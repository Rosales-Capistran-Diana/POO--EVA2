/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author 52614
 */
public class EVA2_3_Extends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante es = new Estudiante();
        es.setNombre("Diana");
        es.setApellido("Rosales");
        es.setEdad(19);
        es.setNumControl(22550310);
        System.out.println(es.getNombre());
        System.out.println(es.getApellido());
        System.out.println(es.getEdad());
        System.out.println(es.getNumControl());

        Docentes doce1 = new Docentes();
        doce1.setNombre("Luis");
        doce1.setApellido("Ramirez");
        doce1.setEdad(40);
        doce1.setPlaza("grb");
    }
}
