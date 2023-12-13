package rivalWinner;

import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame pantalla;
	
	private JDialog pantallaCarga;

	public void cargarVentana() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.mostrarPantallaCarga();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 public void mostrarPantallaCarga() {
	        pantallaCarga = new JDialog((JFrame) null, "Cargando...", true);
	        pantallaCarga.setLayout(new BorderLayout());
	        pantallaCarga.add(new JLabel("Espere unos segundos..."), BorderLayout.CENTER);
	        pantallaCarga.setSize(200, 100);
	        pantallaCarga.setLocationRelativeTo(null);

	        Timer temporizador = new Timer(5000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                ocultarPantallaCarga();
	                initialize();
	            }
	        });
	        temporizador.setRepeats(false);
	        temporizador.start();

	        pantallaCarga.setVisible(true);
	    }
	
	 private void ocultarPantallaCarga() {
	        pantallaCarga.dispose();
	    }

	 private void initialize() {
		 pantalla = new JFrame();
		 pantalla.setBounds(100, 100, 450, 300);
		 pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 pantalla.setVisible(true);
		}

	
}
