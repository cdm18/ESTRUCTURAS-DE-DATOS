/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9.ejercicio;

/**
 *
 * @author carlos M
 */
public class Ejecutor {

    public static void main(String[] args) {
        Nodo objA = new Nodo(8);
        System.out.println(objA);

        Nodo objB = new Nodo();
        // Nodo objB = new Nodo(4); 

        System.out.println(objB);

        // objA.next = objB; es lo mismo a lo de abajo
        objA.concatenarNext(objB);
        System.out.println("Next A: " + objA.next);

        Nodo objC = new Nodo(11);
        System.out.println(objC);
        
        objB.concatenarNext(objC);
        System.out.println("Next B: " + objB.next);
        System.out.println("Next C: " + objC.next);
        System.out.println("");
    }
}
