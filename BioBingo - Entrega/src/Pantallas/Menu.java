package Pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame implements ActionListener{
	JButton botonFacil = new JButton();
	JButton botonNormal = new JButton();
	JButton botonDificil = new JButton();
	
	Menu(){
		
		//iconos
		ImageIcon iconoFacil = new ImageIcon(
				new ImageIcon("Img/Facil.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT) 
				);
		
		ImageIcon iconoNormal = new ImageIcon(
				new ImageIcon("Img/Normal.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT) 
				);
		
		ImageIcon iconoDificil = new ImageIcon(
				new ImageIcon("Img/Dificil.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT) 
				);
		
		//icono
		ImageIcon icono = new ImageIcon( "Img/Icono.png" );
		
		
		
		//boton facil
		botonFacil.setIcon(iconoFacil);
		botonFacil.setText("Facil" );
		botonFacil.setFocusable(false);
		botonFacil.setLayout(null);
		botonFacil.setFont( new Font("Impact", Font.PLAIN, 16) );
		botonFacil.setIconTextGap(10);
		botonFacil.setBackground( new Color(106, 176, 76) );
		botonFacil.setBorder( BorderFactory.createEtchedBorder() );
		botonFacil.setBounds(270, 100, 180, 50);
		botonFacil.addActionListener(this);
		
		
		//boton normal
		botonNormal.setIcon(iconoNormal);
		botonNormal.setText("Normal" );
		botonNormal.setFocusable(false);
		botonNormal.setLayout(null);
		botonNormal.setFont( new Font("Impact", Font.PLAIN, 16) );
		botonNormal.setIconTextGap(10);
		botonNormal.setBackground( new Color(106, 176, 76) );
		botonNormal.setBorder( BorderFactory.createEtchedBorder() );
		botonNormal.setBounds(270, 200, 180, 50);
		botonNormal.addActionListener(this);
		
		//boton dificil
		botonDificil.setIcon(iconoDificil);
		botonDificil.setText("Dificil" );
		botonDificil.setFocusable(false);
		botonDificil.setLayout(null);
		botonDificil.setFont( new Font("Impact", Font.PLAIN, 16) );
		botonDificil.setIconTextGap(10);
		botonDificil.setBackground( new Color(106, 176, 76) );
		botonDificil.setBorder( BorderFactory.createEtchedBorder() );
		botonDificil.setBounds(270, 300, 180, 50);
		botonDificil.addActionListener(this);
		
		
		//agregar botones
		this.add(botonFacil);
		this.add(botonNormal);
		this.add(botonDificil);
		
		this.setIconImage( icono.getImage() );
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(800, 600);
		this.setResizable(false);
		this.getContentPane().setBackground( new Color( 186, 220, 88) );
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == botonFacil ) {
			new Juego();
			this.dispose();
		}
		
		else if( e.getSource() == botonNormal ) {
			new Juego();
			this.dispose();
		}
		
		else if( e.getSource() == botonDificil ) {
			new Juego();
			this.dispose();
		}
	}
}
