package rivalWinner;

import controlador.Controlador;
import vista.Vista;

public class RivalWinner {

	public static void main(String[] args) {
		
		Vista vistaRW1 = new Vista();
		Controlador controladorRW1 = new Controlador(vistaRW1);
		
		controladorRW1.mostrarPantallaCargaRW();
		
	}

}
