/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_tienda;

import Productos.Computadora;
import Productos.Jeans;

/**
 *
 * @author 52614
 */
public class EVA2_14_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu = new Computadora();
        compu.precioVenta(0);

        Jeans jean = new Jeans();
        jean.precioVenta(6);
    }

}
