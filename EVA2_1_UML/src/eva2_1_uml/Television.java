/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_1_uml;

/**
 *
 * @author 52614
 */
public class Television {

    /*
    canal
    volumen
    power
    get y set
    imprimirDatos
     */
    private int canal;
    private int volumen;
    private boolean power;

    private int getCanal() {
        return canal;
    }

    public void setCanal(int valor) {
        canal = valor;
    }

    private int getVolumen() {
        return volumen;
    }

    public void setVolumen(int valor) {
        volumen = valor;
    }

    private boolean getPower() {
        return power;
    }

    public void setPower(boolean valor) {
        power = valor;
    }

    public void imprimirDatos() {
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Power: " + power);
    }
}
