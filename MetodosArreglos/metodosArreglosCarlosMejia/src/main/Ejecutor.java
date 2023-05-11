/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import metodos.Metodos;
import java.io.*;

/**
 *
 * @author carlo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {
        // TODO code application logic here

        boolean bandera = true;
        int[] arreglo = null;
        do {

            try {
                while (bandera) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("---------INGRESE LA ACCION DESEADA EN SU ARREGLO"
                            + "---------");
                    System.out.println("                 (seleccione un numero)         "
                            + "         ");

                    System.out.println("         1. Crear un arreglo\n"
                            + "         2. Ingresar/insertar datos en el arreglo\n"
                            + "         3. Presentar datos en el arreglo\n"
                            + "         4. Búsqueda de un elemento\n"
                            + "         5. Eliminación de un elemento\n"
                            + "         6. Ordenamiento burbuja\n"
                            + "         7. Ordenamiento QuickSort\n"
                            + "         8. Salir\n");
                    System.out.println("-----------------↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓-------------"
                            + "---------");
                    int seleccion = sc.nextInt();

                    if (seleccion == 1) {
                        arreglo = Metodos.crear();
                        System.out.println("Arreglo creado exitosamente!");

                    }
                    if (seleccion == 2) {

                        if (arreglo == null) {
                            throw new NullPointerException();
                        } else {
                            arreglo = Metodos.escribirDatos(arreglo);
                            System.out.println("Datos escritos correctamente!");
                        }

                    }
                    if (seleccion == 3) {

                        if (arreglo == null) {
                            throw new NullPointerException();
                        } else {

                            Metodos.imprimir(arreglo);

                        }

                    }
                    if (seleccion == 4) {
                        if (arreglo == null) {
                            throw new NullPointerException();
                        } else {

                            System.out.println("Seleccione el numero a buscar");
                            int index = sc.nextInt();
                            Metodos.busqueda(arreglo, index);

                        }

                    }
                    if (seleccion == 5) {
                        if (arreglo == null) {
                            throw new NullPointerException();
                        } else {
                            System.out.println("Ingrese el numero a eliminar");
                            int index = sc.nextInt();
                            Metodos.eliminar(arreglo, index);

                        }

                    }
                    if (seleccion == 6) {
                        if (arreglo == null) {
                            throw new NullPointerException();
                        } else {
                            int[] orden = Metodos.burbuja(arreglo);
                            System.out.println("Su arreglo de forma ordenada"
                                    + " (metodo burbuja)"
                                    + " es:");
                            for (int i = 0; i < orden.length; i++) {
                                System.out.printf("%d ", orden[i]);
                            }
                            System.out.println("");
                        }

                    }
                    if (seleccion == 7) {

                        if (arreglo == null) {
                            throw new NullPointerException();
                        } else {
                            Metodos.quickSort(arreglo, 0, arreglo.length - 1);
                            System.out.println("Su arreglo de forma ordenada "
                                    + "(metodo quicksort)"
                                    + " es:");
                            for (int i = 0; i < arreglo.length; i++) {
                                System.out.printf("%d ", arreglo[i]);

                            }
                            System.out.println("");

                        }

                    }
                    if (seleccion == 8) {
                        System.out.println("Esta seguro que desea salir? Si es asi"
                                + ", vuelva a presionar 8");
                        int end = sc.nextInt();

                        if (end == 8) {
                            bandera = false;

                        }
                    }

                }
            } catch (NullPointerException e) {
                System.out.println("Error " + e + " = Arreglo no creado o vacio");
                System.out.println("------------------INTENTE DE NUEVO-------------"
                        + "----------");
                System.out.println("");

            } catch (NegativeArraySizeException a) {
                System.out.println("Error " + a + " = Arreglo vacio o no creado");
            }

        } while (bandera);

    }

}
