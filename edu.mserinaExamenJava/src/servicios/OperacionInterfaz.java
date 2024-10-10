package servicios;

/**
 * Contine la cabezera de los emtodos del servicio opercion
 * msm - 101024
 */
public interface OperacionInterfaz {

	/**
	 * Añade un nuevo cliente
	 * msm - 101024
	 */
	public void añadirCliente(); 
	
	/**
	 * Añade una compra a un cliente
	 * msm - 101024
	 */
	public void añadirCompraCliente();
	
	/**
	 * Calcula el importe de toda las ventas de una fecha especifica
	 * msm - 101024
	 */
	
	public void calculoTotalVentas();
}
