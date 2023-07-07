/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12y13Arboles;

/**
 *
 * @author carlos mejia
 */
public class BinarySearchTree {

    Node root;

    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            System.err.println("Valor ya existente!");
            return current;
        }
        return current; // return root                   
    }

    public void add(int value) {
        root = addRecursive(root, value);
      //  System.out.printf("Numero [%d] añadido correctamente", value);
    }

    public Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            //when the node is a leaf node            
            if (current.left == null && current.right == null) {
                return null;
            }
            // the case when the node has one child
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right); // menor de los mayores
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
            
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        } else {
            current.right = deleteRecursive(current.right, value);            
            return current;
        }
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
        System.out.printf("Numero [%d] eliminado", value);
    }

    public int findSmallestValue(Node root) {
        /*
        
        if (root.left == null) {
            return root.value;
        }else{
            findSmallestValue(root.left);
        }

         */
        return root.left == null ? root.value : findSmallestValue(root.left);
        // es un if y else de una sola linea, : significa sino
    }

    public void traversePreOrder(Node node) { // raiz, izquierda, derecha
        if (node != null) {
            System.out.printf("[%d] ", node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseinOrder(Node node) { // izquierda, raiz,  derecha
        if (node != null) {
            traverseinOrder(node.left);
            System.out.printf("[%d] ", node.value);
            traverseinOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) { // izquierda, derech, raiz
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.printf("[%d] ", node.value);
        }
    }

}
