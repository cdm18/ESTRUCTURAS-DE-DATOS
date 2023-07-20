/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author carlos mejia
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrafoNoDirigido grafo = new GrafoNoDirigido(6);

        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(0, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(4, 5);
        grafo.agregarArista(3, 5);
        grafo.agregarArista(1, 4);

        for (int i = 0; i < 5; i++) {
            System.out.println("---------------------------");
            List<Integer> adyacentes = grafo.obtenerAdyacentes(i);
            System.out.printf("Nodos adyacentes al nodo %d:\n", i);

            for (Integer nodo : adyacentes) {
                System.out.println(nodo);
            }

        }
        System.out.println("---------------------------");

        System.out.println("Nodos del Grafo:");
        // Realizar el recorrido en anchura (BFS)
        bfs(grafo.getAdyacencia(), 0);
        System.out.println("---------------------------");

    }

    public static void bfs(List<List<Integer>> grafo, int nodoInicial) {
        boolean[] visitados = new boolean[grafo.size()];
        Queue<Integer> cola = new LinkedList<>();

        visitados[nodoInicial] = true;
        cola.offer(nodoInicial);

        while (!cola.isEmpty()) {
            int nodoActual = cola.poll();
            System.out.println(nodoActual);

            for (int adyacente : grafo.get(nodoActual)) {
                if (!visitados[adyacente]) {
                    visitados[adyacente] = true;
                    cola.offer(adyacente);
                }
            }
        }
    }
}
