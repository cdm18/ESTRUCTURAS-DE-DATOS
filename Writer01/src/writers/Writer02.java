/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
//import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Writer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
// Scanner entrada = new Scanner(System.in);

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