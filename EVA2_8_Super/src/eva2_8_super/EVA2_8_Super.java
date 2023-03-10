/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_super;

/**
 *
 * @author 52614
 */
public class EVA2_8_Super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("_____________Animal:_____________");
        Animal animal = new Animal(100);

        System.out.println("_____________Mamifero:_____________");
        Mamiferos mamifero = new Mamiferos("Negro", 50);
        
        System.out.println("_____________Perros:_____________");
        Perros perro = new Perros();
        //perro.
    }

}

class Animal {

    private int peso;

    public Animal() {
        System.out.println("Animal: Its alive!!");
    }

    public Animal(int peso) {
        this.peso = peso;
        System.out.println("Animal: Its alive!! : Constructor 2");
    }

    public void respirar() {
        System.out.println("Estoy respirando");
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}

class Mamiferos extends Animal {

    private String colorPelo;

    public Mamiferos() {

        /*
        el "super();" Es una llamada al constructor de la superclase.
        En nuestro caso llama a Animal()
        NOTAS:
        Si estamoas trabajando con herencia, siempre debemos de llamar al
        constructor de la superclase
         */
        super();
        System.out.println("Soy un mamifero");
    }

    public Mamiferos(String colorPelo, int peso) {
        super(peso); //Siempre llamamos al constructor de la superclase
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero : Constructor 2");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
}

class Perros extends Mamiferos {

    public Perros() {
        //Siempre hay que invocar al constructor de la superclase
        super();
        System.out.println("Soy Canela y son un perro");
    }
}
