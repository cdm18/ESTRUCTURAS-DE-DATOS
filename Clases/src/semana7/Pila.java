/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

import java.util.Stack;//
import java.util.Queue;//
import java.util.Scanner;

/**
 *
 * @author cdm124 ARREGLOS CON PILAS Y COLAS
 *
 *
 */
public class Pila {

    int[] pila;
    int tope;
    int max;

    Scanner sc = new Scanner(System.in);

    public Pila(int max) {
        this.tope = -1;
        this.tope = max;
        this.pila = new int[this.max];

    }

    public int getTope() {
        return this.tope;
    }

    public void vaciarPila() {
        this.tope = -1;
    }

    public boolean pilaLlena() {
        if (this.max - 1 == this.tope) { // return this.max - 1 == this.tope
            return true;
        } else {
            return false;
        }

    }
    public boolean pilaVacia(){
        if (this.tope == -1) { // return this.tope == -1;
            return true;
        } else {
            return false;
        }
    }
    
    public void insertarPila (){
        if (this.pilaLlena()) {
            System.out.println("Pila llena");
        }else{
            int item;
            System.out.println("Ingrese item a insertar");
            item = sc.nextInt();
            
            this.tope++;
            this.pila[this.tope] = item;
            System.out.println("El item " + item + " se ha insertado");
            
        }
    }
    
    public void eliminarPila (){
        if (this.pilaVacia()) {
            System.out.println("Pila vacia");
        }else{
            int item = this.pila[this.tope];
            this.tope--;
            
            System.out.println("El item " + item + " se ha eliminado");
        }
        
    }
    
    
    /*public void imprimirPila(){
        // Hasta max
  
    }
    */
  
    public void mostrarPila(){
        if (this.pilaVacia()) {
            System.out.println("La pila esta vacia y no hay datos a mostrar");
        }else{
            int i;
            String mostrar = "";
            
            for (i = 0; i  <= this.tope; i++) {
                mostrar = mostrar + this.pila[i] + "\n";
            }
            System.out.println("Los datos de la pila son: \n" + mostrar);
            
        } 
    }

}
