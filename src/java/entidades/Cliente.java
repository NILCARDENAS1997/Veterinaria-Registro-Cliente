package entidades;
// Generated 24-jun-2019 9:48:27 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente NIL CARDENAS
 */
public class Cliente  implements java.io.Serializable {


     private int codigoCliente;
     private String nombreCliente;
     private String apellidoCliente;
     private Date fechaNac;
     private String direccion;
     private Integer telefono;
     private String email;
     private Set mascotaporclientes = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int codigoCliente, String nombreCliente, String apellidoCliente, Date fechaNac) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.fechaNac = fechaNac;
    }
    public Cliente(int codigoCliente, String nombreCliente, String apellidoCliente, Date fechaNac, String direccion, Integer telefono, String email, Set mascotaporclientes) {
       this.codigoCliente = codigoCliente;
       this.nombreCliente = nombreCliente;
       this.apellidoCliente = apellidoCliente;
       this.fechaNac = fechaNac;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.mascotaporclientes = mascotaporclientes;
    }
   
    public int getCodigoCliente() {
        return this.codigoCliente;
    }
    
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getApellidoCliente() {
        return this.apellidoCliente;
    }
    
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getMascotaporclientes() {
        return this.mascotaporclientes;
    }
    
    public void setMascotaporclientes(Set mascotaporclientes) {
        this.mascotaporclientes = mascotaporclientes;
    }




}


