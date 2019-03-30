/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estudiantes;

/**
 *
 * @author adsi-admin
 */
public class Datos {
    public int id;
    public String nombre;
    public String apellido;
    public String documento;
    public int n_doc;
    public int fch_ncto;
    public int telefono;
    public String direccion;
    public String email;
    public String curso;
    public int ficha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getN_doc() {
        return n_doc;
    }

    public void setN_doc(int n_doc) {
        this.n_doc = n_doc;
    }

    public int getFch_ncto() {
        return fch_ncto;
    }

    public void setFch_ncto(int fch_ncto) {
        this.fch_ncto = fch_ncto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    
    
    public void auxilio(){
        
    }
     
   public static void main(String[]arg) {
      Datos Linda =new Datos();
      
      Linda.setNombre("Fredy");
      System.out.println(Linda.getNombre());
     
   }
}
