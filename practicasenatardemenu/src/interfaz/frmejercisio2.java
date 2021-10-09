package interfaz;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmejercisio2 extends JInternalFrame implements ActionListener {
	private JLabel edad;
	private JTextField txtedad;
	private JLabel lblNewLabel;
	private JComboBox cmbsexo;
	private JLabel estatura;
	private JTextField txtestatura;
	private JLabel lblNewLabel_2;
	private JTextArea txtpeso;
	private JLabel estrato;
	private JComboBox cmbestrato;
	private JButton btnprocesar;
	private JButton btnresultados;
	int cante1=0,cante2=0,cante3=0,cante4=0,cant=0;
	int canthome=0,cantmu165=0, cantmue1y3=0;
	double suma180=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmejercisio2 frame = new frmejercisio2();
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
	public frmejercisio2() {
		setTitle("Registros");
		setBounds(100, 100, 331, 209);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		getContentPane().setLayout(new GridLayout(6, 2, 0, 0));
		
		edad = new JLabel("Edad");
		edad.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(edad);
		
		txtedad = new JTextField();
		getContentPane().add(txtedad);
		txtedad.setColumns(10);
		
		lblNewLabel = new JLabel("Sexo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		cmbsexo = new JComboBox();
		getContentPane().add(cmbsexo);
		cmbsexo.addItem("Mujer");
		cmbsexo.addItem("Hombre");
		
		estatura = new JLabel("Estatura");
		estatura.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(estatura);
		
		txtestatura = new JTextField();
		txtestatura.setText("");
		getContentPane().add(txtestatura);
		txtestatura.setColumns(10);
		
		lblNewLabel_2 = new JLabel("peso");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel_2);
		
		txtpeso = new JTextArea();
		txtpeso.setText("");
		getContentPane().add(txtpeso);
		
		estrato = new JLabel("Estrato");
		estrato.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(estrato);
		
		
		cmbestrato = new JComboBox();
		getContentPane().add(cmbestrato);
		cmbestrato.addItem("1");
		cmbestrato.addItem("2");
		cmbestrato.addItem("3");
		cmbestrato.addItem("4");
		
		btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(this);
		getContentPane().add(btnprocesar);
		
		btnresultados = new JButton("Resultados");
		btnresultados.addActionListener(this);
		getContentPane().add(btnresultados);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnresultados) {
			actionPerformedBtnresultados(e);
		}
		if (e.getSource() == btnprocesar) {
			actionPerformedBtnprocesar(e);
		}
	}
	protected void actionPerformedBtnprocesar(ActionEvent e) {
		
		int edad;
		String sexo,estrato;
		double estatura,peso;
		
		edad= Integer.parseInt(txtedad.getText());
		sexo=cmbsexo.getSelectedItem().toString();
		estrato=cmbestrato.getSelectedItem().toString();
		estatura=Double.parseDouble(txtestatura.getText());
		peso=Double.parseDouble(txtpeso.getText());
		
		if(cant<5) {
		cant++;
		
		if(estrato.equals("1")) 
			
			cante1++;
			
		
		else if(estrato.equals("2")) 
			
			cante2++;
		
       else if(estrato.equals("3")) {
			
			cante3++;
			
		if(sexo.equals("Hombre"))
				canthome++;
		}
		
       else 
	
	cante4++;

		
		if (sexo.equals("Hombre") && estatura>1.80) 
			suma180+= estatura;
		if (sexo.equals("Mujer") && estatura>1.80) 
			cantmu165++;
		if((estrato.equals("1")||estrato.equals("3")||sexo.equals("Mujer"))) 
			 cantmue1y3++;
		}
		else {
			JOptionPane.showMessageDialog(null,"proceso terminado");
			
			btnprocesar.setEnabled(false);
		}
		txtedad.setText("");
		txtestatura.setText("");
		txtpeso.setText("");//para que la informacion ingresada se borre y se pueda ingresar otra vez 
		
    }
		
		
	
	protected void actionPerformedBtnresultados(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null,"cantidad de personas estrato 1: "+cante1+ "\n"+
				"cantidad de personas estrato 2: "+ cante2 +"\n"+
				"cantidad de personas estrato 3: "+cante3+"\n"+
				"cantidad de personas estrato 4: "+cante4+"\n"+
				"cantidad de hombres estrato 3: "+canthome+"\n"+
				"suma de estatura de hombres mayores1,88: "+suma180+"\n"+
				"cantidad de mujeres con estatura minima de 1,65: "+cantmu165+"\n"+
				"cantidad de mujeres de los estratos 1 y 3: "+ cantmue1y3 +"\n");
	}
}
