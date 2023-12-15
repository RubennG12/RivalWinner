package controlador;

import vista.Vista;
import look.Look;

public class Controlador {

	Vista vistaRW;
	
	

	public Controlador() {
		
	}

	public Controlador(Vista vistaRW) {
		this.vistaRW = vistaRW;
	}
	
	public void mostrarVentanaRW() {
		this.vistaRW.cargarVentanaRW1();
	}
	
	public void mostrarPantallaCargaRW() {
		this.vistaRW.mostrarPantallaCargaRW1();
	}
	
	
}
