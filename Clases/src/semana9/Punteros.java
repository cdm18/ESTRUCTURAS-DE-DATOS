/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9;

/**
 *
 * @author Carlos Mejia
 */
// Estructuras dinamicas
// punteros = variables que guardan direccion en memoria
public class Punteros {

    public static void main(String[] args) {
        Persona personaA;
        Persona personaB;

        personaA = new Persona("Carlos", 22);
        personaB = new Persona("Ana", 32);

        System.out.println("personaA: " + personaA + "\n");
        System.out.println("personaB: " + personaB + "\n");

        Persona personaC;

        personaC = new Persona("Kevin", 19);
        System.out.println("personaC: " + personaC + "\n");

        personaC = personaA;

        System.out.println("personaC: " + personaC + "\n");
        
        personaA.cambiarDatos("Doris", 10);
        personaA.mostrarDatos();
        
    }

}
