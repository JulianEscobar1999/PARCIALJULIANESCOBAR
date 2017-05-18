/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2julianescobar;

public class Pintor extends Usuario {

    private String curriculum, distinciones;
    
    
    public Pintor(String nombre, String apellido, String curriculum, String distinciones) {
        super(nombre, apellido);
        this.curriculum = curriculum;
        this.distinciones= distinciones;
    }        
    
    
    public String getCurriculum() {
        return curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
        
    
    @Override
    public String listarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
