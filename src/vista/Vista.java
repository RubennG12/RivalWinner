package vista;

import controlador.Controlador;
import look.Look;
import java.awt.BorderLayout;
import java.awt.Color;
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
	
	private Controlador controladorRW1;
	
	public  Vista(Controlador controladorRW1) {
		this.controladorRW1 = controladorRW1;
	}

	private static final long serialVersionUID = 1L;
	private JFrame pantallaRW1;
	
	private JDialog pantallaCargaRW1;

	public void cargarVentanaRW1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista windowRW1 = new Vista();
					windowRW1.mostrarPantallaCargaRW1();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 public void mostrarPantallaCargaRW1() {
	        pantallaCargaRW1 = new JDialog((JFrame) null, "Cargando...", true);
	        pantallaCargaRW1.getContentPane().setLayout(new BorderLayout());
	        pantallaCargaRW1.getContentPane().add(new JLabel("Espere unos segundos..."), BorderLayout.CENTER);
	        pantallaCargaRW1.setSize(200, 100);
	        pantallaCargaRW1.setLocationRelativeTo(null);

	        Timer temporizadorRW1 = new Timer(5000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                ocultarPantallaCargaRW1();
	                initializeRW1();
	            }
	        });
	        temporizadorRW1.setRepeats(false);
	        temporizadorRW1.start();

	        pantallaCargaRW1.setVisible(true);
	    }
	
	 private void ocultarPantallaCargaRW1() {
	        pantallaCargaRW1.dispose();
	    }

	 private void initializeRW1() {
		 pantallaRW1 = new JFrame();
		 pantallaRW1.setBounds(100, 100, 450, 300);
		 pantallaRW1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 pantallaRW1.setVisible(true);
		 
		 SpringLayout springLayout = new SpringLayout();
			getContentPane().setLayout(springLayout);
			
			JPanel panel = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, panel, 132, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, panel, -210, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, panel, -142, SpringLayout.EAST, getContentPane());
			getContentPane().add(panel);
			
			JLabel nombreTitulo1 = new JLabel("Rival Winner");
			panel.add(nombreTitulo1);
			springLayout.putConstraint(SpringLayout.NORTH, nombreTitulo1, 15, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, nombreTitulo1, 175, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, nombreTitulo1, 37, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, nombreTitulo1, -158, SpringLayout.EAST, getContentPane());
			Look.fontTituloRW(nombreTitulo1, "Arial", Font.BOLD, 16, Color.BLUE);
			
			nombreTitulo1.setVisible(true);
		}
}
