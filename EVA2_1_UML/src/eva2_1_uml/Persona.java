/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_1_uml;

/**
 *
 * @author 52614
 */
public class Persona {

    /*
    id
    nombre
    edad
    get y set
    imprimirDatos
    
     */
    private int id;
    private String nombre;
    private int edad;

    private int getId() {
        return id;
    }

    public void setId(int valor) {
        id = valor;
    }

    private String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    private int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
