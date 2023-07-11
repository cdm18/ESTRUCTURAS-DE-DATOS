/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlos mejia
 */
public class EjecutorSimple {

    public static void main(String[] args) {
        ListaCircularSimplementeEnlazada lista
                = new ListaCircularSimplementeEnlazada();

        lista.add(1);
        lista.add(10);
        lista.add(30);
        lista.add(63);

        lista.print();
        System.out.println(lista.head);
        System.out.println(lista.head.next.data);

        System.out.println(lista.tail);
        System.out.println(lista.tail.next);

        System.out.println("\n");

        lista.delete(lista, 1);

        System.out.println(lista.head.next.data);

        lista.print();
        System.out.println(lista.tail);
        System.out.println(lista.tail.next);

        lista.print();

    }
}
