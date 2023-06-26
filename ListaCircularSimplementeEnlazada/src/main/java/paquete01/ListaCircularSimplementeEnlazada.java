/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlos mejia
 */
public class ListaCircularSimplementeEnlazada {

    // variante de lista enlazada, en que el ultimo nodo 
    // tiene una referencia que apunta al primer nodo en vez de ser nula
    public NodeSimple head = null;
    public NodeSimple tail = null;

    public void add(int data) {
        NodeSimple newNode = new NodeSimple(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

    }

    public void print() {
        NodeSimple current = head;
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Nodos de la lista enlazada circular:");
            do {
                System.out.printf("[%d] ", current.data);
                current = current.next;
            } while (current != head);
            System.out.println("");

        }

    }

    // borrar un numero (modificar el de abajo)
    public ListaCircularSimplementeEnlazada delete(ListaCircularSimplementeEnlazada list, int key) {
        // key is the deleting number
        // Node currentNode = list.head, prev = null;

        NodeSimple currentNode = list.head;
        NodeSimple previous = null;

        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            currentNode.next = null;
            tail.next = head;
            
            System.out.println(key + " (head) found and deleted");
            return list;

        }

        while (currentNode != null && currentNode.data != key) {
            previous = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null && currentNode == tail) {
            previous.next = head;

            tail = previous;

            currentNode.next = null;

            System.out.println(key + " (tail) found and deleted");
            return list;

        }

        if (currentNode != null) {
            previous.next = currentNode.next;
            System.out.println(key + " found and deleted");
        }

        if (currentNode == null) {
            System.out.println(key + " not found");
        }

        return list;
    }

}
