/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12;

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
    }

}
