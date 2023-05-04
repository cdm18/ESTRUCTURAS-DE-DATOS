/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package writers;

import java.io.IOException;
import java.io.*;

/**
 *
 * @author SALA I
 */
public class Writer03 {

//import java.util.Scanner;
    /**
     *
     * @author SALA I
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*       
        The difference between appending and writing 
        is that when you write to a file,
        you erase whatever was previously there
        whereas when you append to a file, you simply add the new information
        to the end of whatever text was already there.
        //.append ("hola"); diferencia es q puede encadenar
        */
        
        try (FileWriter myWriter = new FileWriter("Z:\\estudiantes.txt")) {
            myWriter.append("Sumarrr de escritura en archivo usando Write\n"); //.append ("hola");

            System.out.println("El archivo ha sido creado");
        } catch (IOException e) {
            System.out.println("Error de escritura");

        }
        System.out.println("Leemos archivo...");

        try (FileReader fr = new FileReader("Z:\\estudiantes.txt")) {
            int i = fr.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }

}
