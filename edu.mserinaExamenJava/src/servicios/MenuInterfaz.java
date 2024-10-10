package servicios;

import java.io.IOException;

/**
 * Contine la cabezera de los emtodos del servicio menu
 * msm - 101024
 */
public interface MenuInterfaz {

	/**
	 * Muestra el menu y recoge la respuesta del usuario
	 * msm - 101024
	 * @return La respuesa del usuario
	 */
	public byte mostrarMenu();
	
	/**
	 * Devuelve el menu de gerentes
	 * msm - 101024
	 * @throws IOException lanza la excepcion si hubiera fallos con el log
	 */
	public void logicaMenuGerente() throws IOException;
	
	/**
	 * Devuelve el menu de empleados
	 * msm - 101024
	 * @throws IOException lanza la excepcion si hubiera fallos con el log
	 */
	public void logicaMenuEmpleado() throws IOException;
	

}
