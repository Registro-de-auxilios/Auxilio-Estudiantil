/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Auxilios;

import java.util.Vector;

/**
 *
 * @author adsi-admin
 */
public class LIstaEmpresas {
    Vector ListaEmpresas = new Vector();
    Empresa aux;
    
    public void guardar(Empresa e){
        ListaEmpresas.add(e);
    }
    
    
    public Empresa Buscar(int id2){
        Empresa aux=null;
        for (int i=0; i<ListaEmpresas.size();i++){
           
            int iaux= ((Empresa)ListaEmpresas.get(i)).getId();
            if (id2 == iaux){
                aux=(Empresa)ListaEmpresas.get(i); 
                break;
            }else{}
               
        }
    
        return aux;
    
    }
    
    
    public void Borrar(Empresa e){
        ListaEmpresas.remove(e);
    }
    
    
    
}
