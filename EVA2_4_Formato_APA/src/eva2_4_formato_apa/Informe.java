/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author 52614
 */
public class Informe extends Datos_Generales {
    private String departamento;
    private String tipoInforme;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoInforme() {
        return tipoInforme;
    }

    public void setTipoInforme(String tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public Informe() {
    }

    public Informe(String departamento, String tipoInforme) {
        this.departamento = departamento;
        this.tipoInforme = tipoInforme;
    }
    
}
