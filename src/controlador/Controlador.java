package controlador;

import vista.Vista;

public class Controlador {

	Vista miVista;

	public Controlador(Vista miVista) {
		this.miVista = miVista;
	}
	
	public void mostrarVista() {
		this.miVista.mostrarPantallaCarga();
	}
	
}
