/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_1_uml;

/**
 *
 * @author 52614
 */
public class Automovil {
    /*
    marca
    modelo
    año
    get y set
    imprimirDatos
    */
    private String marca;
    private String modelo;
    private int año;
    
    private String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    private String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    private int getAño(){
        return año;
    }
    public void setAño(int valor){
        año = valor;
    }
    public void imprimirDatos(){
        System.out.println("Marca: " + marca);  
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
