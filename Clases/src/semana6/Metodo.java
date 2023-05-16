/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

import java.util.Scanner;

/**
 *
 * @author CARLOS MEJIA 
 */
public class Metodo {

    public static int[][] leer2D() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese el orden de la matriz (dimension)");
            int orden = sc.nextInt();

            int matriz[][] = new int[orden][orden];
            int contador = 1;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Ingrese el " + contador + " numero");
                    matriz[i][j] = sc.nextInt();
                    contador++;
                }
            }

            return matriz;

        } catch (Error e) {
            System.out.println("Error de datos");
        } finally {
            sc.close();
        }
        return null;

    }

    public static void numeroMayor(int[][] matriz) {

        System.out.println("");
        int mayor = matriz[0][0];
        
        int pos = 0;
        int pos2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    pos = i;
                    pos2 = j;
                    
                }
            }
        }
        System.out.printf("El numero mayor es %d y se halla"
                    + " en la fila [%d] y columna [%d]", mayor, pos ,pos2);
    }

    public static void presentar2D(int[][] matriz) {
        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);

            }
            System.out.println(" ");

        }

    }

}
