package controlador;

import vista.Vista;

public class Controlador {

	Vista vistaRW;

	public Controlador(Vista vistaRW) {
		this.vistaRW = vistaRW;
	}
	
	public void mostrarVista() {
		this.vistaRW.mostrarPantallaCargaRW1();
	}
	
}
