package controlador;

/**
 * Controla las acciones de la interfaz
 * Clase Controlador
 * 
 */

import vista.Vista;
import look.Look;

/**
 * Controlador de la aplicación.
 */
public class Controlador {

	Vista vistaRW;
	
	
	/**
	 * Constructor vacio
	 */
	public Controlador() {
		
	}
	/**
	 * Constructor con el parametro del objeto Vista
	 * @param vistaRW Objecto Vista
	 */
	public Controlador(Vista vistaRW) {
		this.vistaRW = vistaRW;
	}
	
	/**
	 * Método para mostrar la ventana Principal
	 */
	public void mostrarVentanaRW() {
		this.vistaRW.cargarVentanaRW1();
	} 
	
	
	/**
	 * Método para mostrar la ventana de carga
	 */
	public void mostrarPantallaCargaRW() {
		this.vistaRW.mostrarPantallaCargaRW1();
	}
	
	
}
