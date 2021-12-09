package Pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Juego extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton turno = new JButton();
	JButton menu = new JButton();
	JPanel imagen = new JPanel(); //panel para la imagen de un bingo
	JPanel bingo = new JPanel();  //panel para el area de las fichas
	ImageIcon tablero = new ImageIcon( new ImageIcon( "Img/Tablero.png" ).getImage().getScaledInstance(350, 400, Image.SCALE_DEFAULT)); //imagen del tablero
	JLabel tableroLbl = new JLabel(); //area donde dibujar el tablero
	
	//imagen bingo
	ImageIcon bingoImg = new ImageIcon( new ImageIcon( "Img/Bingo.png" ).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
	JLabel bingoLabel = new JLabel();
	
	//icono
	ImageIcon icono = new ImageIcon( "Img/Icono.png" );
	
	
	//mazo de cartas
	Mazo mazo = new Mazo();
	
	//contador de eventos
	int contadorDeEventos = 0;
	
	//icono turno
	ImageIcon iconoTurno = new ImageIcon("Img/Jugar.png");
	
	//icono menu 
	ImageIcon iconoMenu = new ImageIcon("Img/Menu.png");
	
	JLayeredPane capas = new JLayeredPane(); //administra las capas
	
	//fichas
	ImageIcon ficha11 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha12 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha13 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha14 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha21 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha22 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha23 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha24 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha31 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha32 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha33 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha34 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha41 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha42 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha43 = new ImageIcon( "Img/Estrella.png" );
	ImageIcon ficha44 = new ImageIcon( "Img/Estrella.png" );
	
	//area para dibujar las fichas
	JLabel FichaLbl11 = new JLabel( ficha11 );
	JLabel FichaLbl12 = new JLabel( ficha12 );
	JLabel FichaLbl13 = new JLabel( ficha13 );
	JLabel FichaLbl14 = new JLabel( ficha14 );
	JLabel FichaLbl21 = new JLabel( ficha21 );
	JLabel FichaLbl22 = new JLabel( ficha22 );
	JLabel FichaLbl23 = new JLabel( ficha23 );
	JLabel FichaLbl24 = new JLabel( ficha24 );
	JLabel FichaLbl31 = new JLabel( ficha31);
	JLabel FichaLbl32 = new JLabel( ficha32 );
	JLabel FichaLbl33 = new JLabel( ficha33 );
	JLabel FichaLbl34 = new JLabel( ficha34 );
	JLabel FichaLbl41 = new JLabel( ficha41 );
	JLabel FichaLbl42 = new JLabel( ficha42 );
	JLabel FichaLbl43 = new JLabel( ficha43 );
	JLabel FichaLbl44 = new JLabel( ficha44 );
	
	
	
	Juego(){
		//Configuracion de la capa de tablero
		tableroLbl.setIcon(tablero);
		tableroLbl.setBounds(0, 0, 350, 400);
	
		//configuracion de la imagen bingo
		bingoLabel.setIcon(bingoImg);
		bingoLabel.setBounds(0, 0, 300, 300);
		
		//configuracion de las fichas
		
		//primer fila
		FichaLbl11.setBounds(10, 10,65,65);
		FichaLbl11.setVisible(false);
		
		FichaLbl12.setBounds(100, 10,65,65);
		FichaLbl12.setVisible(false);
		
		FichaLbl13.setBounds(190, 10,65,65);
		FichaLbl13.setVisible(false);
		
		FichaLbl14.setBounds(270, 10,65,65);
		FichaLbl14.setVisible(false);
		
		//segunda fila
		FichaLbl21.setBounds(10, 110,65,65);
		FichaLbl21.setVisible(false);
		
		FichaLbl22.setBounds(100, 110,65,65);
		FichaLbl22.setVisible(false);
		
		FichaLbl23.setBounds(190, 110,65,65);
		FichaLbl23.setVisible(false);
		
		FichaLbl24.setBounds(270, 110,65,65);
		FichaLbl24.setVisible(false);
		
		//terce fila
		FichaLbl31.setBounds(10, 210,65,65);
		FichaLbl31.setVisible(false);
		
		FichaLbl32.setBounds(100, 210,65,65);
		FichaLbl32.setVisible(false);
		
		FichaLbl33.setBounds(190, 210,65,65);
		FichaLbl33.setVisible(false);
		
		FichaLbl34.setBounds(270, 210,65,65);
		FichaLbl34.setVisible(false);
		
		//cuarta fila
		FichaLbl41.setBounds(10, 310,65,65);
		FichaLbl41.setVisible(false);
		
		FichaLbl42.setBounds(100, 310,65,65);
		FichaLbl42.setVisible(false);
		
		FichaLbl43.setBounds(190, 310,65,65);
		FichaLbl43.setVisible(false);
		
		FichaLbl44.setBounds(270, 310,65,65);
		FichaLbl44.setVisible(false);
		
		
		
		
		//configuracion del administrador de capas
		capas.setBounds(0,0, 350, 400);
		capas.add(tableroLbl, Integer.valueOf(0));
		capas.add(FichaLbl11, Integer.valueOf(1));
		capas.add(FichaLbl12, Integer.valueOf(1));
		capas.add(FichaLbl13, Integer.valueOf(1));
		capas.add(FichaLbl14, Integer.valueOf(1));
		//segunda fila
		capas.add(FichaLbl21, Integer.valueOf(1));
		capas.add(FichaLbl22, Integer.valueOf(1));
		capas.add(FichaLbl23, Integer.valueOf(1));
		capas.add(FichaLbl24, Integer.valueOf(1));
		//tercer fila
		capas.add(FichaLbl31, Integer.valueOf(1));
		capas.add(FichaLbl32, Integer.valueOf(1));
		capas.add(FichaLbl33, Integer.valueOf(1));
		capas.add(FichaLbl34, Integer.valueOf(1));
		//cuarta fila
		capas.add(FichaLbl41, Integer.valueOf(1));
		capas.add(FichaLbl42, Integer.valueOf(1));
		capas.add(FichaLbl43, Integer.valueOf(1));
		capas.add(FichaLbl44, Integer.valueOf(1));
		
		//boton turno
		turno.setText("Turno!");
		turno.setBounds(600, 500, 150, 50);
		turno.setIcon(iconoTurno);
		turno.addActionListener(this);
		turno.setFocusable(false);
		turno.setLayout(null);
		turno.setFont( new Font("Impact", Font.PLAIN, 16) );
		turno.setIconTextGap(10);
		turno.setBackground( new Color(106, 176, 76) );
		turno.setBorder( BorderFactory.createEtchedBorder() );
		
		//boton menu
		menu.setText("Menu");
		menu.setBounds(50, 500, 150, 50);
		menu.setIcon(iconoMenu);
		menu.addActionListener(this);
		menu.setFocusable(false);
		menu.setLayout(null);
		menu.setFont( new Font("Impact", Font.PLAIN, 16) );
		menu.setIconTextGap(10);
		menu.setBackground( new Color(106, 176, 76) );
		menu.setBorder( BorderFactory.createEtchedBorder() );
		
		
		//panel bingo
		bingo.setBackground(new Color(106, 176, 76));
		bingo.setBounds(400, 80, 350, 400 );
		bingo.setLayout(null);
		bingo.add(capas);
		
		
		//panel imagen
		imagen.setBackground(new Color(106, 176, 76));
		imagen.setBounds(50, 100, 300, 300 );
		imagen.setLayout(null);
		imagen.add(bingoLabel);
		
		//agregar paneles
		this.add(imagen);
		this.add(bingo);
		this.add(turno);
		this.add(menu);
		
		
		//frame
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
		if( e.getSource() == turno ) {
			Carta carta = mazo.siguienteCarta();
			carta.mostrarCarta();	
		}
		else if( e.getSource() == menu ) {
			this.dispose();
			new Menu();
		}
	}
	
	
	public void funciones() {
		if(contadorDeEventos == 1) {	
			//mostrar pantalla de fallar
			new PantallaFallar();
		}
		else if( contadorDeEventos == 2 ) {
			new NumeroAleatorio(1,1);
			FichaLbl11.setVisible(true);
		}
		
		else if( contadorDeEventos == 3 ) {
			new NumeroAleatorio(3,3);
			FichaLbl33.setVisible(true);
		}
		
		else if( contadorDeEventos == 4 ) {
			new NumeroAleatorio(1,3);
			FichaLbl13.setVisible(true);
		}
		
		else if( contadorDeEventos == 5 ) {
			new NumeroAleatorio(4,2);
			FichaLbl42.setVisible(true);
		}
		
		else if( contadorDeEventos == 6 ) {
			new NumeroAleatorio(1,2);
			FichaLbl12.setVisible(true);
		}
		
		else if( contadorDeEventos == 7 ) {
			new NumeroAleatorio(2,4);
			FichaLbl24.setVisible(true);
		}
		
		else if( contadorDeEventos == 8 ) {
			new NumeroAleatorio(1,4);
			FichaLbl14.setVisible(true);
			new PantallaGanaste();
		}
		
		else if( contadorDeEventos == 9 ) {
			
		}
	}
	
	//inner class carta
	public class Carta implements ActionListener{
		public boolean seleccionado = false;
		
		JFrame cartaFrame = new JFrame();
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
		}
		
		public void mostrarCarta(){
			
			//configuracion frame de la carta
			cartaFrame.repaint();
			cartaFrame.setTitle("Pregunta!!!");
			cartaFrame.setSize(300, 600);
			cartaFrame.setResizable(false);
			cartaFrame.setLayout(null);
			cartaFrame.getContentPane().setBackground( new Color( 186, 220, 88) );
			
			
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
			cartaFrame.add(preguntaLbl);
			cartaFrame.add(respuesta1Btn);
			cartaFrame.add(respuesta2Btn);
			cartaFrame.add(respuesta3Btn);
			
			
			cartaFrame.setVisible(true);
			cartaFrame.repaint();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == respuesta1Btn ) {
				contadorDeEventos++;
				funciones();
				seleccionado = true;
				cartaFrame.dispose();
			} 
			else if(e.getSource() == respuesta2Btn ) {
				contadorDeEventos++;
				funciones();
				seleccionado = true;
				cartaFrame.dispose();
			} 
			else if(e.getSource() == respuesta3Btn ) {
				contadorDeEventos++;
				funciones();
				seleccionado = true;
				cartaFrame.dispose();
			} 
		}

	}
	
	//inner class mazo
	public class Mazo {
		LinkedList<Carta> mazo = new LinkedList<Carta>();
		
		Mazo(){
			mazo.add(new Carta("Es la  Proteína presente en los pelos, uñas y cuernos de los animales.", "Queratina", "Elastina", "Colágeno", 2 ) );
			
			mazo.add(new Carta("<html>¿Cuál es la parte del cuerpo <br/>humano donde hay más huesos?</html>", "la mano.", "la espalda.", "el pie.", 2 ) );
			
			mazo.add(new Carta("<html>¿Cómo se clasifican los animales <br/>según tengan columna vertebral o no?</html>", "Animales ovíparos o vivíparos.", "Animales vertebrados y animales invertebrados.", "Animales carnívoros, herbívoros u omnívoros.", 2 ) );
			
			mazo.add(new Carta("<html>¿Qué variedad de tejido conjuntivo <br/>tiene gran capacidad de estiramiento y recuperación ante las tracciones?</html>", "El fibroso", "El reticular", "El elástico", 2 ) );
			
			mazo.add(new Carta("<html>¿Qué hormonas vegetales hay que <br/>emplear para estimular la germinación de una semilla?</html>", "Auxinas", "Giberelinas ", "Citoquininas", 2 ) );
			
			mazo.add(new Carta("<html>Coordina los movimientos y <br/>postura del cuerpo.</html>", "Cerebelo ", "Cerebro", "Medula espinal", 2 ) );
			
			mazo.add(new Carta("<html>Cuál de los siguientes términos <br/>tiene que ver con los <br/>cloroplastos:</html>", "Crestas", "Matriz", "Tilacoide ", 2 ) );
			
			mazo.add(new Carta("<html>¿Qué utilizan los peces <br/>para respirar?</html>", "Pulmones", "La boca", "Branquias", 2 ) );
			
			mazo.add(new Carta("<html>¿Cuál de los siguientes elementos<br/> químicos NO es un bioelemento?</html>", "Helio ", "Cobalto", "Zinc", 2 ) );
			
			mazo.add(new Carta("<html>Es la biomolécula más abundante<br/> en los seres vivos.</html>", "Glucosa", "Lípidos", "Proteínas", 2 ) );
			
			mazo.add(new Carta("<html>Es la biomolécula que contiene<br/> la información genética<br/> de cada ser vivo.</html>", "Carbohidratos", "ADN ", "Lípidos", 2 ) );
		}
		
		public Carta siguienteCarta() {
			return mazo.pollFirst();
		}

	}
	
	
	
	
}


