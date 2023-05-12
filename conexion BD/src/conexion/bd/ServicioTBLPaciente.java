/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion.bd;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauricio
 */

    /**
     * @param args the command line arguments
     */
        public class ServicioTBLPaciente extends ServicioP {
    
        //retorna una lista de Personas
    public List<PacienteTO> demePaciente() {

        Statement stmt = null;
        ResultSet rs = null;
        List<PacienteTO> listaRetorno = new ArrayList<>();

        try {
            conectar();
            //Paso 3
            stmt = conexion.createStatement();
            String sql = "SELECT idPaciente, provincia, nombrePaciente FROM pacientes";
            //Paso 4
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("idPaciente");
                String nom = rs.getString("nombrePaciente");
                String dir = rs.getString("provincia");
                PacienteTO pacienteTO = new PacienteTO(id, nom, dir);
                listaRetorno.add(pacienteTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Paso 5
            cerrarResultSet(rs);
            cerrarStatement(stmt);
            desconectar();
        }
        return listaRetorno;
    }
    //Retorna UNA persona
    public PacienteTO demePaciente(int idPaciente) {

        Statement stmt = null;
        ResultSet rs = null;
        PacienteTO pacienteTORetorno = null;

        try {
            conectar();
            //Paso 3
            stmt = conexion.createStatement();
            String sql = "SELECT idPaciente, provincia, nombrePaciente FROM pacientes WHERE idPaciente = " + idPaciente;
            //Paso 4
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int id = rs.getInt("idPaciente");
                String nom = rs.getString("nombrePaciente");
                String dir = rs.getString("provincia");
                pacienteTORetorno = new PacienteTO(id, nom, dir);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Paso 5
            cerrarResultSet(rs);
            cerrarStatement(stmt);
            desconectar();
        }
        return pacienteTORetorno;
    }
    
    public void insert(PacienteTO pacienteTO) {
            //*******
    }

}

        // TODO code application logic here
    
    


