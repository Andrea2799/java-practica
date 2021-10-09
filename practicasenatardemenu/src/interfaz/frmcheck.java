package interfaz;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class frmcheck extends JInternalFrame implements ActionListener, ChangeListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JCheckBox chavion;
	private JRadioButton rbagua;
	private JCheckBox chtren;
	private JRadioButton rbte;
	private JCheckBox chcarro;
	private JRadioButton rbjugo;
	private JCheckBox chmoto;
	private JRadioButton rbotra;
	private JButton btnprocesar;
	private JButton btnimprimir;
	private ButtonGroup grupobotones;

	String cadena= "", bebida ="" ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmcheck frame = new frmcheck();
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
	public frmcheck() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 387, 262);
		getContentPane().setLayout(new GridLayout(6, 2, 0, 0));
		
		lblNewLabel_1 = new JLabel("controles");
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(lblNewLabel_1);
		
		
		
		lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		
		chavion = new JCheckBox("Avion");
		chavion.addChangeListener(this);
		getContentPane().add(chavion);
		
		grupobotones = new ButtonGroup();
		
		rbagua = new JRadioButton("Agua");
		rbagua.addChangeListener(this);
		getContentPane().add(rbagua);
		grupobotones.add(rbagua);
		
		
		chtren = new JCheckBox("Tren");
		chtren.addChangeListener(this);
		getContentPane().add(chtren);
		
		rbte = new JRadioButton("Te");
		rbte.addChangeListener(this);
		getContentPane().add(rbte);
		grupobotones.add(rbte);
		
		
		chcarro = new JCheckBox("Carro");
		chcarro.addChangeListener(this);
		getContentPane().add(chcarro);
		
		rbjugo = new JRadioButton("Jugo");
		rbjugo.addChangeListener(this);
		getContentPane().add(rbjugo);
		grupobotones.add(rbjugo);
		
		
		chmoto = new JCheckBox("Moto");
		chmoto.addChangeListener(this);
		getContentPane().add(chmoto);
		
		rbotra = new JRadioButton("Otra");
		rbotra.addChangeListener(this);
		getContentPane().add(rbotra);
		grupobotones.add(rbotra);
		
		
		btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(this);
		getContentPane().add(btnprocesar);
		
		btnimprimir = new JButton("Imprimir");
		btnimprimir.addActionListener(this);
		getContentPane().add(btnimprimir);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnimprimir) {
			actionPerformedBtnimprimir(e);
		}
		if (e.getSource() == btnprocesar) {
			actionPerformedBtnprocesar(e);
		}
	}
	protected void actionPerformedBtnprocesar(ActionEvent e)
	{
		
		cadena= "";
		
		if (chavion.isSelected()==true)
			
			cadena+= "Avion";
		
		if (chtren.isSelected()==true)
			
			cadena+= "Tren";
		
        if (chcarro.isSelected()==true)
			
			cadena+= "Carro";
        
        if (chmoto.isSelected()==true)
			
        	 cadena+= "moto";
       
        btnimprimir.setEnabled(true);
        
        bebida="";
        
        if (rbagua.isSelected()==true)
			
       	 bebida+= "agua";
        
        else if (rbte.isSelected()==true)
        	
        	bebida+="te";
        
       else if (rbjugo.isSelected()==true)
    	   
        	bebida+="jugo";
        
       else if (rbotra.isSelected()==true)
    	   
        	bebida+="otra";
       else
    	   bebida+="no selecciono ninguna bebida";
        
        
        
	}
	
	protected void actionPerformedBtnimprimir(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null,"usted va a aviajer en "+ cadena + "\n"+
		"su bebida selecionada es: " + bebida);
		
		//btnimprimir.setEnabled(false);
        
	}
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == rbotra) {
			stateChangedRbotra(e);
		}
		if (e.getSource() == rbjugo) {
			stateChangedRbjugo(e);
		}
		if (e.getSource() == rbte) {
			stateChangedRbte(e);
		}
		if (e.getSource() == rbagua) {
			stateChangedRbagua(e);
		}
		if (e.getSource() == chmoto) {
			stateChangedChmoto(e);
		}
		if (e.getSource() == chcarro) {
			stateChangedChcarro(e);
		}
		if (e.getSource() == chtren) {
			stateChangedChtren(e);
		}   
		

		cadena= "";
		
		if (chavion.isSelected()==true)
			
			cadena+= "Avion";
		
		if (chtren.isSelected()==true)
			
			cadena+= "Tren";
		
        if (chcarro.isSelected()==true)
			
			cadena+= "Carro";
        
        if (chmoto.isSelected()==true)
			
        	 cadena+= "moto";
       
        
        
        bebida="";
        
        if (rbagua.isSelected()==true)
			
       	 bebida+= "agua";
        
        else if (rbte.isSelected()==true)
        	
        	bebida+="te";
        
       else if (rbjugo.isSelected()==true)
    	   
        	bebida+="jugo";
        
       else if (rbotra.isSelected()==true)
    	   
        	bebida+="otra";
       else
    	   bebida+="no selecciono ninguna bebida";
        
        
		
		
	}
	protected void stateChangedChavion(ChangeEvent e) {
	}
	protected void stateChangedChtren(ChangeEvent e) {
	}
	protected void stateChangedChcarro(ChangeEvent e) {
	}
	protected void stateChangedChmoto(ChangeEvent e) {
	}
	protected void stateChangedRbagua(ChangeEvent e) {
	}
	protected void stateChangedRbte(ChangeEvent e) {
	}
	protected void stateChangedRbjugo(ChangeEvent e) {
	}
	protected void stateChangedRbotra(ChangeEvent e) {
	}
}
