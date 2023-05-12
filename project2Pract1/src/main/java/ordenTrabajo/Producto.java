/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenTrabajo;

/**
 *
 * @author Mauricio
 */
public class Producto extends Items{
    int id ; 
    String nombre; 
    String descripcion; 
    float precio ; 

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public int getConsecutivos() {
        return consecutivos;
    }

    public int getCant() {
        return cant;
    }

    public Producto(int id, String nombre, String descripcion, float precio, int consecutivos, int cant, int numeroOrden, String fechaCreacion) {
        super(consecutivos, cant, numeroOrden, fechaCreacion);
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
}
