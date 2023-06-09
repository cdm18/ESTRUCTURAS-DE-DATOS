/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9.taller;

/**
 *
 * @author carlos M
 */
public class Persona {

    private String cedula;
    private String tipo;
    private Persona amigo;

    public Persona(String c, String t) {
        cedula = c;
        tipo = t;
    }

    public void setCedula(String c) {
        cedula = c;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public void concatenarNext(Persona nod) {
        amigo = nod;

    }

    public String getCedula() {
        return cedula;
    }

    public String getTipo() {
        return tipo;
    }

    public Persona getNext() {
        return amigo;
    }

    public void mostrarDatos() {

        String mensaje = String.format("ID: %s - Tipo: %s - Dir memoria: %s\n",
                cedula, tipo, amigo);

        System.out.println(mensaje);
    }

    

}
/*

 

 */
