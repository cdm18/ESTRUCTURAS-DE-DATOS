package paquete01;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author carlos mejia
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opcion;
        String palabra;
        String corregir;
        String eliminar;
        String nueva;
        ListaDoblementeEnlazada listaP = new ListaDoblementeEnlazada();
        
        try{
            while (bandera) {
            
            
            System.out.println("------------------GESTOR DE ORACIONES WORD DOCX"
                    + "----------------------");
            System.out.println("1. Ingrese 1 para insertar palabras a la oracion"
                    + " (palabra por palabra)");
            System.out.println("2. Ingrese 2 si desea corregir una palabra");
            System.out.println("3. Ingrese 3 para eliminar una palabra "
                    + "completamente");
            System.out.println("4. Ingrese 4 para mostrar los resultados "
                    + "(oracion)");
            System.out.println("5. Ingrese 5 para salir del programa");

            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("->Ingrese su palabra: ");
                    palabra = sc.nextLine();
                    System.out.println("");

                    listaP.insertAfterTail(palabra);
                    System.out.println("Añadida correctamente!");
                    listaP.printHeadToTail();

                    break;

                case 2:
                    System.out.print("->Ingrese la palabra a corregir: ");
                    corregir = sc.nextLine();
                    System.out.print("->Ingrese la nueva palabra: ");
                    nueva = sc.nextLine();
                    System.out.println("");

                    listaP.correct(listaP, corregir, nueva);
                    listaP.printHeadToTail();
                    break;

                case 3:
                    System.out.print("->Ingrese la palabra a eliminar: ");
                    eliminar = sc.nextLine();
                    System.out.println("");

                    listaP.delete(listaP, eliminar);
                    listaP.printHeadToTail();
                    break;

                case 4:

                    listaP.printHeadToTail();

                    break;

                case 5:
                    System.out.println("Gracias! Vuelva pronto!");
                    bandera = false;
                    break;
                default:
                    System.err.println("Por favor ingrese una opcion correcta");
            }

        }
        }catch (InputMismatchException e){
            System.err.println("Por favor, ingrese un numero");
            
        }
        
        
        

    }

}
