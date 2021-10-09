package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class frmprincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnarchivo;
	private JMenuItem peaje;
	public static JDesktopPane escritorio;
	private JMenuItem mnregistros;
	private JMenuItem mncheck;
	private JMenuItem mntmNewMenuItem;
	private JLabel lblsena;
	private JMenuItem mntmNewMenuItem_1;
	private JMenu mnvector;
	private JMenuItem mnivector1;
	private JMenuItem mnivector2;
	private JMenuItem mnivector3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmprincipal frame = new frmprincipal();
					frame.setExtendedState(MAXIMIZED_BOTH);
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmprincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmprincipal.class.getResource("/imagenes/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 310);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnarchivo = new JMenu("Archivo");
		menuBar.add(mnarchivo);
		
		peaje = new JMenuItem("peaje");
		peaje.setIcon(new ImageIcon(frmprincipal.class.getResource("/imagenes/dollar.png")));
		peaje.addActionListener(this);
		mnarchivo.add(peaje);
		
		mnregistros = new JMenuItem("Registros");
		mnregistros.setIcon(new ImageIcon(frmprincipal.class.getResource("/imagenes/check.png")));
		mnregistros.addActionListener(this);
		mnarchivo.add(mnregistros);
		
		mncheck = new JMenuItem("Check");
		mncheck.setIcon(new ImageIcon(frmprincipal.class.getResource("/imagenes/registro.png")));
		mncheck.addActionListener(this);
		mnarchivo.add(mncheck);
		
		mntmNewMenuItem = new JMenuItem("Combo y list");
		mntmNewMenuItem.setIcon(new ImageIcon(frmprincipal.class.getResource("/imagenes/combo.png")));
		mntmNewMenuItem.addActionListener(this);
		mnarchivo.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("EPS");
		mntmNewMenuItem_1.setIcon(new ImageIcon(frmprincipal.class.getResource("/imagenes/eps.png")));
		mntmNewMenuItem_1.addActionListener(this);
		mnarchivo.add(mntmNewMenuItem_1);
		
		mnvector = new JMenu("Vector");
		menuBar.add(mnvector);
		
		mnivector1 = new JMenuItem("Vector 1");
		mnivector1.setHorizontalAlignment(SwingConstants.CENTER);
		mnvector.add(mnivector1);
		
		mnivector2 = new JMenuItem("Vector 2");
		mnivector2.addActionListener(this);
		mnivector2.setHorizontalAlignment(SwingConstants.CENTER);
		mnvector.add(mnivector2);
		
		mnivector3 = new JMenuItem("Vector 3");
		mnivector3.setHorizontalAlignment(SwingConstants.CENTER);
		mnvector.add(mnivector3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		escritorio = new JDesktopPane();
		escritorio.setBackground(Color.DARK_GRAY);
		contentPane.add(escritorio, "name_522910071199400");
		escritorio.setLayout(null);
		
		lblsena = new JLabel("New label");
		lblsena.setIcon(new ImageIcon(frmprincipal.class.getResource("/imagenes/sena.png")));
		lblsena.setBounds(59, 0, 279, 239);
		escritorio.add(lblsena);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mnivector2) {
			actionPerformedMnivector2(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
		if (e.getSource() == mncheck) {
			actionPerformedMncheck(e);
		}
		if (e.getSource() == mnregistros) {
			actionPerformedMnregistros(e);
		}
		if (e.getSource() == peaje) {
			actionPerformedPeaje(e);
		}
	}
	protected void actionPerformedPeaje(ActionEvent e) {
		
		frmpeaje frmpeajever= new frmpeaje();
		escritorio.add(frmpeajever);
		frmpeajever.setVisible(true);
		
	}
	protected void actionPerformedMnregistros(ActionEvent e) {
		
		frmejercisio2 frmejer2= new frmejercisio2();
		escritorio.add(frmejer2);
		frmejer2.setVisible(true);
	
	}
	protected void actionPerformedMncheck(ActionEvent e) {
		
		frmcheck frmecheckver= new frmcheck();
		escritorio.add( frmecheckver);
		 frmecheckver.setVisible(true);
	
	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
		frmcombolist frmcombolistver = new frmcombolist();
		escritorio.add(frmcombolistver);
		frmcombolistver.setVisible(true);
		
	}
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
		frmeps frmepsver = new frmeps();
		escritorio.add(frmepsver);
		frmepsver.setVisible(true);
		
	}
	protected void actionPerformedMnivector2(ActionEvent e) {
		
		frmvector2 frmvectorver= new frmvector2();
		escritorio.add(frmvectorver);
		frmvectorver.setVisible(true);
		
	}
}
