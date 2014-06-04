/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estudiantes;

import java.util.Vector;

/**
 *
 * @author adsi-admin
 */
public class LIstaEstudiantes {
     Vector ListaEstudiantes = new Vector();
    Datos aux;
    
    public void guardar(Datos e){
        ListaEstudiantes.add(e);
    }
    
    
    public Datos Buscar(int id2){
        Datos aux=null;
        for (int i=0; i<ListaEstudiantes.size();i++){
           
            int iaux= ((Datos)ListaEstudiantes.get(i)).getId();
            if (id2 == iaux){
                aux=(Datos)ListaEstudiantes.get(i); 
                break;
            }else{}
               
        }
    
        return aux;
    
    }
    
    
    public void Borrar(Datos e){
        ListaEstudiantes.remove(e);
    }
}
