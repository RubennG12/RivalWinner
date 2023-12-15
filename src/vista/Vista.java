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
	
	public Vista(){
		
	}
	
	
	public  Vista(Controlador controladorRW1) {
		this.controladorRW1 = controladorRW1;
	}

	private static final long serialVersionUID = 1L;
	public JFrame pantallaRW1;
	
	public JDialog pantallaCargaRW1;

	public void cargarVentanaRW1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista windowRW1 = new Vista();
					windowRW1.mostrarPantallaCargaRW1();
					windowRW1.setVisible(true);
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
		 	pantallaCargaRW1.setVisible(false);
		 	pantallaCargaRW1.dispose();
	    }

	 private void initializeRW1() {

			    setTitle("RivalWinner");
			    getContentPane().setLayout(new BorderLayout(0, 0));
			    
			    JPanel panelTop = new JPanel();
			    Look.cambiarColorPanel(panelTop, Color.BLUE, Color.BLACK);
			    getContentPane().add(panelTop, BorderLayout.NORTH);
			    
			    JLabel tituloRW1 = new JLabel("Rival Winner");
			    Look.fontPalabrasRW(tituloRW1, "Futura", Font.BOLD, 18, Color.WHITE);
			    panelTop.add(tituloRW1);

			    
			    setBounds(100, 100, 450, 300);
			    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    
			    
				JPanel panelCenter = new JPanel();
				Look.cambiarColorPanel(panelTop, Color.BLUE, Color.BLACK);
				getContentPane().add(panelCenter, BorderLayout.CENTER);
				panelCenter.setLayout(new GridLayout(5, 1, 0, 0));
				
				JButton btnTorneoBaloncesto = new JButton("Torneo de Baloncesto");
				Look.fontBotonesRW(btnTorneoBaloncesto, "New Times Roman", Font.PLAIN, 14, Color.WHITE);
				Look.cambiarColorBoton(btnTorneoBaloncesto, Color.BLUE, Color.BLACK);
				panelCenter.add(btnTorneoBaloncesto);
				
				JButton btnTorneoFutbol = new JButton("Torneo de Fútbol");
				Look.fontBotonesRW(btnTorneoFutbol, "New Times Roman", Font.PLAIN, 14, Color.WHITE);
				Look.cambiarColorBoton(btnTorneoFutbol, Color.BLUE, Color.BLACK);
				panelCenter.add(btnTorneoFutbol);
				
				JButton btnTorneoPetanca = new JButton("Torneo de Petanca");
				Look.fontBotonesRW(btnTorneoPetanca, "New Times Roman", Font.PLAIN, 14, Color.WHITE);
				Look.cambiarColorBoton(btnTorneoPetanca, Color.BLUE, Color.BLACK);
				panelCenter.add(btnTorneoPetanca);
				
				JButton btnTorneoCOD = new JButton("Torneo de COD");
				Look.fontBotonesRW(btnTorneoCOD, "New Times Roman", Font.PLAIN, 14, Color.WHITE);
				Look.cambiarColorBoton(btnTorneoCOD, Color.BLUE, Color.BLACK);
				panelCenter.add(btnTorneoCOD);
				
				JButton btnTorneoChapas = new JButton("Torneo de Chapas");
				Look.fontBotonesRW(btnTorneoChapas, "New Times Roman", Font.PLAIN, 14, Color.WHITE);
				Look.cambiarColorBoton(btnTorneoChapas, Color.BLUE, Color.BLACK);
				panelCenter.add(btnTorneoChapas);
				
				

			    setVisible(true);
			
		}
}

