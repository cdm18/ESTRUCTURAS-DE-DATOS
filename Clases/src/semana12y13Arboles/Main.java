/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12y13Arboles;

/**
 *
 * @author SALA I
 */
public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(8);
        tree.add(10);
        tree.add(1008);
        tree.add(1);
        tree.add(18);
        tree.add(11);
        tree.add(2);
        tree.add(20);
        tree.add(16);
        tree.add(58);
        tree.add(3);

        tree.delete(20);
        System.out.println("\nRecorrido del arbol PreOrden");
        tree.traversePreOrder(tree.root);
        System.out.println("");
        System.out.println("\nRecorrido del arbol EnOrden");
        tree.traverseinOrder(tree.root);
        System.out.println("");
        System.out.println("\nRecorrido del arbol PostOrden");
        System.out.println("");
        tree.traversePostOrder(tree.root);
        System.out.println("");
        
        
    }
}
