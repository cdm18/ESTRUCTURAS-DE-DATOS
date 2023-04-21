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

        try {
            File file = new File("Z:\\estudiantes.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado" + file.getName());

            } else {
                System.out.println("Ya existe ese archivo");
            }
        } catch (IOException e) {
            System.out.println("Error" + e);

        }
    }
}
