/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenTrabajo;

//import javax.swing.JOptionPane;
import java.util.Date;
import java.util.List;
import ordenTrabajo.Cliente;
import ordenTrabajo.Item;
import ordenTrabajo.Orden;
import ordenTrabajo.PersonaJuridica;
import ordenTrabajo.Producto;

/**
 *
 * @author Mauricio
 */
public class Main {

    public static void main(String[] args) {
        Cliente c1 = new PersonaJuridica("juan", 123, "Pedro", "crc");
        Cliente c2 = new PersonaFisica(123, "Encargado1", "San Jose");
        Producto p = new Producto(123, "azucar", 124);
        Producto p2 = new Producto(321, "leche", 541);
        Orden o = new Orden();
        o.setNumeroOrden(100);
        o.setFechaCreacion(new Date());
        o.setNombreCliente(c1);
        Item i = new Item(100, 305, p);
        o.agregarItem(i);
        Item i2 = new Item(101, 306, p2);
        o.agregarItem(i2);
        c1.agregarOden(o);
        c1.imprimeOrden();
        o.imprimeItems();
        o.calculartotal();

        Orden o2 = new Orden();
        o2.setNumeroOrden(100);
        o2.setFechaCreacion(new Date());
        o2.setNombreCliente(c1);
        o2.agregarItem(i);
        o2.agregarItem(i2);
        c2.agregarOden(o);
        c2.imprimeOrden();
        o2.imprimeItems();
        o2.calculartotal();

    }

}
