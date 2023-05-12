
package ordenTrabajo;
import javax.swing.JOptionPane;
/**
 *
 * @author Mauricio
 */
public class Cliente extends Orden {
    // Atributos
    
 String nombreCliente ; 
 String direccionCliente ; 

    public Cliente(int numeroOrden, String fechaCreacion) {
        super(numeroOrden, fechaCreacion);
    }
// getters
    public String getNombreCliente() {
       
        return nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

 
    
}
