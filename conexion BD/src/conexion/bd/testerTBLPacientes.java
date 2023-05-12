/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.bd;

import java.util.List;

/**
 *
 * @author Mauricio
 */
public class testerTBLPacientes {
        public static void main(String[] args) {
        // TODO code application logic here
        ServicioTBLPaciente servicioPaciente = new ServicioTBLPaciente();
        
         List<PacienteTO> listado = servicioPaciente.demePaciente();
         for (PacienteTO pacienteTO : listado) {
             System.out.println(pacienteTO.getNombrePaciente() + " " + pacienteTO.getProvincia());
         }
         System.out.println("====================================");
         PacienteTO pacienteTORetorno = servicioPaciente.demePaciente(4);
         System.out.println("El Paciente es: "+pacienteTORetorno.getNombrePaciente());
    }
    
}

