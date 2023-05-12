/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenTrabajo;

/**
 *
 * @author Mauricio
 */
public class PersonaJuridica extends Cliente {
    String nombreContacto; 
    String idContacto; 

    public String getNombreContacto() {
        return nombreContacto;
    }

    public String getIdContacto() {
        return idContacto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public PersonaJuridica(String nombreContacto, String idContacto, int numeroOrden, String fechaCreacion) {
        super(numeroOrden, fechaCreacion);
        this.nombreContacto = nombreContacto;
        this.idContacto = idContacto;
    }
  
    
}
