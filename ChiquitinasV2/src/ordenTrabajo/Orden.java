package ordenTrabajo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Orden {

    //Atributos
    private int numeroOrden;
    private Date fechaCreacion;
    private Cliente nombreCliente;
    private Double montoTotal;
    private List<Item> listItems = new ArrayList<Item>();

//metodo imprimir items
    public void imprimeItems() {
        for (Item i : this.listItems) {

            JOptionPane.showMessageDialog(null, "Nombre de Producto :" + i.getProducto().getNombre()
                    + "\nConsecutivo de Producto :" + i.getConsecutivos()
                    + "\nCantidad de Producto :" + i.getCant());

        }
    }

    public Orden() {
    }

    //metodo agregar item 
    public void agregarItem(Item item) {
        this.listItems.add(item);

    }

    public void calculartotal() {
        double total = 0.0;
        for (Item item : this.listItems) {
            total = item.getProducto().getPrecio() * item.getCant();
        }
        JOptionPane.showMessageDialog(null, "El monto total es \n\n" + total);
    }

// metodo constructor
    public Orden(int numeroOrden, Date fechaCreacion, Cliente nombreCliente, Double montoTotal, List<Item> listItems) {
        this.numeroOrden = numeroOrden;
        this.fechaCreacion = fechaCreacion;
        this.nombreCliente = nombreCliente;
        this.montoTotal = montoTotal;
        this.listItems = listItems;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Cliente getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(Cliente nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public List<Item> getListItems() {
        return listItems;
    }

    public void setListItems(List<Item> listItems) {
        this.listItems = listItems;
    }

}
