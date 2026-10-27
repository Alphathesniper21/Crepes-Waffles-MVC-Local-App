package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class VentanaInicio extends JFrame {

    private PanelConFondo panelPrincipal;
    private JScrollPane scroll;
    private JButton btnHelado;
    private JButton btnCrepe;
    private JButton btnWaffle;
    private JLabel imagenLae;
    private JComboBox<String> idioma;
    private JLabel lblLae;
    private JTextField txtLae;

    public VentanaInicio() {
        inicializarHeladeria();
    }

    public void inicializarHeladeria() {
    	
    	//Letra
    	Font fontField = new Font("Segoe UI", Font.BOLD, 20);
    	
        // Ventana
        this.setBounds(10, 10, 750, 515);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Panel principal con fondo
        panelPrincipal = new PanelConFondo();
        panelPrincipal.setLayout(null);
        panelPrincipal.setPreferredSize(new Dimension(750, 1050));

        // Scroll
        scroll = new JScrollPane(panelPrincipal);
        scroll.setBounds(0, 0, 750, 515);

        // Botón Helado
        btnHelado = new JButton(
        new ImageIcon(getClass().getResource("/imagenes/btnHelado.png")));
        btnHelado.setBounds(55, 468, 174, 374);
        btnHelado.setContentAreaFilled(false);
        btnHelado.setFocusPainted(false);
        btnHelado.setOpaque(false);
        panelPrincipal.add(btnHelado);

        // Botón Crepe
        btnCrepe = new JButton(
        new ImageIcon(getClass().getResource("/imagenes/btnCrepe.png")));
        btnCrepe.setBounds(288, 468, 174, 374);
        btnCrepe.setContentAreaFilled(false);
        btnCrepe.setFocusPainted(false);
        btnCrepe.setOpaque(false);
        panelPrincipal.add(btnCrepe);
        
    	// Botón Waffle
        btnWaffle = new JButton(
        new ImageIcon(getClass().getResource("/imagenes/btnWaffle.png")));
        btnWaffle.setBounds(522, 468, 174, 374);
        btnWaffle.setContentAreaFilled(false);
        btnWaffle.setFocusPainted(false);
        btnWaffle.setOpaque(false);
        panelPrincipal.add(btnWaffle);
        
        // Imagen Lae
        imagenLae = new JLabel(new ImageIcon(getClass().getResource("/imagenes/imgLae.png")));
        imagenLae.setBounds(585, 860, 146, 186);
        imagenLae.setOpaque(false);
        panelPrincipal.add(imagenLae);
        
        //texto Lae
        lblLae = new JLabel("La vida es corta... ¡pídete el helado doble!");
        lblLae.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblLae.setBounds(245, 889, 338, 38);
        lblLae.setForeground(Color.BLACK);
        panelPrincipal.add(lblLae);

        //ComboBox idiomas
      	idioma = new JComboBox<>(new String[] {"Español", "English", "Português", "Latina"});
      	idioma.setFont(fontField);
      	idioma.setBounds(45, 955, 193, 37);
      	idioma.setBackground(Color.WHITE);
      	panelPrincipal.add(idioma);
        
        
        this.add(scroll);
        this.setVisible(true);
    }

	public PanelConFondo getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(PanelConFondo panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JButton getBtnHelado() {
		return btnHelado;
	}

	public void setBtnHelado(JButton btnHelado) {
		this.btnHelado = btnHelado;
	}

	public JButton getBtnCrepe() {
		return btnCrepe;
	}

	public void setBtnCrepe(JButton btnCrepe) {
		this.btnCrepe = btnCrepe;
	}

	public JButton getBtnWaffle() {
		return btnWaffle;
	}

	public void setBtnWaffle(JButton btnWaffle) {
		this.btnWaffle = btnWaffle;
	}

	public JLabel getImagenLae() {
		return imagenLae;
	}

	public void setImagenLae(JLabel imagenLae) {
		this.imagenLae = imagenLae;
	}

	public JComboBox<String> getIdioma() {
		return idioma;
	}

	public void setIdioma(JComboBox<String> idioma) {
		this.idioma = idioma;
	}

	public JLabel getLblLae() {
		return lblLae;
	}

	public void setLblLae(JLabel lblLae) {
		this.lblLae = lblLae;
	}

	public JTextField getTxtLae() {
		return txtLae;
	}

	public void setTxtLae(JTextField txtLae) {
		this.txtLae = txtLae;
	}
    

}
