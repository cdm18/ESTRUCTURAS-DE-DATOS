/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlos mejia
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        ListasDoblementeEnlazada dobleLista = new ListasDoblementeEnlazada();
        ListasDoblementeEnlazada dobleLista2 = new ListasDoblementeEnlazada();
        /*
        
        dobleLista.insertAfterTail(5);
        dobleLista.insertAfterTail(2);
        dobleLista.insertAfterTail(3);
        dobleLista.insertAfterTail(14);
        dobleLista.insertAfterTail(1);
        
       
        
      
         */
        // antes de la cabeza
        dobleLista.insertAfterTail(5);
        dobleLista.insertAfterTail(2);
        dobleLista.insertAfterTail(3);
        dobleLista.insertAfterTail(14);
        dobleLista.insertAfterTail(1);
        

        dobleLista.printHeadToTail();

        dobleLista.delete(dobleLista, 5);
        
        System.out.println(dobleLista.head.previous.data); // null porque
                                                     // el anterior se corto 
    }
}
