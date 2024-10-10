package servicios;

import java.io.FileWriter;
import java.io.IOException;

import controladores.inicio;

public class MenuImplementacion implements MenuInterfaz {

	OperacionInterfaz op = new OperacionImplementacion();
	@Override
	public byte mostrarMenu() {
		byte respuestaUsuario = 0;

		System.out.println(" ");
		System.out.println("MENU PRINCIPAL");
		System.out.println("----------------");
		System.out.println("0[] Cerrar Menu");
		System.out.println("1[] Menu Empleado");
		System.out.println("2[] Menu Gerente");
		System.out.println(" ");

		respuestaUsuario = inicio.sc.nextByte();
		return respuestaUsuario;
	}

	private byte mostrarMenuEmpleado() {
		byte respuestaUsuario = 0;

		System.out.println(" ");
		System.out.println("MENU EMPLEADO");
		System.out.println("----------------");
		System.out.println("0[] Cerrar Menu");
		System.out.println("1[] Calculo de ventas total mensual");
		System.out.println("2[] Añadir compra a un cliente");
		System.out.println(" ");

		respuestaUsuario = inicio.sc.nextByte();
		return respuestaUsuario;
	}

	private byte mostrarMenuGerente() {
		byte respuestaUsuario = 0;

		System.out.println(" ");
		System.out.println("MENU GERENTE");
		System.out.println("----------------");
		System.out.println("0[] Cerrar Menu");
		System.out.println("1[] Crear nuevo cliente");
		System.out.println(" ");

		respuestaUsuario = inicio.sc.nextByte();
		return respuestaUsuario;
	}

	public void logicaMenuEmpleado() throws IOException {
		byte opcionMenu = 0;
		boolean cerrarMenu = false;

		MenuInterfaz mi = new MenuImplementacion();

		do {
			opcionMenu = mostrarMenuEmpleado();

			switch (opcionMenu) {

			case 0:
				cerrarMenu = true;
				inicio.sw = new FileWriter(inicio.rutaLog, true);
				inicio.sw.write("Cerrando menu de empleado" + "\n");
				inicio.sw.close();

				break;

			case 1:
				inicio.sw = new FileWriter(inicio.rutaLog, true);
				inicio.sw.write("Abriendo calculo de ventas total mensual" + "\n");
				inicio.sw.close();

				cerrarMenu = true;
				break;
			case 2:
				inicio.sw = new FileWriter(inicio.rutaLog, true);
				inicio.sw.write("Añadir compra a un cliente" + "\n");
				inicio.sw.close();
				op.añadirCompraCliente();
				cerrarMenu = true;
				break;
			}

		} while (!cerrarMenu);
	}
	

	public void logicaMenuGerente() throws IOException {
		byte opcionMenu = 0;
		boolean cerrarMenu = false;

		MenuInterfaz mi = new MenuImplementacion();

		do {
			opcionMenu = mostrarMenuGerente();

			switch (opcionMenu) {

			case 0:
				cerrarMenu = true;
				inicio.sw = new FileWriter(inicio.rutaLog, true);
				inicio.sw.write("Cerrando menu gerente" + "\n");
				inicio.sw.close();
				
				break;

			case 1:
				inicio.sw = new FileWriter(inicio.rutaLog, true);
				inicio.sw.write("Crear nuevo cliente" + "\n");
				inicio.sw.close();
				op.añadirCliente();
				cerrarMenu = true;
				break;
			
			}

		} while (!cerrarMenu);
	}
}
