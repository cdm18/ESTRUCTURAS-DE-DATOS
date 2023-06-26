/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlos mejia
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
            System.out.println("Nodos de la lista enlazada doble circular:");
            do {
                System.out.printf("[%d] ",current.data);
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
    
    public ListaCircularDoblementeEnlazada delete(ListaCircularDoblementeEnlazada list, int key) {
        // key is the deleting number
        // Node currentNode = list.head, prev = null;

        NodeDoble currentNode = list.head;
        NodeDoble previous = null;

        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            tail.next = head;
            head.previous = tail;
            currentNode.next = null;
            currentNode = head;
            
            System.out.println(key + " (head) found and deleted");
            return list;

        }
        
        while (currentNode != null && currentNode.data != key) {
            previous = currentNode;
            currentNode = currentNode.next;
        }
        
        if (currentNode != null && currentNode == tail) {
            head.previous = tail;
            currentNode.next = head;
            
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
