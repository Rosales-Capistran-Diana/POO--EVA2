/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author 52614
 */
public class EVA2_21_Polimorfismo_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Automovil auto = new Automovil("Volskwagen", 2000, "Vocho", 0);
      modificarVel(auto,50);
      Bicicleta bici1 = new Bicicleta("Montaña", "Apache", 0);
      modificarVel(bici1,10);
      
    }
public static void modificarVel(ControlarDatos datos, int vel){
datos.CambiarVelocidad(vel);
datos.tablero();
}
}


//______________________________________________________________________________
class vehiculo {

    private String marca;
    protected int velocidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public vehiculo() {
        this.marca = " ";
        this.velocidad = 0;
    }

    public vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

}
//______________________________________________________________________________

interface ControlarDatos {

    void CambiarVelocidad(int cambio);

    public abstract void tablero();
}

//______________________________________________________________________________
class Automovil extends vehiculo implements ControlarDatos {

    private String modelo;
    private int año;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Automovil() {
        super();
        this.modelo = " ";
        this.año = 0;
    }

    public Automovil(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    @Override
    public void CambiarVelocidad(int cambio) {
        int vel = velocidad + cambio;
        if (vel >= 0) {
            velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("_____________________Automovil_____________________");
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Combustible: pendiente");
        System.out.println("Revoluciones: pendiente");
    }

}

//______________________________________________________________________________
class Bicicleta extends vehiculo implements ControlarDatos {

    private String Tipo;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Bicicleta(String Tipo, String marca, int velocidad) {
        super(marca, velocidad);
        this.Tipo = Tipo;
    }

    public Bicicleta() {
        super();
        this.Tipo = " ";
    }

    @Override
    public void CambiarVelocidad(int cambio) {
        int vel = velocidad + cambio;
        if (vel >= 0) {
            velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("_____________________Bicicleta_____________________");
        System.out.println("Velocidad: " + velocidad);
    }

}
