package util;

import controladores.inicio;

/**
 * Contiene metodos que se usaran a lo largo del programa
 * msm - 101024
 */
public class utiles {

	public long idGeneratorClientes() {
		
		long idNuevo;
		int tamano = inicio.listaClientes.size() -1;
		
		if(inicio.listaClientes.size() > 0) {
			
			idNuevo = inicio.listaClientes.get(tamano).getId()+1;
		}
		else {
			idNuevo = 1;
		}
		
		return idNuevo;
	}
	
	public long idGeneratorVentas() {
		
		long idNuevo;
		int tamano = inicio.listaVentas.size() -1;
		
		if(inicio.listaVentas.size() > 0) {
			
			idNuevo = inicio.listaVentas.get(tamano).getId()+1;
		}
		else {
			idNuevo = 1;
		}
		
		return idNuevo;
	}
}
