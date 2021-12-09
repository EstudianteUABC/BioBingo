package Pantallas;

import java.util.LinkedList;

import Pantallas.Juego.Carta;

public class Mazo {
	LinkedList<Carta> mazo = new LinkedList<Carta>();
	
	Mazo(){
		
		mazo.add(new Carta("Es la  Proteína presente en los pelos, uñas y cuernos de los animales.", "Queratina", "Elastina", "Colágeno", 2 ) );
		
		mazo.add(new Carta("¿Cuál es la parte del cuerpo humano donde hay más huesos?", "la mano.", "la espalda.", "el pie.", 2 ) );
		
		mazo.add(new Carta(" ¿Cómo se clasifican los animales según tengan columna vertebral o no?", "Animales ovíparos o vivíparos.", "Animales vertebrados y animales invertebrados.", "Animales carnívoros, herbívoros u omnívoros.", 2 ) );
		
		mazo.add(new Carta(" ¿Qué variedad de tejido conjuntivo tiene gran capacidad de estiramiento y recuperación ante las tracciones?", "El fibroso", "El reticular", "El elástico", 2 ) );
		
		mazo.add(new Carta("¿Qué hormonas vegetales hay que emplear para estimular la germinación de una semilla?", "Auxinas", "Giberelinas ", "Citoquininas", 2 ) );
		
		mazo.add(new Carta("Coordina los movimientos y postura del cuerpo.", "Cerebelo ", "Cerebro", "Medula espinal", 2 ) );
		
		mazo.add(new Carta("Cuál de los siguientes términos tiene que ver con los cloroplastos:", "Crestas", "Matriz", "Tilacoide ", 2 ) );
		
		mazo.add(new Carta("¿Qué utilizan los peces para respirar?", "Pulmones", "La boca", "Branquias", 2 ) );
		
		mazo.add(new Carta("¿Cuál de los siguientes elementos químicos NO es un bioelemento?", "Helio ", "Cobalto", "Zinc", 2 ) );
		
		mazo.add(new Carta("Es la biomolécula más abundante en los seres vivos.", "Glucosa", "Lípidos", "Proteínas", 2 ) );
		
		mazo.add(new Carta("Es la biomolécula que contiene la información genética de cada ser vivo.", "Carbohidratos", "ADN ", "Lípidos", 2 ) );
		
	}
	
	public Carta siguienteCarta() {
		return mazo.pollFirst();
	}

}
