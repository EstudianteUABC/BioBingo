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

public class NumeroAleatorio extends JFrame implements ActionListener{
	
	//boton intento
	JButton continuar = new JButton();
	
	NumeroAleatorio(int num1, int num2 ){
			//icono
			ImageIcon icono = new ImageIcon( "Img/Icono.png" );
		
			JLabel n1 = new JLabel();
			JLabel n2 = new JLabel();
			
			
			//boton siguiente intento
			continuar.setText("Continuar!");
			continuar.setBounds(180, 280, 200, 50);
			continuar.addActionListener(this);
			continuar.setFocusable(false);
			continuar.setLayout(null);
			continuar.setFont( new Font("Impact", Font.PLAIN, 16) );
			continuar.setIconTextGap(10);
			continuar.setBackground( new Color(106, 176, 76) );
			continuar.setBorder( BorderFactory.createEtchedBorder() );
			
			//label de n1
			n1.setBounds(230, 90, 200, 200);	
			n1.setText(Integer.toString(num1));
			n1.setFont(new Font("Impact", Font.PLAIN, 80));
			
			//label texto
			n2.setBounds(300, 90, 200, 200 );	
			n2.setText(Integer.toString(num2));
			n2.setFont(new Font("Impact", Font.PLAIN, 80));
			
			//agregar elementos
			this.add(n1);
			this.add(n2);
			this.add(continuar);
			
			//configuracion del frame
			this.setIconImage(icono.getImage());
			this.setLayout(null);
			this.setSize(600, 400);
			this.setResizable(false);
			this.getContentPane().setBackground( new Color( 186, 220, 88) );
			this.setVisible(true);
			this.setLocationRelativeTo(null);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == continuar ) {
			this.dispose();
		}
		
	}
}
