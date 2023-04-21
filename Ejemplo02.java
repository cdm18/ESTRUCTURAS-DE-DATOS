/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo02;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
// Scanner entrada = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("Z:\\estudiantes.txt", true)) {
            fw.write("Ejemplo de escritura con filewriter\n");
            fw.close();
            System.out.println("Archivo escrito");

        } catch (IOException e) {
            System.out.println("Error" + e);

        }
        System.out.println("Leemos el archivo");
        try (FileReader fr = new FileReader("Z:\\estudiantes.txt")) {
            int i = fr.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
        } catch (IOException e) {
            System.out.println("Error" + e);
        }

    }

}
