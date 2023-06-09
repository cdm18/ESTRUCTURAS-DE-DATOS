/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9.taller;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas va a ingresar");
        int numero = sc.nextInt();

        Persona[] arregloP = new Persona[numero];
        sc.nextLine();
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese la cedula de ID");
            String cedula = sc.nextLine();

            System.out.println("Ingrese el tipo de persona (estudiante, "
                    + "administrativo o docente)");
            String tipo = sc.nextLine();

            arregloP[i] = new Persona(cedula, tipo);

        }
        System.out.println("");
        System.out.println("Las memorias de cada persona son: \n");

        for (int i = 0; i < arregloP.length; i++) {
            System.out.println(arregloP[i] + "\n");

        }

        System.out.println("\nLos datos de cada persona son: \n");

        for (int i = 0; i < arregloP.length; i++) {
            arregloP[i].mostrarDatos();
        }

        System.out.println("\nLos nodos (amigos relacionados) concatenados son: \n");
        
        for (int i = 0; i < arregloP.length-1; i++) {
            arregloP[i].concatenarNext(arregloP [i+1]);
        }
        
        for (int i = 0; i < arregloP.length; i++) {
            arregloP[i].mostrarDatos();
        }
        
        
    }
}
