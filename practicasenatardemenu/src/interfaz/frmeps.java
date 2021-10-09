package interfaz;

import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class frmeps extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JComboBox cmbcategoria;
	private JTextField txtpeso;
	private JComboBox cmbestrato;
	private JButton btnprocesar;
	private JButton btnresultados;
	private JComboBox cmbedad;
	private JRadioButton rdbmujer;
	private JRadioButton rdbhombre;
	private JRadioButton rdbx;
	private JRadioButton rdby;
	private JRadioButton rdbz;
	private JButton btncantidad;
	private JLabel lblNewLabel_6;
	private JList lstresultados;
	private ButtonGroup grupobotonessexo;
	private ButtonGroup grupobotonesenfer;
	private JTextField txtvalor;
	private JLabel lblNewLabel_7;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmeps frame = new frmeps();
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
	public frmeps() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 511, 251);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Categoria");
		lblNewLabel.setBounds(32, 32, 67, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setBounds(32, 74, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("sexo");
		lblNewLabel_2.setBounds(32, 115, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Peso");
		lblNewLabel_3.setBounds(251, 115, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Estrato");
		lblNewLabel_4.setBounds(251, 74, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Enfermedad");
		lblNewLabel_5.setBounds(230, 32, 67, 14);
		getContentPane().add(lblNewLabel_5);
		
		grupobotonesenfer = new ButtonGroup();
		grupobotonessexo = new ButtonGroup();
		
		cmbcategoria = new JComboBox();
		cmbcategoria.setBounds(97, 32, 81, 22);
		getContentPane().add(cmbcategoria);
		cmbcategoria.addItem("1");
		cmbcategoria.addItem("2");
		cmbcategoria.addItem("3");
		
		
		txtpeso = new JTextField();
		txtpeso.setBounds(290, 115, 86, 20);
		getContentPane().add(txtpeso);
		txtpeso.setColumns(10);
		txtpeso.setText("");
		
		cmbestrato = new JComboBox();
		cmbestrato.setBounds(303, 70, 73, 22);
		getContentPane().add(cmbestrato);
		cmbestrato.addItem("1");
		cmbestrato.addItem("2");
		cmbestrato.addItem("3");
		cmbestrato.addItem("4");
		
		btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(this);
		btnprocesar.setBounds(193, 184, 117, 25);
		getContentPane().add(btnprocesar);
		
		btnresultados = new JButton("Resultado");
		btnresultados.setBounds(315, 184, 117, 25);
		getContentPane().add(btnresultados);
		
		cmbedad = new JComboBox();
		cmbedad.setBounds(97, 70, 81, 22);
		getContentPane().add(cmbedad);
		cmbedad.addItem("1 a 20");
		cmbedad.addItem("hasta 25");
		cmbedad.addItem("desde 21");
		cmbedad.addItem("desde 21");
		cmbedad.addItem("de 21 a 40");
		
		
		rdbmujer = new JRadioButton("mujer");
		rdbmujer.setBounds(84, 111, 61, 23);
		getContentPane().add(rdbmujer);
		grupobotonessexo.add(rdbmujer);
		
		
		rdbhombre = new JRadioButton("hombre");
		rdbhombre.setBounds(149, 111, 67, 23);
		getContentPane().add(rdbhombre);
		grupobotonessexo.add(rdbhombre);
		
		rdbx = new JRadioButton("X");
		rdbx.setBounds(298, 28, 46, 23);
		getContentPane().add(rdbx);
		grupobotonesenfer.add(rdbx);
		
		rdby = new JRadioButton("Y");
		rdby.setBounds(346, 28, 45, 23);
		getContentPane().add(rdby);
		grupobotonesenfer.add(rdby);
		
		rdbz = new JRadioButton("Z");
		rdbz.setBounds(393, 28, 39, 23);
		getContentPane().add(rdbz);
		grupobotonesenfer.add(rdbz);
		
		btncantidad = new JButton("Cantidad");
		btncantidad.addActionListener(this);
		btncantidad.setBounds(66, 185, 117, 25);
		getContentPane().add(btncantidad);
		
		lblNewLabel_6 = new JLabel("Resultados");
		lblNewLabel_6.setBounds(411, 53, 67, 14);
		getContentPane().add(lblNewLabel_6);
		
		lstresultados = new JList();
		lstresultados.setEnabled(false);
		lstresultados.setBounds(393, 73, 85, 98);
		getContentPane().add(lstresultados);
		
		txtvalor = new JTextField();
		txtvalor.setBounds(92, 154, 86, 20);
		getContentPane().add(txtvalor);
		txtvalor.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Valor");
		lblNewLabel_7.setBounds(32, 157, 46, 14);
		getContentPane().add(lblNewLabel_7);
		
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnprocesar) {
			actionPerformedBtnprocesar(e);
		}
		if (e.getSource() == btncantidad) {
			actionPerformedBtncantidad(e);
		}
	}
	protected void actionPerformedBtncantidad(ActionEvent e) {
		
		int tam , cant;
		
	tam = Integer.parseInt(JOptionPane.showInputDialog("cuantos registros son"));
		
		if( tam > 0 ) {
			
			btnprocesar.setEnabled(true);
			btncantidad.setEnabled(false);
			
		}
		
	}
	protected void actionPerformedBtnprocesar(ActionEvent e) {
		
		int edad, sexo, peso, estrato, enfer, valor_con,cate;
		
		if(cmbcategoria.getSelectedItem().equals("2")&& (cmbestrato.getSelectedItem().equals("3")|| cmbestrato.getSelectedItem().equals("4")  && (rdby.isSelected()==true)
			//&& (cmbedad.getSelectedIndex("0")   )
				) ) {
			
			
			
		}
	}
}
