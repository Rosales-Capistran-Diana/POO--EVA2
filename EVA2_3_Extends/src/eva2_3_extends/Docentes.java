/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_extends;

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
    
    public Docentes() {
    }

    public Docentes(String plaza) {
        this.plaza = plaza;
    }
    
}
