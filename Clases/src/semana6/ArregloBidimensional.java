/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

import static semana6.Metodo.*;

/**
 *
 * @author SALA I
 */
public class ArregloBidimensional {

    public static void main(String[] args) {
        /*
        
        int[][] matriz = {{4, 12, 3},
        {5, 2, 9}};

         */

       // int[][] matriz = {};
        
        
        int [][] matriz = leer2D();
        presentar2D(matriz);
        numeroMayor(matriz);
    }

}
