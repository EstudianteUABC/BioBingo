package Pantallas;

import java.util.LinkedList;

import Pantallas.Juego.Carta;

public class Mazo {
	LinkedList<Carta> mazo = new LinkedList<Carta>();
	
	Mazo(){
		
		mazo.add(new Carta("Es la  Prote�na presente en los pelos, u�as y cuernos de los animales.", "Queratina", "Elastina", "Col�geno", 2 ) );
		
		mazo.add(new Carta("�Cu�l es la parte del cuerpo humano donde hay m�s huesos?", "la mano.", "la espalda.", "el pie.", 2 ) );
		
		mazo.add(new Carta(" �C�mo se clasifican los animales seg�n tengan columna vertebral o no?", "Animales ov�paros o viv�paros.", "Animales vertebrados y animales invertebrados.", "Animales carn�voros, herb�voros u omn�voros.", 2 ) );
		
		mazo.add(new Carta(" �Qu� variedad de tejido conjuntivo tiene gran capacidad de estiramiento y recuperaci�n ante las tracciones?", "El fibroso", "El reticular", "El el�stico", 2 ) );
		
		mazo.add(new Carta("�Qu� hormonas vegetales hay que emplear para estimular la germinaci�n de una semilla?", "Auxinas", "Giberelinas ", "Citoquininas", 2 ) );
		
		mazo.add(new Carta("Coordina los movimientos y postura del cuerpo.", "Cerebelo ", "Cerebro", "Medula espinal", 2 ) );
		
		mazo.add(new Carta("Cu�l de los siguientes t�rminos tiene que ver con los cloroplastos:", "Crestas", "Matriz", "Tilacoide ", 2 ) );
		
		mazo.add(new Carta("�Qu� utilizan los peces para respirar?", "Pulmones", "La boca", "Branquias", 2 ) );
		
		mazo.add(new Carta("�Cu�l de los siguientes elementos qu�micos NO es un bioelemento?", "Helio ", "Cobalto", "Zinc", 2 ) );
		
		mazo.add(new Carta("Es la biomol�cula m�s abundante en los seres vivos.", "Glucosa", "L�pidos", "Prote�nas", 2 ) );
		
		mazo.add(new Carta("Es la biomol�cula que contiene la informaci�n gen�tica de cada ser vivo.", "Carbohidratos", "ADN ", "L�pidos", 2 ) );
		
	}
	
	public Carta siguienteCarta() {
		return mazo.pollFirst();
	}

}
