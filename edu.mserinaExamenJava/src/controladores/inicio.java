package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import dtos.ClienteDto;
import dtos.VentasDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Clase principal de la aplicacion
 * msm -101024
 */
public class inicio {

	/**
	 * Metodo que controla la aplicacion
	 * msm - 101024
	 * @param args
	 */
	public static FileWriter sw;
	public static String rutaLog = "C:\\Users\\Alumno\\Desktop\\proyectosJava\\edu.mserinaExamenJava\\src\\log\\archivoLog.txt";
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<VentasDto> listaVentas = new ArrayList<VentasDto>();
	public static ArrayList<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
	
	public static void main(String[] args) {
		
		byte opcionMenu = 0;
		boolean cerrarMenu = false;
		
		MenuInterfaz mi = new MenuImplementacion();
		
		do {
			try {
				opcionMenu = mi.mostrarMenu();
				
				switch(opcionMenu) {
				
				case 0:
					cerrarMenu = true;
					sw = new FileWriter(rutaLog, true);
					sw.write("Cerrando menu" + "\n");
					sw.close();
					break;
					
				case 1:
					sw = new FileWriter(rutaLog, true);
					sw.write("Abriendo menu empleado" + "\n");
					sw.close();
					mi.logicaMenuEmpleado();
					break;
				case 2:
					sw = new FileWriter(rutaLog, true);
					sw.write("Abriendo menu gerente" + "\n");
					sw.close();
					mi.logicaMenuGerente();
					break;
				}
				
			}catch(Exception e) {
				try {
					sw = new FileWriter(rutaLog, true);
					sw.write("ERROR[!]: " + e.getMessage());
					sw.close();
				}catch(IOException ex) {
					
					System.out.println("ERROR[!] " + ex.getMessage());
				}
			}
		}while(!cerrarMenu);
	}
}
