/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_interfaces_2;

/**
 *
 * @author 52614
 */
public class EVA2_17_Interfaces_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface IntA{
    void A(); //Equivale a public abstract void A();
}

interface IntB{
    public abstract void B(); //Equivale a void B();
}
interface IntC extends IntA, IntB{
    public abstract void C(); //Equivale a void C();
}

class Prueba implements IntC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
    }
    
}