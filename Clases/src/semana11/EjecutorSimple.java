/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11;

/**
 *
 * @author SALA I
 */
public class EjecutorSimple {

    public static void main(String[] args) {
        ListaCircularSimplementeEnlazada lista
                = new ListaCircularSimplementeEnlazada();

        lista.add(1);
        lista.add(10);
        lista.add(30);
        lista.add(63);

        lista.print();

    }
}
