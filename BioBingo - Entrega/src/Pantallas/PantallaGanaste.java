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

public class PantallaGanaste  extends JFrame implements ActionListener{
	
	//boton ir al menu
	JButton irMenu = new JButton();
	
	PantallaGanaste(){
		//icono
		ImageIcon icono = new ImageIcon( "Img/Icono.png" );
		
		
		JLabel texto = new JLabel();
		JLabel descripcion = new JLabel();
		
		
		//boton siguiente intento
		irMenu.setText("Volver al menu!");
		irMenu.setBounds(280, 400, 200, 50);
		irMenu.addActionListener(this);
		irMenu.setFocusable(false);
		irMenu.setLayout(null);
		irMenu.setFont( new Font("Impact", Font.PLAIN, 16) );
		irMenu.setIconTextGap(10);
		irMenu.setBackground( new Color(106, 176, 76) );
		irMenu.setBorder( BorderFactory.createEtchedBorder() );
		
		//label descripcion
		descripcion.setBounds(190, 200, 500, 200);	
		descripcion.setText("Intenta con otro nivel de dificultad.");
		descripcion.setFont(new Font("Impact", Font.PLAIN, 25));
		
		//label texto
		texto.setBounds(280, 100, 300, 300 );	
		texto.setText("Ganaste!");
		texto.setFont(new Font("Impact", Font.PLAIN, 50));
		
		//agregar elementos
		this.add(texto);
		this.add(descripcion);
		this.add(irMenu);
		
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
		if( e.getSource() == irMenu ) {
			this.dispose();
			new Menu();
		}
		
	}

}