package Pantallas;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelBingo extends JPanel{
	PanelBingo(){	
	}
	
	private Image imagen;
	
	public void paint( Graphics g) {
		imagen = new ImageIcon( getClass().getResource("Img/Facil.png") ).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this );
		setOpaque(false);
		
		super.paint(g);
	}
	
}
