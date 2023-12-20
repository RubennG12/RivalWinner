package vista;

import controlador.Controlador;
import look.Look;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
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


/**
 * Representa la interfaz gráfica de la aplicación RivalWinner
 * Clase Vista
 */
public class Vista extends JFrame {
	
	private Controlador controladorRW1;
	
	/**
	 * Constructor vacio
	 */
	public Vista(){
		
	}
	
	/**
	 * Constructor que recibe un controlador.
	 * @param controladorRW1 El controlador asociado a la vista.
	 */
	public  Vista(Controlador controladorRW1) {
		this.controladorRW1 = controladorRW1;
	}

	//METODOS
	private static final long serialVersionUID = 1L;
	
	/**
     * Ventana principal de la aplicación.
     */
	public JFrame pantallaRW1;
	
	/**
     * Ventana de carga utilizada al iniciar la aplicación.
     */
	public JDialog pantallaCargaRW1;
	
	/**
	 * Carga la ventana principal de la aplicación
	 */
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
	
	/**
	 * Muestra la pantalla de carga al inicio y luego inicializa la ventana principal
	 */
	 public void mostrarPantallaCargaRW1() {
	        pantallaCargaRW1 = new JDialog((JFrame) null, "Cargando...", true);
	        pantallaCargaRW1.getContentPane().setLayout(new BorderLayout());
	        pantallaCargaRW1.getContentPane().add(new JLabel("Trabajando en actualizaciones..."), BorderLayout.CENTER);
	        pantallaCargaRW1.setSize(230, 125);
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
	 
	 /**
	  * Oculta y cierra la pantalla de carga
	 */
	 private void ocultarPantallaCargaRW1() {
		 	pantallaCargaRW1.setVisible(false);
		 	pantallaCargaRW1.dispose();
	    }
	 
	 /**
	 * Inicializa la ventana principal con sus componentes
	 */
	 private void initializeRW1() {
		 
		 		pantallaRW1 = new JFrame();
		 		
		 		
		 		//Defino algunos colores
				Color azulCianOscuroRW = new Color(5, 189, 171);
				Color azulClaroRW = new Color(143, 255, 244);
			
				//Agrego el titulo de la ventana
			    setTitle("RivalWinner");
			    getContentPane().setLayout(new BorderLayout(0, 0));
			    
			    //Agrego el titulo que aparece en la parte superior del programa
			    JPanel panelTopRW = new JPanel();
			    Look.cambiarColorPanel(panelTopRW, azulCianOscuroRW, azulCianOscuroRW);
			    getContentPane().add(panelTopRW, BorderLayout.NORTH);
			    
			    JLabel tituloRW1 = new JLabel("Rival Winner");
			    Look.fontPalabrasRW(tituloRW1, "Futura", Font.BOLD, 18, Color.BLACK);
			    panelTopRW.add(tituloRW1);

			    
			    setBounds(100, 100, 450, 300);
			    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    
			    //Agrego los botones de cada torneo 
				JPanel panelCenterRW = new JPanel();
				Look.cambiarColorPanel(panelCenterRW, Color.WHITE);
				getContentPane().add(panelCenterRW, BorderLayout.CENTER);
				panelCenterRW.setLayout(new GridLayout(6, 1, 0, 3));
				
				
				JPanel panelBlancoRW = new JPanel();
				panelBlancoRW.setSize(700, 100);
				Look.cambiarColorPanel(panelBlancoRW, Color.WHITE, Color.BLACK);
				panelCenterRW.add(panelBlancoRW);
				
				JLabel subtituloRW1 = new JLabel("Tipos de Torneos");
			    Look.fontPalabrasRW(subtituloRW1, "Futura", Font.BOLD, 14, Color.BLACK);
			    panelBlancoRW.add(subtituloRW1);
			    
			    setBounds(100, 100, 450, 300);
			    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				JButton btnTorneoBaloncesto = new JButton("Torneo de Baloncesto");
				btnTorneoBaloncesto.setBorder(new BevelBorder(BevelBorder.RAISED));
				Look.fontBotonesRW(btnTorneoBaloncesto, "New Times Roman", Font.PLAIN, 14, Color.BLACK);
				Look.cambiarColorBoton(btnTorneoBaloncesto, azulClaroRW, Color.BLACK);
				panelCenterRW.add(btnTorneoBaloncesto);
				
				JButton btnTorneoFutbol = new JButton("Torneo de Fútbol");
				btnTorneoFutbol.setBorder(new BevelBorder(BevelBorder.RAISED));
				Look.fontBotonesRW(btnTorneoFutbol, "New Times Roman", Font.PLAIN, 14, Color.BLACK);
				Look.cambiarColorBoton(btnTorneoFutbol, azulClaroRW, Color.BLACK);
				panelCenterRW.add(btnTorneoFutbol);
				
				JButton btnTorneoPetanca = new JButton("Torneo de Petanca");
				btnTorneoPetanca.setBorder(new BevelBorder(BevelBorder.RAISED));
				Look.fontBotonesRW(btnTorneoPetanca, "New Times Roman", Font.PLAIN, 14, Color.BLACK);
				Look.cambiarColorBoton(btnTorneoPetanca, azulClaroRW, Color.BLACK);
				panelCenterRW.add(btnTorneoPetanca);
				
				JButton btnTorneoCOD = new JButton("Torneo de COD");
				btnTorneoCOD.setBorder(new BevelBorder(BevelBorder.RAISED));
				Look.fontBotonesRW(btnTorneoCOD, "New Times Roman", Font.PLAIN, 14, Color.BLACK);
				Look.cambiarColorBoton(btnTorneoCOD, azulClaroRW, Color.BLACK);
				panelCenterRW.add(btnTorneoCOD);
				
				JButton btnTorneoChapas = new JButton("Torneo de Chapas");
				btnTorneoChapas.setBorder(new BevelBorder(BevelBorder.RAISED));
				Look.fontBotonesRW(btnTorneoChapas, "New Times Roman", Font.PLAIN, 14, Color.BLACK);
				Look.cambiarColorBoton(btnTorneoChapas, azulClaroRW, Color.BLACK);
				panelCenterRW.add(btnTorneoChapas);
				
				
			    setVisible(true);
			    
			    
			    
		}
}

