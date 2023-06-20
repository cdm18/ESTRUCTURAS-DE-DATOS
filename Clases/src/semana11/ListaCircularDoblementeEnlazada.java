/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11;

/**
 *
 * @author SALA I
 */
public class ListaCircularDoblementeEnlazada {

    // Cada nodo tiene dos referencias
    // El ultimo nodo de la lista tiene referencia al primer nodo
    // y el primer nodo tiene referencia al ultimo, formando un ciclo
    public NodeDoble head = null;
    public NodeDoble tail = null;

    public void insert(int data) {
        NodeDoble newNode = new NodeDoble(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.previous = tail;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = head;
            head.previous = tail;
        }

    }

    public void printHead2Tail() {
        NodeDoble current = head;
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Nodos de la lista enlazada circular:");
            do {
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println("");

        }

    }

    public void printTail2Head() {
        NodeDoble current = tail;
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Nodos de la lista enlazada circular:");
            do {
                System.out.print(" " + current.data);
                current = current.previous;
            } while (current != tail);
            System.out.println("");

        }

    }

}
