package servicios;

import java.time.LocalDate;

import controladores.inicio;
import dtos.ClienteDto;
import dtos.VentasDto;
import util.utiles;

public class OperacionImplementacion implements OperacionInterfaz {

	utiles util = new utiles();
	@Override
	public void añadirCliente() {
		
		boolean cerrarMenu = false;
		
		do {
			ClienteDto clien = new ClienteDto();
			System.out.println("Inserte nombre del nuevo cliente");
			clien.setNombre(inicio.sc.next());
			System.out.println("Inserte apellido del nuevo cliente");
			clien.setApellidos(inicio.sc.next());
			clien.setId(util.idGeneratorClientes());
			
			inicio.listaClientes.add(clien);
			
			System.out.println("Desea insertar mas clientes s/n");
			String respuesta = inicio.sc.next();
			
			if(respuesta.equals("n")) {
				cerrarMenu = true;
			}
			
		}while(!cerrarMenu);
		
		for(ClienteDto cliente : inicio.listaClientes) {
			System.out.println(" ");
			System.out.println(cliente.toString());
			System.out.println(" ");
		}
	}
	
	public void añadirCompraCliente() {
		VentasDto ven = new VentasDto();
		System.out.println("Inserte importe");
		ven.setImporte(inicio.sc.nextInt());
		System.out.println("Inserte id del cliente");
		ven.setIdClienteCompra(inicio.sc.nextLong());
		ven.setFecha(LocalDate.now());
		ven.setId(util.idGeneratorVentas());
		
		inicio.listaVentas.add(ven);
		
		for(VentasDto venta : inicio.listaVentas) {
			System.out.println(" ");
			System.out.println(venta.toString());
			System.out.println(" ");
		}
		
	}

}
