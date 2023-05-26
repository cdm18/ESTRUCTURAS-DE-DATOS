/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;
// import java.util.Queue;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Cola {

    int[] cola;
    int tope;
    int max;

    Scanner sc = new Scanner(System.in);

    public Cola(int max) {
        this.tope = -1;
        this.tope = max;
        this.cola = new int[this.max];

    }

    public int getTope() {
        return this.tope;
    }

    public void vaciarCola() {
        this.tope = -1;
    }

    public boolean colaLlena() {
        if (this.max - 1 == this.tope) { // return this.max - 1 == this.tope
            return true;
        } else {
            return false;
        }

    }
    public boolean colaVacia(){
        if (this.tope == -1) { // return this.tope == -1;
            return true;
        } else {
            return false;
        }
    }
    
    public void insertarCola (){
        if (this.colaLlena()) {
            System.out.println("Pila llena");
        }else{
            int item;
            System.out.println("Ingrese item a insertar");
            item = sc.nextInt();
            
            this.tope++;
            this.cola[this.tope] = item;
            System.out.println("El item " + item + " se ha insertado");
            
        }
    }
    
    public void EliminarCola()
    {
        if(this.colaVacia())
        {
            System.out.println("Pila Vacía");
        }
        else
        {
            int ITEM = this.cola[0];
            System.out.println("El item " + ITEM + " se ha eliminado");
            if (this.tope==0) {
                vaciarCola();
            }
            else {
                
            for( int i= 0; i<this.tope; i++){
               this.cola[i]= this.cola[i+1];  
            }
            }
            this.tope--;  
                     
        }        
    }
    
    
    /*public void imprimirPila(){
        // Hasta max
  
    }
    */
  
    public void mostrarPila(){
        if (this.colaVacia()) {
            System.out.println("La pila esta vacia y no hay datos a mostrar");
        }else{
            int i;
            String mostrar = "";
            
            for (i = 0; i  <= this.tope; i++) {
                mostrar = mostrar + this.cola[i] + "\n";
            }
            System.out.println("Los datos de la pila son: \n" + mostrar);
            
        } 
    }

}

