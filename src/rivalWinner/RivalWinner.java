package rivalWinner;

import controlador.Controlador;
import vista.Vista;

/**
 * Clase principal de la aplicación RivalWinner
 * Clase RivalWinner
 * 
 */
public class RivalWinner {
	
	/**
     * Constructor vacio
     */
	public RivalWinner() {
		
	}

	/**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */
	public static void main(String[] args) {
		
		Vista vistaRW1 = new Vista();
		Controlador controladorRW1 = new Controlador(vistaRW1);
		
		controladorRW1.mostrarPantallaCargaRW();
		
	}

}
