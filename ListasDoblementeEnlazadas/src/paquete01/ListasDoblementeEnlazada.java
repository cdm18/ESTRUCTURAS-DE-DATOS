/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlos mejia
 */
public class ListasDoblementeEnlazada {
    // nodo para lista doblemente enlazada

    class Node {

        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    // Cabeza y cola        
    // Node head, tail = null;
    Node head = null;
    Node tail = null;

    public void insertAfterTail(int data) {
        Node newNode = new Node(data);
        // insertar despues de la cola;
        // Si la lista esta vacia
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else { // el nuevo nodo debe ser añadido luego de tail
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;

        }

        // if queda igual para insertar antes de la cabeza
        /*
        
        else {
                head.previous = newNode;
                newNode.next = head;
                head = newNode;
                head.previous = null;
                }
        
         */
    }

    public void insertBeforeHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            head.previous = null;
        }

    }

    public void printHeadToTail() {

        // currentNode apunta a head;
        Node currentNode = head;

        if (head == null) {
            System.out.println("Lista vacia, sin elementos");
        } else {
            System.out.println("Nodos doblemente enlazados exitosamente de la"
                    + " cabeza hacia la cola");
            while (currentNode != null) {
                System.out.printf("[%d] ", currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println("");

        }

    }

    public void printTailToHead() {

        // currentNode apunta a head;
        Node currentNode = tail;

        if (head == null) {
            System.out.println("Lista vacia, sin elementos");
        } else {
            System.out.println("Nodos doblemente enlazados exitosamente desde "
                    + "la cola hacia la cabeza");
            while (currentNode != null) {
                System.out.printf("[%d] ", currentNode.data);
                currentNode = currentNode.previous;

            }

        }

    }

    public ListasDoblementeEnlazada delete(ListasDoblementeEnlazada list, int key) {
        // key is the deleting number
        // Node currentNode = list.head, prev = null;

        Node currentNode = list.head;
        Node previous = null;

        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            head.previous = null;
            currentNode.next = null;
                   

            System.out.println(key + " (head) found and deleted");
            return list;

        }
        
        while (currentNode != null && currentNode.data != key) {
            previous = currentNode;
            currentNode = currentNode.next;
        }
        
        if (currentNode != null && currentNode == tail) {
            tail = previous;
            tail.next = null;
            currentNode.previous = null;
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
    ///////////////////////////////////////////////////////////////

}

// EXAMEN LISTAS ENLAZADAS
/*
    Inicializacion o creacion
    Insertar elementos
    Mostrarlos/imprimir elementos
    Buscar
    Recorrer
    Eliminar
    Comprobar si esta vacia

 */
