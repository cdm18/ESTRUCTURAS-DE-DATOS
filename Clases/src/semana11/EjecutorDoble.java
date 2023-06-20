/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11;

/**
 *
 * @author SALA I
 */
public class EjecutorDoble {

    public static void main(String[] args) {
        ListaCircularDoblementeEnlazada lista
                = new ListaCircularDoblementeEnlazada();

        lista.insert(1);
        lista.insert(10);
        lista.insert(30);
        lista.insert(63);

        lista.printHead2Tail();
        lista.printTail2Head();
        
    }
}
