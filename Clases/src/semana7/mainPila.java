/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class mainPila {

    public static void main(String[] args) {
        Pila pila1 = new Pila(4);
        pila1.insertarPila();

        // insertar datos de la pila
        // se hace asi porque no hay un ciclo en el metodo
        pila1.insertarPila();
        pila1.insertarPila();


        // mostrar pila     
        pila1.mostrarPila();

        pila1.eliminarPila();
        
        // mostrar pila        
        pila1.mostrarPila();

    }

}
