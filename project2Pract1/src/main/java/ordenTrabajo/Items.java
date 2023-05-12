/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenTrabajo;

/**
 *
 * @author Mauricio
 */
public class Items extends Orden {
    int consecutivos; 
    int cant; 

    public Items(int consecutivos, int cant, int numeroOrden, String fechaCreacion) {
        super(numeroOrden, fechaCreacion);
        this.consecutivos = consecutivos;
        this.cant = cant;
    }

    }
    

