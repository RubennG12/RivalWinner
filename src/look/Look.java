package look;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Contiene métodos para la manipulación del aspecto visual de componentes de interfaz
 * Clase Look
 */
public class Look {
	
	/**
     * Aplica un estilo de fuente a un JLabel
     * 
     * @param labelRW1      El JLabel al que se le aplicará el estilo de fuente
     * @param fontNameRW1   El nombre de la fuente
     * @param fontStyleRW1  El estilo de la fuente 
     * @param fontSizeRW1   El tamaño de la fuente
     * @param fontColorRW1  El color de la fuente
     */
	public static void fontPalabrasRW(JLabel labelRW1, String fontNameRW1, int fontStyleRW1, int fontSizeRW1, Color fontColorRW1) {
		Font fontTitulo1 = new Font(fontNameRW1, fontStyleRW1, fontSizeRW1);
		labelRW1.setFont(fontTitulo1);
		labelRW1.setForeground(fontColorRW1);
	}
	
	/**
     * Aplica un estilo de fuente a un JButton
     * 
     * @param botonRW1      El JButton al que se le aplicará el estilo de fuente
     * @param fontNameRW1   El nombre de la fuente
     * @param fontStyleRW1  El estilo de la fuente
     * @param fontSizeRW1   El tamaño de la fuente
     * @param fontColorRW1  El color de la fuente
     */
	public static void fontBotonesRW(JButton labelRW1, String fontNameRW1, int fontStyleRW1, int fontSizeRW1, Color fontColorRW1) {
		Font fontTitulo1 = new Font(fontNameRW1, fontStyleRW1, fontSizeRW1);
		labelRW1.setFont(fontTitulo1);
		labelRW1.setForeground(fontColorRW1);
	}
	
	/**
     * Cambia el color de fondo de un JPanel y su borde.
     * 
     * @param panelRW       El JPanel al que se le cambiará el color de fondo
     * @param colorRW       El color de fondo a aplicar al JPanel
     * @param colorBordeRW  El color del borde del JPanel
     */
	public static void cambiarColorPanel(JPanel panelRW, Color colorRW, Color colorBordeRW) {
        panelRW.setBackground(colorRW);
        panelRW.setBorder(BorderFactory.createLineBorder(colorBordeRW));
        panelRW.revalidate();
        panelRW.repaint();
    }
	
	
	/**
     * Cambia el color de fondo de un JPanel
     * 
     * @param panelRW  El JPanel al que se le cambiará el color de fondo
     * @param colorRW  El color de fondo a aplicar al JPanel
     */
	public static void cambiarColorPanel(JPanel panelRW, Color colorRW) {
        panelRW.setBackground(colorRW);
        
        panelRW.revalidate();
        panelRW.repaint();
    }
	
	
	/**
     * Cambia el color de fondo de un JButton y su borde.
     * 
     * @param botonRW       El JButton al que se le cambiará el color de fondo
     * @param colorRW       El color de fondo a aplicar al JButton
     * @param colorBordeRW  El color del borde del JButton
     */
	public static void cambiarColorBoton(JButton botonRW, Color colorRW, Color colorBordeRW) {
        botonRW.setBackground(colorRW);
        
        botonRW.revalidate();
        botonRW.repaint();
    }
	
}
