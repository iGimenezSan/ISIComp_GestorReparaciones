/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author McKyavelik
 */
public class ObjetoCliente {
    
    
    String NIF;
    String Nombre;
    String Apellidos;
    String Domicilio;
    String Codigo_Postal;
    String Poblacion;
    String Provincia;
    String Telefono;
    String Email;

    public ObjetoCliente(String NIF, String Nombre, String Apellidos, String Domicilio, String Codigo_Postal, String Poblacion, String Provincia, String Telefono, String Email) {
        this.NIF = NIF;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Domicilio = Domicilio;
        this.Codigo_Postal = Codigo_Postal;
        this.Poblacion = Poblacion;
        this.Provincia = Provincia;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getCodigo_Postal() {
        return Codigo_Postal;
    }

    public void setCodigo_Postal(String Codigo_Postal) {
        this.Codigo_Postal = Codigo_Postal;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
   
}
