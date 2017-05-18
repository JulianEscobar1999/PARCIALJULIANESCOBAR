/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2julianescobar;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        
        
        //Lo que esta en comentario es ("era") el menu interactivo
        
//        Scanner leer = new Scanner(System.in);
//        int opcionIni=0;
//        String n,a,r,f;
//        do{
//            System.out.println("Bienvenido\n 1.Pintor o 2.Comprador");            
//            opcionIni= leer.nextInt();
//            if(opcionIni==1){
//                System.out.println("Nombre de Pintor: ");
//                n = leer.nextLine();
//                System.out.println("Apellido de Pintor: ");
//                a = leer.nextLine();
//                System.out.println("Curriculum de Pintor: ");
//                r = leer.nextLine();
//                System.out.println("Distincion de Pintor: ");
//                f = leer.nextLine();                
//                System.out.println("Numero de Obras de Pintor: ");
//                opcionIni = leer.nextInt();
//                Pintor p = new Pintor(n,a,c,f);
//                
//            }
//            
//            
//        }while(opcionIni!=2&&opcionIni!=1);
        
        
        Pintor p = new Pintor("Juan","Cardenas","Curriculum","Distincion");        
        Obra o = new Obra(p,"Monalisa","Pinturaaaaa","Oleo",7);
        Coleccion c = new Coleccion();
        c.AñadirObra(o);
        String l = c.getA();
        System.out.println(l);        
        
        
    }
    
    
}
