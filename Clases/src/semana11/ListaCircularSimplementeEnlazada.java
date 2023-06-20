/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11;

/**
 *
 * @author SALA I
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
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println("");

        }

    }

     public ListaSimplementeEnlazada insertar(ListaSimplementeEnlazada list, int data) {
        // crear un nuevo nodo                                
        Node new_node = new Node(data);
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

    public void print(ListaSimplementeEnlazada list) {
        Node currentNode = list.head;
        System.out.println("Lista enlazada simple: ");
        while(currentNode != null){
            System.out.printf("[%d] ", currentNode.data);
            currentNode = currentNode.next;
        }
        
        System.out.println("");
    }
    
    public ListaCircularSimplementeEnlazada delete (ListaCircularSimplementeEnlazada list, int key){
        // key is the deleting number
        // Node currentNode = list.head, prev = null;
        
        NodeSimple currentNode = list.head;
        NodeSimple previous = null;
        
        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            
            System.out.println(key + " found and deleted");
            return list;
            
        }
        
        while (currentNode != null && currentNode.data != key){
            previous = currentNode;
            currentNode = currentNode.next;           
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
