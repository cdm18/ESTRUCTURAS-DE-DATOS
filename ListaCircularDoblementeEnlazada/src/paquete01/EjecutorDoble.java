/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlos mejia
 */
public class EjecutorDoble {

    public static void main(String[] args) {
        ListaCircularDoblementeEnlazada lista
                = new ListaCircularDoblementeEnlazada();

        lista.insert(1);
        lista.insert(10);
        lista.insert(30);
        lista.insert(63);

        lista.printHead2Tail();

        System.out.println(lista.head); // la cabeza es 1 
        lista.delete(lista, 1);
        lista.printHead2Tail();

        System.out.println(lista.head.previous.data); // 63
        System.out.println(lista.tail.next.data); // 10
        
        
    }
}
