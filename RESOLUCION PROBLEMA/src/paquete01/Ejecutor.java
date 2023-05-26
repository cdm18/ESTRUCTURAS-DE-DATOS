/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        int ticket;

        boolean bandera = true;
        Cola cola1 = new Cola(10);

               
        while (bandera) {
            System.out.println("--------------------------------------------");

            
    
            System.out.println("           BIENVENIDO A MCDONALDS           ");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Obtenga su ticket");
            System.out.println("2. Mostrar tickets");
            System.out.println("3. Marcar como cliente atendido");
            System.out.println("4. Salir del menu");
            
            
            ticket = sc.nextInt();
            if (ticket == 1) {           
                cola1.insertarCola(contador);
                contador++;
               
            }

            if (ticket == 2) {
                cola1.mostrarCola();
            }

            if (ticket == 3) {  
                cola1.EliminarCola();

            }

            
            if (ticket == 4) {
                bandera = false;
            }
            
            if (ticket != 1 || ticket != 2 || ticket != 3 || ticket != 4 ||
                    ticket != 5 ) {
                System.out.println("Ingrese una opcion valida");
            }
            
           
        }

    }

}
