package Pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PantallaFallar extends JFrame implements ActionListener{
	
	//icono
	ImageIcon icono = new ImageIcon( "Img/Icono.png" );
	
	
	//boton intento
	JButton intento = new JButton();
	
	PantallaFallar(){
		JLabel texto = new JLabel();
		JLabel descripcion = new JLabel();
		
		
		//boton siguiente intento
		intento.setText("Intentar de nuevo");
		intento.setBounds(280, 400, 200, 50);
		intento.addActionListener(this);
		intento.setFocusable(false);
		intento.setLayout(null);
		intento.setFont( new Font("Impact", Font.PLAIN, 16) );
		intento.setIconTextGap(10);
		intento.setBackground( new Color(106, 176, 76) );
		intento.setBorder( BorderFactory.createEtchedBorder() );
		
		//label descripcion
		descripcion.setBounds(190, 200, 500, 200);	
		descripcion.setText("No seleccionaste la opcion correcta.");
		descripcion.setFont(new Font("Impact", Font.PLAIN, 25));
		
		//label texto
		texto.setBounds(280, 100, 300, 300 );	
		texto.setText("Fallaste!");
		texto.setFont(new Font("Impact", Font.PLAIN, 50));
		
		//agregar elementos
		this.add(texto);
		this.add(descripcion);
		this.add(intento);
		
		//configuracion del frame
		this.setIconImage(icono.getImage());
		this.setLayout(null);
		this.setSize(800, 600);
		this.setResizable(false);
		this.getContentPane().setBackground( new Color( 186, 220, 88) );
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == intento ) {
			this.dispose();
		}
		
	}

}
