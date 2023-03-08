/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author 52614
 */
public class Sitio_Web extends Datos_Generales{
    private String URL;
    private String colaboradores;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(String colaboradores) {
        this.colaboradores = colaboradores;
    }

    public Sitio_Web() {
    }

    public Sitio_Web(String URL, String colaboradores) {
        this.URL = URL;
        this.colaboradores = colaboradores;
    }
    
    
}
