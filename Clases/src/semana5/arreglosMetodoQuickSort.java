/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

/**
 *
 * @author SALA I
 */
public class arreglosMetodoQuickSort {
    
    public static void main(String[] args) {
        int miArray [] = {9,5,2,12,3,5,66,63};
        quickSort(miArray, 0, miArray.length-1);
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
        }
    }
    
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
