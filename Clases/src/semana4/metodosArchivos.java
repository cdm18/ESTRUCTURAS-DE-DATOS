/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class metodosArchivos {
    Scanner sc = new Scanner (System.in);
    public void leerArreglo(int arr []) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nDato ["+ i + "]: ");
            arr[i] = sc.nextInt();
        }
    }
}
