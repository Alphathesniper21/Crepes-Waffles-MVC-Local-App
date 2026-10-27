package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VentanaPago extends JFrame {

    private JPanel panelPrincipal;
    private JButton btnPagar, btnCancelar;
    private JLabel lblLae;
    private JTextField txtNombre, txtCedula, txtNumero;
    private JLabel labNombre, labCedula, labNumero, lblPago;
    private JComboBox<String> cmbPago;

    
    public VentanaPago() {
        inicializarPago();
    }

    public void inicializarPago() {

        
        this.setTitle("Pago del pedido");
        this.setSize(900, 850);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

        panelPrincipal = new JPanel(new BorderLayout());
        this.add(panelPrincipal, BorderLayout.CENTER);

        Font fontLabel = new Font("Segoe UI", Font.BOLD, 20);
        Font fontField = new Font("Segoe UI", Font.PLAIN, 20);

        Image fondo = new ImageIcon(
                getClass().getResource("/imagenes/fondo Pago.png")
        ).getImage();

        JPanel panelPago = new JPanel(null) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
            }
        };

      
        TitledBorder border = BorderFactory.createTitledBorder("Datos del pago");
        border.setTitleFont(new Font("Segoe UI", Font.BOLD, 40));
        border.setTitleColor(new Color(50, 50, 50));
        border.setTitleJustification(TitledBorder.CENTER);
        panelPago.setBorder(border);

        int xStart = 200;
        int anchoCampo = 470;

      
        labNombre = new JLabel("Nombre del cliente:");
        labNombre.setFont(fontLabel);
        labNombre.setBounds(xStart, 80, 300, 30);
        panelPago.add(labNombre);

        txtNombre = new JTextField();
        txtNombre.setFont(fontField);
        txtNombre.setBounds(xStart, 115, anchoCampo, 32);
        panelPago.add(txtNombre);

        labCedula = new JLabel("Número de cédula:");
        labCedula.setFont(fontLabel);
        labCedula.setBounds(xStart, 165, 300, 30);
        panelPago.add(labCedula);

        txtCedula = new JTextField();
        txtCedula.setFont(fontField);
        txtCedula.setBounds(xStart, 200, anchoCampo, 32);
        panelPago.add(txtCedula);

        labNumero = new JLabel("Número de teléfono:");
        labNumero.setFont(fontLabel);
        labNumero.setBounds(xStart, 250, 300, 30);
        panelPago.add(labNumero);

        txtNumero = new JTextField();
        txtNumero.setFont(fontField);
        txtNumero.setBounds(xStart, 285, anchoCampo, 32);
        panelPago.add(txtNumero);

        lblPago = new JLabel("Forma de pago:");
        lblPago.setFont(fontLabel);
        lblPago.setBounds(xStart, 335, 300, 30);
        panelPago.add(lblPago);

        cmbPago = new JComboBox<>(
                new String[]{"Efectivo", "Tarjeta", "PSE", "Nequi", "Daviplata"}
        );
        cmbPago.setFont(fontField);
        cmbPago.setBounds(xStart, 370, anchoCampo, 32);
        panelPago.add(cmbPago);

        btnPagar = new JButton("Pagar Pedido");
        btnPagar.setBounds(240, 600, 180, 45);
        btnPagar.setFont(new Font("Segoe UI", Font.BOLD, 15));
        btnPagar.setBackground(new Color(100, 149, 237));
        btnPagar.setForeground(Color.WHITE);
        btnPagar.setFocusPainted(false);

        btnCancelar = new JButton("Cancelar Pedido");
        btnCancelar.setBounds(500, 600, 200, 45);
        btnCancelar.setFont(new Font("Segoe UI", Font.BOLD, 15));
        btnCancelar.setBackground(new Color(220, 53, 69));
        btnCancelar.setForeground(Color.WHITE);
        btnCancelar.setFocusPainted(false);

        panelPago.add(btnPagar);
        panelPago.add(btnCancelar);

       
        lblLae = new JLabel("No te quedes a la mitad del proceso, realiza tu compra y disfruta tu pedido");
        lblLae.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblLae.setHorizontalAlignment(JLabel.CENTER);
        lblLae.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelPrincipal.add(panelPago, BorderLayout.CENTER);
        panelPrincipal.add(lblLae, BorderLayout.SOUTH);

        this.setVisible(true);
    }
	
	public String getFormaPagoSeleccionada() {
	    if (cmbPago == null || cmbPago.getSelectedItem() == null) {
	        return null;
	    }
	    return cmbPago.getSelectedItem().toString();
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	public JButton getBtnPagar() {
		return btnPagar;
	}

	public void setBtnPagar(JButton btnPagar) {
		this.btnPagar = btnPagar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JLabel getLblLae() {
		return lblLae;
	}

	public void setLblLae(JLabel lblLae) {
		this.lblLae = lblLae;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JComboBox<String> getCmbPago() {
		return cmbPago;
	}

	public void setCmbPago(JComboBox<String> cmbPago) {
		this.cmbPago = cmbPago;
	}

	public JLabel getLabNombre() {
		return labNombre;
	}

	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}

	public JLabel getLabCedula() {
		return labCedula;
	}

	public void setLabCedula(JLabel labCedula) {
		this.labCedula = labCedula;
	}

	public JLabel getLabNumero() {
		return labNumero;
	}

	public void setLabNumero(JLabel labNumero) {
		this.labNumero = labNumero;
	}

	public JLabel getLblPago() {
		return lblPago;
	}

	public void setLblPago(JLabel lblPago) {
		this.lblPago = lblPago;
	}
	
}
