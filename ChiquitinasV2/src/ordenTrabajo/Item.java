/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenTrabajo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Mauricio
 */
public class Item /*extends Orden*/ {

    // atributos
    private int consecutivos;
    private int cant;
    private Producto producto;

//metodo constructor
/*public Item (){
    
}
     */
    public Item(int consecutivos, int cant, Producto producto) {
        this.consecutivos = consecutivos;
        this.cant = cant;
        this.producto = producto;
    }

    public int getConsecutivos() {
        return consecutivos;
    }

    public void setConsecutivos(int consecutivos) {
        this.consecutivos = consecutivos;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
