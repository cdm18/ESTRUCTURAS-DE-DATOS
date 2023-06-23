/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02Bim;

/**
 *
 * @author SALA I
 */
public class Turno {

    public class Node {

        int data;
        String cedula;
        Node next;

        Node(String d, int dat) {
            cedula = d;
            data = dat;
        }

    }
    Node head;

    public Turno insertar(Turno list, String cedu, int data) {
        // crear un nuevo nodo                                
        Node new_node = new Node(cedu, data);
        new_node.next = null;

        // Para el caso que la lista este vacia
        if (list.head == null) {
            list.head = new_node;
        } else {
            // para ir al final de la lista
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // insertar al final de la lista
            last.next = new_node;

        }
        return list;
    }

    public void print(Turno list) {
        Node currentNode = list.head;
        System.out.println("Lista de tickets/turnos: ");
        while (currentNode != null) {
            System.out.printf("Ticket: [%d] -> Cedula: [%s]\n", currentNode.data,
                    currentNode.cedula);
            currentNode = currentNode.next;
        }

        System.out.println("");
    }

    public Turno delete(Turno list, int key) {
        // key is the deleting number
        // Node currentNode = list.head, prev = null;

        Node currentNode = list.head;
        Node previous = null;

        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;

            //  System.out.println(key + " found and deleted");
            return list;

        } 

        while (currentNode != null && currentNode.data != key) {
            previous = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            previous.next = currentNode.next;
            System.out.println("Ticket #" + key + " eliminado");
        }

        if (currentNode == null) {
            System.out.println("Ticket #" +key + " no encontrado, intente con otro");
        }
        
        

        return list;
    }
}
