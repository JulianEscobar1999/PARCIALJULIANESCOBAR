/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2julianescobar;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Coleccion {
    
    private ArrayList<Obra> a;

    public Coleccion() {
        this.a = new ArrayList<>();
    }
          
    
    public void AñadirObra(Obra a){
        this.a.add(a);
    }

    public String getA() {        
       return a.get(0).getDescripcion();
    }
    
    
    
    
}
