/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        ListasDoblementeEnlazada dobleLista = new ListasDoblementeEnlazada();

        /*
        
        dobleLista.insertAfterTail(5);
        dobleLista.insertAfterTail(2);
        dobleLista.insertAfterTail(3);
        dobleLista.insertAfterTail(14);
        dobleLista.insertAfterTail(1);
        
      
         */
        
        dobleLista.insertBeforeHead(5);
        dobleLista.insertBeforeHead(2);
        dobleLista.insertBeforeHead(3);
        dobleLista.insertBeforeHead(14);
        dobleLista.insertBeforeHead(1);

        dobleLista.printHeadToTail();

        dobleLista.printTailToHead();

    }
}
