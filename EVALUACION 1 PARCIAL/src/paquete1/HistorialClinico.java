/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

//import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author Carlos Mejia
 */
public class HistorialClinico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        try ( FileWriter fw = new FileWriter("Z:\\historial_clinico.txt", true)) {
            System.out.print("Ingrese la cantidad de pacientes a ingresar: ");
            int pacientes = sc.nextInt();

            sc.nextLine();

            int contador = 0;
            String mensaje = "";
            while (contador < pacientes) {
                System.out.println();
                System.out.println("-------HISTORIAL CLINICO -----");

                System.out.println("Ingrese su cedula de identidad");
                String cedula = sc.nextLine();

                System.out.println("Ingrese sus apellidos completos");
                String apellidos = sc.nextLine();

                System.out.println("Ingrese sus nombres completos");
                String nombres = sc.nextLine();

                System.out.println("Ingrese su fecha de nacimiento "
                        + "(dia del mes del año)");
                String nacer = sc.nextLine();

                System.out.println("Ingrese sus alergias/molestias medicas"
                        + " (separadas por comas)");
                String alergias = sc.nextLine();

                System.out.println("Ingrese su estatura (en metros)");
                double estatura = sc.nextDouble();

                System.out.println("Ingrese su peso (en kilogramos)");
                double peso = sc.nextDouble();

                mensaje = String.format("%s\n      Datos del paciente\n"
                        + "Cedula de identidad: %s\n"
                        + "Apellidos: %s\n"
                        + "Nombres: %s\n"
                        + "Fecha de nacimiento: %s\n"
                        + "Alergias: %s\n"
                        + "Estatura (metros): %.2f m\n"
                        + "Peso: %.2f kg\n\n", mensaje, cedula, apellidos,
                        nombres, nacer, alergias, estatura, peso);

                fw.write(mensaje);
                System.out.println("Historial escrito");

                sc.nextLine();
                contador++;

            }
            fw.close();

        } catch (IOException e) {
            System.out.println("Error" + e);

        }
        try ( FileReader fr = new FileReader("Z:\\historial_clinico.txt")) {
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
