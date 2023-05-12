/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenTrabajo;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
//metodo constructor
public class PersonaJuridica extends Cliente {

    private String nombreContacto;

    public PersonaJuridica(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public PersonaJuridica(String nombreContacto, int numeroCed, String nombreCliente, String direccionCliente) {
        super(numeroCed, nombreCliente, direccionCliente);
        this.nombreContacto = nombreContacto;
    }

}
