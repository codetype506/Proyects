/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenTrabajo;

/**
 *
 * @author Mauricio
 */
public class PersonaFisica extends Cliente {
    String nombre ; 
    int numeroCed; 

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCed() {
        return numeroCed;
    }

    public PersonaFisica(String nombre, int numeroCed, int numeroOrden, String fechaCreacion) {
        super(numeroOrden, fechaCreacion);
        this.nombre = nombre;
        this.numeroCed = numeroCed;
    }
    
}
