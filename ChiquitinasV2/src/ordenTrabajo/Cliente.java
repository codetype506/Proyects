package ordenTrabajo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Cliente {

    // Atributos
    private int numeroCed;
    private String nombreCliente;
    private String direccionCliente;
    private List<Orden> listOrden = new ArrayList<Orden>();

//metodo constructor 
    public Cliente() {

    }

    public Cliente(int numeroCed, String nombreCliente, String direccionCliente/*, List<Orden> listOrden*/) {
        this.numeroCed = numeroCed;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        //this.listOrden = listOrden;
    }

    public int getNumeroCed() {
        return numeroCed;
    }

    public void setNumeroCed(int numeroCed) {
        this.numeroCed = numeroCed;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public List<Orden> getListOrden() {
        return listOrden;
    }

    public void setListOrden(List<Orden> listOrden) {
        this.listOrden = listOrden;
    }

    public void agregarOden(Orden orden) {
        this.listOrden.add(orden);
    }

    public void imprimeOrden() {
        for (Orden o : this.listOrden) {

            JOptionPane.showMessageDialog(null, "Fecha de creacion de la orden :" + o.getFechaCreacion()
                    + "\nNumero de orden :" + o.getNumeroOrden()
                    + "\nNombre de cliente :" + getNombreCliente());

        }
    }

}
