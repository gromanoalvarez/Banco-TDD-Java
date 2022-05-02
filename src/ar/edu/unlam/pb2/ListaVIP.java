/**
 * 
 */
package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author German
 *
 */
public class ListaVIP {
	
	List<Cliente> clientesVIP = new LinkedList<>();
	
	
	public void agregarClienteVIP(Cliente cliente) {
		
		clientesVIP.add(cliente); 
	}

}
