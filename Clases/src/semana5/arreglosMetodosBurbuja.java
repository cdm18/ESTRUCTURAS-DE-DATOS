/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

/**
 *
 * @author SALA I
 */
public class arreglosMetodosBurbuja {
    // Algoritmo burbuja

    public static void main(String[] args) {

        int miArray[] = {2, 4, 5, 21, 5, 6};
        int orden [] = burbuja (miArray);
        for (int i = 0; i < orden.length; i++) {
            System.out.printf(" %d ", orden[i]);
        }
        
        
        // for (int elemento : miArray){
        //  System.out.println (elemento);  }
        
    }

    public static int[] burbuja(int[] array) {
        int aux;
        int orden[];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }

            }
        }
        orden = array;
        return orden;
    }

    
    
    
    
   
}
