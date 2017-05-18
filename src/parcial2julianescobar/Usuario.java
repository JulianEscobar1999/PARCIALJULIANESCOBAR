/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2julianescobar;

/**
 *
 * @author Estudiante
 */
public abstract class Usuario {
    protected String nombre, apellido;
    
    public Usuario(String nombre, String apellido){
        this.apellido= apellido;
        this.nombre= nombre;
       
    }
     public abstract String listarInformacion();
}
