package rivalWinner;

import rivalWinner.Controlador;
import rivalWinner.Vista;

public class RivalWinner {

	public static void main(String[] args) {
		
		Vista miVista = new Vista();
		Controlador miControlador = new Controlador(miVista);
		
		miControlador.mostrarVista();
	}

}
