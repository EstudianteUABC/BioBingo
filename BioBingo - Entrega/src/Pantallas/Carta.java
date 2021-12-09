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

public class Carta extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	//icono
	ImageIcon icono = new ImageIcon( "Img/Icono.png" );
	
	
	public boolean seleccionado = false;
	
	JLabel preguntaLbl = new JLabel();
	JButton respuesta1Btn = new JButton();
	JButton respuesta2Btn = new JButton();
	JButton respuesta3Btn = new JButton();
	
	
	String pregunta;
	String respuesta1;
	String respuesta2;
	String respuesta3;
	
	int respuestaCorrecta;
	int respuestaSeleccionada;
	
	
	//se ingresan las tres respuestas en el oreden que quieren que se muestre
	//al final se pone el numero de la respuesta correcta
	//este numero se compara con la respuesta seleccionada, se regresa que fue correcta
	public Carta(String pregunta, String respuesta1, String respuesta2, String respuesta3, int respuestaCorrecta){
		this.pregunta = pregunta;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.respuestaCorrecta = respuestaCorrecta;
		this.setLocationRelativeTo(null);
	}
	
	public void mostrarCarta(){
		
		//configuracion frame de la carta
		this.setTitle("Pregunta!!!");
		this.setSize(300, 600);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground( new Color( 186, 220, 88) );
		this.setLocationRelativeTo(null);
		
		
		//Configuracion label de la pregunta
		preguntaLbl.setText(pregunta);
		preguntaLbl.setBounds(10, 10, 300, 200);
		preguntaLbl.setFont( new Font("Impact", Font.PLAIN, 16) );
		
		
		//Configuracion del boton de respuesta 1
		respuesta1Btn.setText(respuesta1);
		respuesta1Btn.setBounds(50, 250, 200, 50);
		respuesta1Btn.addActionListener(this);
		respuesta1Btn.setFocusable(false);
		respuesta1Btn.setLayout(null);
		respuesta1Btn.setFont( new Font("Impact", Font.PLAIN, 16) );
		respuesta1Btn.setIconTextGap(10);
		respuesta1Btn.setBackground( new Color(106, 176, 76) );
		respuesta1Btn.setBorder( BorderFactory.createEtchedBorder() );
		
		respuesta2Btn.setText(respuesta2);
		respuesta2Btn.setBounds(50, 350, 200, 50);
		respuesta2Btn.addActionListener(this);
		respuesta2Btn.setFocusable(false);
		respuesta2Btn.setLayout(null);
		respuesta2Btn.setFont( new Font("Impact", Font.PLAIN, 16) );
		respuesta2Btn.setIconTextGap(10);
		respuesta2Btn.setBackground( new Color(106, 176, 76) );
		respuesta2Btn.setBorder( BorderFactory.createEtchedBorder() );
		
		respuesta3Btn.setText(respuesta3);
		respuesta3Btn.setBounds(50, 450, 200, 50);
		respuesta3Btn.addActionListener(this);
		respuesta3Btn.setFocusable(false);
		respuesta3Btn.setLayout(null);
		respuesta3Btn.setFont( new Font("Impact", Font.PLAIN, 16) );
		respuesta3Btn.setIconTextGap(10);
		respuesta3Btn.setBackground( new Color(106, 176, 76) );
		respuesta3Btn.setBorder( BorderFactory.createEtchedBorder() );
		
		
		//agregando los elementos al frame de la carta
		this.add(preguntaLbl);
		this.add(respuesta1Btn);
		this.add(respuesta2Btn);
		this.add(respuesta3Btn);
		
		
		this.setVisible(true);
		
		this.setIconImage( icono.getImage() );
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == respuesta1Btn ) {
			seleccionado = true;
			this.dispose();
		} 
		else if(e.getSource() == respuesta2Btn ) {
			seleccionado = true;
			this.dispose();
		} 
		else if(e.getSource() == respuesta3Btn ) {
			seleccionado = true;
			this.dispose();
		} 
	}

}
