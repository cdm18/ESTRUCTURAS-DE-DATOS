/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

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
        this.max = max;
        this.cola = new int[max];

    }

    public int getTope() {
        return tope;
    }

    public void vaciarCola() {
        tope = -1;
    }

    public boolean colaLlena() {
        if (max - 1 == this.tope) { // return this.max - 1 == this.tope
            return true;
        } else {
            return false;
        }

    }

    public boolean colaVacia() {
        if (this.tope == -1) { // return this.tope == -1;
            return true;
        } else {
            return false;
        }
    }

    public void insertarCola(int cont) {
        if (this.colaLlena()) {
            System.out.println("Cola de autos llena");
        } else {
            int item = cont;

            this.tope++;
            this.cola[this.tope] = item;
            System.out.println("Ticket #" + item);

        }
    }

    public void EliminarCola() {
        if (this.colaVacia()) {
            System.out.println("Cola Vacía");
        } else {
            int ITEM = this.cola[0];
            System.out.println("Ticket " + ITEM + " atendido");
            if (this.tope == 0) {
                vaciarCola();
            } else {

                for (int i = 0; i < this.tope; i++) {
                    this.cola[i] = this.cola[i + 1];
                }
                this.tope--;
            }
            
        }
    }

    public void mostrarCola() {
        if (this.colaVacia()) {
            System.out.println("Cola de autos vacia, tome un ticket");
        } else {
            int i;
            String mostrar = "";

            for (i = 0; i <= this.tope; i++) {
                mostrar = mostrar + this.cola[i] + "\n";
            }
            System.out.println("Los tickets en cola son: \n" + mostrar);

        }
    }
}
