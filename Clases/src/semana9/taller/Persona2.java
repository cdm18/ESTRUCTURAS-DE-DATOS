/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9.taller;

/**
 *
 * @author SALA I
 */
public class Persona2 {

    private String cedula;
    private String tipo;
    private Persona2 amigo;

    public Persona2(String c, String t) {
        cedula = c;
        tipo = t;
    }

    public void concatenarPersona(Persona2 nod) {
        amigo = nod;

    }
    
    
    
    
    
    public String imprimir() {

        String mensaje = String.format("ID: %s - Tipo: %s - Dir memoria: %s\n",
                cedula, tipo, amigo);

        return mensaje;
    }

    
}
