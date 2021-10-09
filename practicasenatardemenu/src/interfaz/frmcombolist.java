package interfaz;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmcombolist extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField txtdatos;
	private JLabel lblNewLabel_1;
	private JComboBox cmbcolores;
	private JLabel lblNewLabel_2;
	private JList lstcolores;
	private JButton btnagregar;
	private JButton btneliminar;
	private JButton btnseleccion;
	private JButton btnlimpiar;
	
	DefaultListModel modelo = new DefaultListModel();
	private JButton btnvector;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmcombolist frame = new frmcombolist();
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
	public frmcombolist() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		
		setBounds(100, 100, 373, 222);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Datos");
		lblNewLabel.setBounds(26, 25, 46, 14);
		getContentPane().add(lblNewLabel);
		
		txtdatos = new JTextField();
		txtdatos.setBounds(78, 22, 92, 20);
		getContentPane().add(txtdatos);
		txtdatos.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Colores");
		lblNewLabel_1.setBounds(26, 59, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		cmbcolores = new JComboBox();
		cmbcolores.setBounds(78, 55, 92, 22);
		getContentPane().add(cmbcolores);
		
		lblNewLabel_2 = new JLabel("Colores");
		lblNewLabel_2.setBounds(26, 93, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		lstcolores = new JList();
		lstcolores.setBounds(78, 88, 92, 78);
		getContentPane().add(lstcolores);
		
		btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(this);
		btnagregar.setBounds(240, 21, 89, 23);
		getContentPane().add(btnagregar);
		
		btneliminar = new JButton("Eliminar");
		btneliminar.addActionListener(this);
		btneliminar.setBounds(240, 55, 89, 23);
		getContentPane().add(btneliminar);
		
		btnseleccion = new JButton("Selecion");
		btnseleccion.addActionListener(this);
		btnseleccion.setBounds(240, 89, 89, 23);
		getContentPane().add(btnseleccion);
		
		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.addActionListener(this);
		btnlimpiar.setBounds(240, 119, 89, 23);
		getContentPane().add(btnlimpiar);
		
		btnvector = new JButton("Vector");
		btnvector.addActionListener(this);
		btnvector.setBounds(240, 153, 89, 23);
		getContentPane().add(btnvector);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnvector) {
			actionPerformedBtnvector(e);
		}
		if (e.getSource() == btnlimpiar) {
			actionPerformedBtnlimpiar(e);
		}
		if (e.getSource() == btnseleccion) {
			actionPerformedBtnseleccion(e);
		}
		if (e.getSource() == btneliminar) {
			actionPerformedBtneliminar(e);
		}
		if (e.getSource() == btnagregar) {
			actionPerformedBtnagregar(e);
		}
	}
	protected void actionPerformedBtnagregar(ActionEvent e) {
		
		String dato= txtdatos.getText();
		if (!dato.equals("")) 
		{
		
		cmbcolores.addItem(dato);
		modelo.addElement(dato);
		lstcolores.setModel(modelo);
		}
		
		
		txtdatos.setText("");
		
	}
	protected void actionPerformedBtneliminar(ActionEvent e) {
		
		int posicion, posicion1;
		 posicion = cmbcolores.getSelectedIndex(); // selectect index devuelve la posicion del combo
		 
		 posicion1 = lstcolores.getSelectedIndex();
		 if(posicion >=0) {
		 cmbcolores.removeItemAt(posicion);
		 
		 modelo.removeElementAt(posicion);
		 
		 JOptionPane.showMessageDialog(null, "registro elimindo", "informacion "
				 , JOptionPane.INFORMATION_MESSAGE);
	}
	
	else 
		JOptionPane.showMessageDialog(null,"no seleciono nada","error", JOptionPane.ERROR_MESSAGE );
}
	protected void actionPerformedBtnseleccion(ActionEvent e) {
		
		int posicion;
		String datoselec;
		datoselec=cmbcolores.getSelectedItem().toString();// el to string es para comvertirlo a string
		posicion = cmbcolores.getSelectedIndex();
		JOptionPane.showMessageDialog(null, "dato del combo " + datoselec+ "posicion " + posicion);
		datoselec= lstcolores.getSelectedValue().toString();
		posicion= lstcolores.getSelectedIndex();
		JOptionPane.showMessageDialog(null, "dato de la lista " + datoselec+ "posicion " + posicion);
	}
	protected void actionPerformedBtnlimpiar(ActionEvent e) {
		
		cmbcolores.removeAllItems();// elimina todo lo del combo
		modelo.clear(); //elimina todo lo de la lista
	}
	protected void actionPerformedBtnvector(ActionEvent e) {
		
		String [] colores = {"verde","gris","azul" };
		
		for(int i=0 ; i< colores.length ; i++) {
			
			modelo.addElement(colores[i]);
			lstcolores.setModel(modelo);
			cmbcolores.addItem(colores[i]);
			
		}
	}
}
