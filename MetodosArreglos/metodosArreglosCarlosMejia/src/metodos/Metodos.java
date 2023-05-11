/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Metodos {

    static Scanner sc = new Scanner(System.in);

    public static int[] crear() {
        System.out.println("Ingrese las dimensiones ( # elementos) del arreglo");
        int dimension = sc.nextInt();

        int[] arreglo = new int[dimension];

        return arreglo;
    }

    public static int[] escribirDatos(int [] arreglo) {
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un numero: ");
            arreglo[i] = sc.nextInt();
        }

        return arreglo;
    }

    public static void imprimir(int[] arreglo ) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println("");
    }

    public static int busqueda(int[] arreglo, int index) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == index) {
                System.out.printf("El numero %d se encuentra en la"
                        + " posicion [%d] del arreglo\n",arreglo [i] , i);
                return i;
            }

        }
        System.out.println("El elemento no existe");
        return -1;
    }

    public static void eliminar(int[] arreglo, int index) {
        int pos = index;
        if (pos != -1) {
            for (int i = pos; i < arreglo.length - 1; i++) {
                i = arreglo[i + 1];
            }
            arreglo[arreglo.length - 1] = 0;
            System.out.println("El elemento fue eliminado");
        } else {
            System.out.println("El elemento no existe");
        }
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
    
    
    
    
    // ------------------------------------------------------
    
    public static void quickSort (int arr [], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition (arr, begin, end);
            quickSort (arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
        
    }
    
    private static int partition (int arr [], int begin, int end){
        int pivot = arr [end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
             if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr [i] = arr [j];
                arr [j] = swapTemp;
            }
        }
        int swapTemp = arr [i + 1];
        arr [i + 1] = arr [end];
        arr [end] = swapTemp;
        return i+1;
    }
    
    
    

}
