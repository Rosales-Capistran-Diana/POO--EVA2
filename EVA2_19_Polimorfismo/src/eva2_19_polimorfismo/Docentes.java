/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author 52614
 */
/*
Clase derivada extends Clase base.
Clase hijo extends Clase padre.
Subclase extends Superclase.
*/
public class Docentes extends Persona{
  private String plaza;  


    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    


    public Docentes(String plaza) {
        this.plaza = plaza;
    }
    public Docentes() {
        super();
        this.plaza = "______";
    }

    public Docentes(String plaza, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
  @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Plaza: " + plaza);
    }
}
