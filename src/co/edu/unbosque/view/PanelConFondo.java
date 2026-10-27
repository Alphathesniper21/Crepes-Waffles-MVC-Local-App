package co.edu.unbosque.view;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PanelConFondo extends JPanel{
	
	
	 private Image fondo;

	    public PanelConFondo() {
	        fondo = new ImageIcon(
	            getClass().getResource("/imagenes/fondo VeneCreps.png")
	        ).getImage();
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
	    }

}
