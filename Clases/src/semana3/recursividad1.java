/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author SALA I
 */
public class recursividad1 {

    public static void main(String[] args) {
        int n = 500000;
        int resultado = factorial(n);
        System.out.println("El factorial de " + n + " es " + resultado);

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }
    }

}
