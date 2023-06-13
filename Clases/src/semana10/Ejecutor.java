/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        ListaSimplementeEnlazada list = new ListaSimplementeEnlazada();

        list = list.insertar(list, 3);
        list = list.insertar(list, 8);
        list = list.insertar(list, 1);

        list.print(list);
    }
}
