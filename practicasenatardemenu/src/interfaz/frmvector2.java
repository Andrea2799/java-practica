package interfaz;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class frmvector2 extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JTextField txtdatos;
	private JButton btnllenar;
	private JList lstcontenido;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JList lstresultado;
	private JButton btnimprimir;
	int tam= 9,pos=0 ;
	int [] vec1= new int[tam];
	DefaultListModel modelo = new DefaultListModel();
	DefaultListModel modelo1 = new DefaultListModel();
	private JComboBox cmbllenar;
	int suma=0,prom;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmvector2 frame = new frmvector2();
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
	public frmvector2() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 495, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("DATOS");
		lblNewLabel.setBounds(37, 81, 46, 14);
		getContentPane().add(lblNewLabel);
		
		txtdatos = new JTextField();
		txtdatos.setBounds(93, 78, 102, 20);
		getContentPane().add(txtdatos);
		txtdatos.setColumns(10);
		
		btnllenar = new JButton("llenar vector");
		btnllenar.addActionListener(this);
		btnllenar.setBounds(90, 122, 105, 23);
		getContentPane().add(btnllenar);
		
		lstcontenido = new JList();
		lstcontenido.setBounds(225, 38, 70, 195);
		getContentPane().add(lstcontenido);
		
		lblNewLabel_1 = new JLabel("contenido del vector");
		lblNewLabel_1.setBounds(215, 24, 115, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("resuldado");
		lblNewLabel_2.setBounds(359, 24, 70, 14);
		getContentPane().add(lblNewLabel_2);
		
		lstresultado = new JList();
		lstresultado.setBounds(322, 49, 147, 74);
		getContentPane().add(lstresultado);
		
		btnimprimir = new JButton("imprimir");
		btnimprimir.addActionListener(this);
		btnimprimir.setBounds(90, 156, 105, 23);
		getContentPane().add(btnimprimir);
		
		cmbllenar = new JComboBox();
		cmbllenar.setBounds(93, 35, 102, 22);
		getContentPane().add(cmbllenar);
		
		cmbllenar.addItem("aleatorio");
		cmbllenar.addItem("manual");
		
		
		
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnimprimir) {
			actionPerformedBtnimprimir(e);
		}
		
		if (e.getSource() == btnllenar) {
			actionPerformedBtnllenar(e);
		}
	}
	protected void actionPerformedBtnllenar(ActionEvent e) {
		String cmb;
		 
		
		if(pos <tam) {
		
		cmb= cmbllenar.getSelectedItem().toString();
		
		if(cmb.equals("aleatorio")){
			
			vec1[pos] = (int) (Math.random()*20)+1;
			modelo.addElement(vec1[pos]);
			lstcontenido.setModel(modelo);
			
		}
		
		
		else if(cmb.equals("manual")) {
		    
		
			vec1[pos]=Integer.parseInt(txtdatos.getText());
			btnllenar.setEnabled(true);
			modelo.addElement(vec1[pos]);
			lstcontenido.setModel(modelo);
		
			
		}
		suma= suma+vec1[pos];
		prom =suma/tam;
		System.out.println(+suma);
		System.out.println(+prom);
		txtdatos.setText("");
		pos++;
		
		}
		
		if  (pos==tam) {
			JOptionPane.showMessageDialog(null,"ya esta lleno el vector ");
			btnllenar.setEnabled(false);
			}
			
	}
	protected void actionPerformedBtnimprimir(ActionEvent e) {
		
		modelo1.addElement("la suma es: "+ suma );
		modelo1.addElement("el promedio  es: "+ prom );
		
		lstresultado.setModel(modelo1);
		btnimprimir.setEnabled(false);
	}
	
}
	
	
	
