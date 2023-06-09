package semana10;

public class ListaSimplementeEnlazada {
// tail no es necesaria en la 
// lista simplemente enlazada, solo se enfoca en cabeza (head)

    public class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;

        }

    }
    Node head;

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
    
    public ListaSimplementeEnlazada delete (ListaSimplementeEnlazada list, int key){
        // key is the deleting number
        // Node currentNode = list.head, prev = null;
        
        Node currentNode = list.head;
        Node previous = null;
        
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
