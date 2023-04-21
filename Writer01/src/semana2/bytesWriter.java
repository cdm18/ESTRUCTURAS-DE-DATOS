/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author SALA I
 */
public class bytesWriter {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
        
        try (FileOutputStream fos = new FileOutputStream("Z:\\estudiantes3.txt", true)) {
            String mensaje = "Hola, esto es un stream con bytes con FIS Y FOS\n"; //.append ("hola");
            byte datos [] = mensaje.getBytes();
            fos.write (datos);
            fos.close ();
            System.out.println("El archivo ha sido escrito");
        } catch (IOException e) {
            System.out.println("Error de escritura");

        }
        System.out.println("Leemos archivo...");

        try (FileInputStream fis = new FileInputStream("Z:\\estudiantes3.txt")) {
            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
            }
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }

}


