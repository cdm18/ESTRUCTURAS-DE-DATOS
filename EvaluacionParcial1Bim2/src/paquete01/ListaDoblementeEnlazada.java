/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author carlos mejia
 */
public class ListaDoblementeEnlazada {

    // nodo para lista doblemente enlazada
    class Node {

        String data;
        Node previous;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;

    public void insertAfterTail(String data) {
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

    }

    public void printHeadToTail() {

        // currentNode apunta a head;
        Node currentNode = head;

        if (head == null) {
            System.out.println("Lista de palabras vacia (sin palabras)");
        } else {
            System.out.println("Su oracion formada es:");
            while (currentNode != null) {
                if (currentNode.data.equals(".")) {
                    System.out.printf("%s",currentNode.data);
                    currentNode = currentNode.next;
                }else{
                System.out.printf("%s ", currentNode.data);
                currentNode = currentNode.next;
                }
                
            }
            System.out.println("");

        }

    }

    public ListaDoblementeEnlazada correct(ListaDoblementeEnlazada list,
            String key, String nueva) {
        Node currentNode = list.head;
        Node previous = null;

        if (currentNode != null && currentNode.data.equals(key)) {
            list.head.data = nueva;

            System.out.println("La palabra" + key + " (head) modificada "
                    + "correctamente por [" + nueva + "]");
            return list;

        }

        while (currentNode != null && !currentNode.data.equals(key)) {
            previous = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null && currentNode == tail) {
            tail.data = nueva;

            System.out.println("La palabra [" + key + "] (tail) se ha modificado"
                    + " correctamente por [" + nueva + "]");
            return list;

        }

        if (currentNode != null) {
            previous.next.data = nueva;
            System.out.println("La palabra [" + key + "] se ha modificado"
                    + " correctamente por [" + nueva + "]");
        }

        if (currentNode == null) {
            System.out.println("La palabra [" + key + "] no se ha encontrado");
        }

        return list;

    }

    public ListaDoblementeEnlazada delete(ListaDoblementeEnlazada list, String key) {
        // key is the deleting number
        // Node currentNode = list.head, prev = null;

        Node currentNode = list.head;
        Node previous = null;

        if (currentNode != null && currentNode.data.equals(key)) {
            list.head = currentNode.next;
            head.previous = null;
            currentNode.next = null;

            System.out.println("La palabra [" + key + "] (primera palabra) "
                    + "eliminada correctamente");
            return list;

        }

        while (currentNode != null && !currentNode.data.equals(key)) {
            previous = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null && currentNode == tail) {
            tail = previous;
            tail.next = null;
            currentNode.previous = null;
            System.out.println("La palabra [" + key + "] (ultima palabra)"
                    + " eliminada correctamente");
            return list;

        }

        if (currentNode != null) {
            previous.next = currentNode.next;
            System.out.println("La palabra [" + key + "] se ha eliminado"
                    + " correctamente");
        }

        if (currentNode == null) {
            System.out.println("La palabra [" + key + "] no se ha "
                    + "encontrado");
        }

        return list;
    }
}
