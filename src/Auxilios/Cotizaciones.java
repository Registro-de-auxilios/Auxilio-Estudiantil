/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Auxilios;
import Estudiantes.*;
/**
 *
 * @author adsi-admin
 */
public class Cotizaciones {
   Empresa nombreEmpresa;
   public String TipoAuxilio;
   public int cantidad;
   Datos nombre;
   public String MetodoPago;

    public Empresa getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(Empresa nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoAuxilio() {
        return TipoAuxilio;
    }

    public void setTipoAuxilio(String TipoAuxilio) {
        this.TipoAuxilio = TipoAuxilio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Datos getNombre() {
        return nombre;
    }

    public void setNombre(Datos nombre) {
        this.nombre = nombre;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }
   
}
