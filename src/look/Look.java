package look;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Look {

	public static void fontPalabrasRW(JLabel labelRW1, String fontNameRW1, int fontStyleRW1, int fontSizeRW1, Color fontColorRW1) {
		Font fontTitulo1 = new Font(fontNameRW1, fontStyleRW1, fontSizeRW1);
		labelRW1.setFont(fontTitulo1);
		labelRW1.setForeground(fontColorRW1);
	}
	
	public static void fontBotonesRW(JButton labelRW1, String fontNameRW1, int fontStyleRW1, int fontSizeRW1, Color fontColorRW1) {
		Font fontTitulo1 = new Font(fontNameRW1, fontStyleRW1, fontSizeRW1);
		labelRW1.setFont(fontTitulo1);
		labelRW1.setForeground(fontColorRW1);
	}
	
	public static void cambiarColorPanel(JPanel panelRW, Color colorRW, Color colorBordeRW) {
        panelRW.setBackground(colorRW);
        panelRW.setBorder(BorderFactory.createLineBorder(colorBordeRW));
    }
	
	public static void cambiarColorBoton(JButton botonRW, Color colorRW, Color colorBordeRW) {
        botonRW.setBackground(colorRW);
        botonRW.setBorder(BorderFactory.createLineBorder(colorBordeRW));
    }
	
}
