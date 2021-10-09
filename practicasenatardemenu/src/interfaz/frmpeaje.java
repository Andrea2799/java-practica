package interfaz;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;

public class frmpeaje extends JInternalFrame implements ActionListener {
	private JButton btnresultados;
	private JButton btnprocesar;
	private JTextField txtcantidad;
	
	 
	
	int cant=0;
	int cantbus=0, cantpasbus=0, cantvehi=0;
	private JTextField txtcantidad1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmpeaje frame = new frmpeaje();
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
	public frmpeaje() {
		setTitle("formulario de peaje");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 351, 167);
		getContentPane().setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("recaudo del peaje");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("tipo vehiculo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		getContentPane().add(lblNewLabel_2);
		
		JComboBox cmcombo = new JComboBox();
		cmcombo.setToolTipText("");
		getContentPane().add(cmcombo);
		cmcombo.addItem("Automovil");
		cmcombo.addItem("Bus");
		
		
		
		JLabel lblNewLabel_3 = new JLabel("cantidad de pasajeros");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		getContentPane().add(lblNewLabel_3);
		
		JButton btnprocesar = new JButton("procesar");
		btnprocesar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				if(cant<5) {
					
					  if (cmcombo.getSelectedItem().equals("Bus")) {
						  
						  cantbus++;
						  cantpasbus += Integer.parseInt(txtcantidad1.getText());
					  }
					  else {
						  
						  cantvehi++;
					  }
					cant++;
				}
				else {
					
					JOptionPane.showMessageDialog(null, "proceso ya los 5 registros");
				}
				
			}
		});
		
		txtcantidad1 = new JTextField();
		getContentPane().add(txtcantidad1);
		txtcantidad1.setColumns(10);
		getContentPane().add(btnprocesar);
		
		btnresultados = new JButton("resultados");
		btnresultados.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				

			JOptionPane.showMessageDialog(null, "Cantidad de buses: "+ cantbus + "\n" 
			+ "Cantidad de pasajeros: "+ cantpasbus +"\n"+
			"Cantidad de vehiculos: "+cantvehi);
				
			}
		});
		btnresultados.addActionListener(this);
		getContentPane().add(btnresultados);
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnresultados) {
			actionPerformedBtnresultados(e);
		}
	}
	protected void actionPerformedBtnresultados(ActionEvent e) {
	}
}
