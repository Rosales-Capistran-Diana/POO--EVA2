/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author 52614
 */

/*
Clase derivada extends Clase base.
Clase hijo extends Clase padre.
Subclase extends Superclase.
 */
public class Estudiante extends Persona {

    private String numControl;

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public Estudiante() {
        super(); //Invocar al constructor de la SuperClase
        this.numControl = "______";

    }

    public Estudiante(String numControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.numControl = numControl;
    }

    //Remplaza el método imprimirDatos de al superclase
    @Override  // ->Indicación. Sobre-escribir
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Numero de control: " + numControl);
    }
}
