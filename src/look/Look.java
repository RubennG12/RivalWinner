package look;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Look {

	public static void fontTituloRW(JLabel labelRW1, String fontNameRW1, int fontStyleRW1, int fontSizeRW1, Color fontColorRW1) {
		Font fontTitulo1 = new Font(fontNameRW1, fontStyleRW1, fontSizeRW1);
		labelRW1.setFont(fontTitulo1);
		labelRW1.setForeground(fontColorRW1);
	}
	
}
