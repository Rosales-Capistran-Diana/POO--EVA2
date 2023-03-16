/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_override;

/**
 *
 * @author 52614
 */
public class EVA2_10_Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona2 = new Persona("Diana", 19);
        System.out.println(persona);
        System.out.println(persona2);
    }
}

class Persona {

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "_____________________";
        this.edad = -1;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        String cade = "__________Datos:__________ \n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad;
        return cade;
    }
}
