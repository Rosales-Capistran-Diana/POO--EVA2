/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_has_a_direccion;

/**
 *
 * @author 52614
 */
public class EVA2_22_HAS_A_DIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Diana ");
        p.setApellido("Rosales Capistran");
        p.setEdad(19);

        /*
        Direccion direc = new Direccion();
        direc.setCalle("18a");
        direc.setColonia("Girasoles");
        direc.setNumero(2);
        direc.setCP("31376");
        direc.setCiudad("Chihuahua");
        direc.setEstado("Chihuahua");
         */
        
        p.imprimirDatos();

    }

}

class Direccion {

    private String calle;
    private String colonia;
    private String CP;
    private String ciudad;
    private String estado;
    private int numero;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Direccion() {
        this.calle = "___________";
        this.colonia = "___________";
        this.CP = "___________";
        this.ciudad = "___________";
        this.estado = "___________";
        this.numero = 0;
    }

    public Direccion(String calle, String colonia, String CP, String ciudad, String estado, int numero) {
        this.calle = calle;
        this.colonia = colonia;
        this.CP = CP;
        this.ciudad = ciudad;
        this.estado = estado;
        this.numero = numero;
    }

    public void imprimirDatos() {
        System.out.println("___________Direccion: ___________");
        System.out.println("Calle: " + calle + "Colonia" + colonia + "Numero: " + numero + "Codigo Postal: " + CP);
        System.out.println("Ciudad: " + ciudad + "Estado: " + estado);
    }
}

//______________________________________________________________________________

class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion; //Persona has-a (tiene-una) dirección 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Persona() {
        this.nombre = "___________";
        this.apellido = "___________";
        this.edad = 0;
        this.direccion = null; //Es null debido a que está vacío el campo de un objeto.
        // En este caso, significa que la dirección no existe.
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void imprimirDatos() {
        System.out.println("___________Persona: ___________");
        System.out.println("Nombre: " + nombre + "Apellidos: " + apellido + "Edad: " + edad + " años.");
        if (direccion == null) {
            System.out.println("No hay direccion.");
        } else {
            direccion.imprimirDatos();
        }

    }
}
