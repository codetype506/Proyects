/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.bd;

import java.io.Serializable;

/**
 *
 * @author Mauricio
 */

    public class PacienteTO implements Serializable {

    private int idPaciente;
    private String nombrePaciente;
    private String provincia;

    public PacienteTO(int idPaciente, String nombrePaciente, String provincia) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.provincia = provincia;
    }

    public PacienteTO() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int id) {
        this.idPaciente = id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombre(String nombre) {
        this.nombrePaciente = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String direccion) {
        this.provincia = direccion;
    }

}


