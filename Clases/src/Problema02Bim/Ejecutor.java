/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02Bim;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        Turno lista = new Turno();
        int opcion;
        String cedula;
        Scanner sc = new Scanner(System.in);
        int ticket = 1;
        boolean bandera = true;

        while (bandera) {
            try {
                System.out.println("--------------CAMPAÑA DE DONACION DE SANGRE-------------");
                System.out.println("1. Por favor presione 1 para obtener un ticket");
                System.out.println("2. Por favor presione 2 para marcar como atendido");
                System.out.println("3. Por favor presione 3 para mostrar los ticket/s actuales");
                System.out.println("4. Por favor presione 4 para salir de la lista/cola");
                System.out.println("5. Por favor presione 5 para salir del programa");

                System.out.printf(">");
                opcion = sc.nextInt();

                sc.nextLine();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese por favor su cedula");
                        System.out.printf(">");
                        cedula = sc.nextLine();
                        
                        lista.insertar(lista, cedula, ticket);
                        
                        System.out.println("Ticket asignado correctamente!");
                        
                        System.out.println("Su ticket es el #" + ticket);
                        ticket++;
                    }
                    case 2 -> {
                        System.out.println("Ticket #" + lista.head.data + " atendido");
                        lista.delete(lista, lista.head.data);
                    }
                    case 3 -> lista.print(lista);
                    case 4 -> {
                        System.out.println("Ingrese el numero de ticket a eliminar");
                        System.out.printf(">");
                        
                        int key = sc.nextInt();
                        
                        lista.delete(lista, key);
                    }
                    case 5 -> {
                        System.out.println("Gracias por donar!");
                        bandera = false;
                    }
                    default -> System.out.println("Ingrese una opcion valida");
                }
            } catch (NullPointerException e) {
                System.out.println("Lista/cola de tickets vacia");
            }

        }

    }
}
