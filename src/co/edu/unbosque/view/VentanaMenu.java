package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class VentanaMenu extends JFrame {

    private JPanel panelPrincipal;
    private JScrollPane scroll;
    private JPanel panelProducto;
    private JPanel panelClasico;
    private JPanel panelArtesanal;
    private JButton btnComprar;
    private JLabel imgProducto;
    private JLabel lblLae;
    private JLabel lblPrecio;
    private JSpinner spSweet, spChocoMenta, spVainilla, spCheesecake;
    private JSpinner spChocolate, spFresaLite, spVainillaLite, spYogurtLite;
    private JSpinner spCrepeNutella, spCrepeFresas, spCrepeBaby, spCrepeMont;
    private JSpinner spCrepePollo, spCrepeThai, spCrepeRoastbeef, spCrepeCochinita;
    private JSpinner spWaffleSencillo, spWaffleEspecial, spWaffleNutella, spWaffleTentacion;
    private JSpinner spWaffleVesubio, spWaffleMerengue, spWaffleNib, spWaffleBanana;
    private JPanel panelIzquierdo;
    private JLabel labNombre, labCedula, labNumero, labPago;
    private JComboBox<String> cmbPago;
    private JLabel lblSweetBanana;
    private JLabel lblChocoMenta;
    private JLabel lblVainilla;
    private JLabel lblCheeseCake;
    private JLabel lblChocolate;
    private JLabel lblFresaLite;
    private JLabel lblVainillaLite;
    private JLabel lblYogurtCuruba;
    private JLabel lblCrepeNutela;
    private JLabel lblCrepeFresas;
    private JLabel lblCrepeBabyDoll;
    private JLabel lblCrepeMontBlanc;
    private JLabel lblCrepePollo;
    private JLabel lblCrepePolloThai;
    private JLabel lblCrepeRoastBeef;
    private JLabel lblCrepeCochinita;
    private JLabel lblWaffleSencillo;
    private JLabel lblWaffleEspecial;
    private JLabel lblWaffleNutella;
    private JLabel lblWaffleMelocoton;
    private JLabel lblWaffleVesubio;
    private JLabel lblWaffleMerengue;
    private JLabel lblWaffleNib;
    private JLabel lblWaffleBanana;
    
	public VentanaMenu() {
        inicializarHeladeria();
    }

    public void inicializarHeladeria() {

        setBounds(10, 10, 1000, 1030);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panelPrincipal = new JPanel(null);
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 2060));

        scroll = new JScrollPane(panelPrincipal);
        scroll.setBounds(0, 0, 1000, 1030);
        add(scroll);
        
        btnComprar = new JButton("Comprar");
        btnComprar.setBounds(667, 1970, 180, 32);
        btnComprar.setBackground(new Color(20, 100, 246));
        btnComprar.setForeground(Color.WHITE);
        panelPrincipal.add(btnComprar);
        
        panelProducto = new JPanel(null);
        panelProducto.setBounds(35, 40, 900, 1820);
        panelProducto.setBackground(Color.LIGHT_GRAY);
        panelPrincipal.add(panelProducto);

        //Titulo Clasico
        panelClasico = new JPanel(null);
        panelClasico.setBounds(0, 0, 186, 910);
        panelClasico.setBackground(new Color(41, 31, 29));
        panelProducto.add(panelClasico);
        
        //Titulo Artesanal
        panelArtesanal = new JPanel(null);
        panelArtesanal.setBounds(714, 910, 186, 910);
        panelArtesanal.setBackground(new Color(118, 110, 55));
        panelProducto.add(panelArtesanal);
        
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
    }

    public void inicializarHelado() {
    	
    	revalidate();
	    repaint();
    	
        Font fontField = new Font("Segoe UI", Font.BOLD, 16);

        //Sweet Banana
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/helado_SquirtBanana_331x217.png")));
        imgProducto.setBounds(203, 16, 331, 217);
        panelProducto.add(imgProducto);

        lblSweetBanana = new JLabel("Sweet Banana");
        lblSweetBanana.setFont(fontField);
        lblSweetBanana.setBounds(609, 85, 210, 45);
        panelProducto.add(lblSweetBanana);

        lblPrecio = new JLabel("7800");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(729, 137, 139, 18);
        panelProducto.add(lblPrecio);

        spSweet = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spSweet.setBounds(609, 130, 90, 32);
        panelProducto.add(spSweet);

        //ChocoMenta
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/helado_Menta_331x217.png")));
        imgProducto.setBounds(548, 238, 331, 217);
        panelProducto.add(imgProducto);

        lblChocoMenta = new JLabel("ChocoMenta");
        lblChocoMenta.setFont(fontField);
        lblChocoMenta.setBounds(264, 302, 210, 45);
        panelProducto.add(lblChocoMenta);

        lblPrecio = new JLabel("7800");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(384, 354, 139, 18);
        panelProducto.add(lblPrecio);
        
        spChocoMenta = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spChocoMenta.setBounds(264, 347, 90, 32);
        panelProducto.add(spChocoMenta);

        //Vainilla
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/helado_Vainilla_331x217.png")));
        imgProducto.setBounds(203, 459, 331, 217);
        panelProducto.add(imgProducto);

        lblVainilla = new JLabel("Vainilla");
        lblVainilla.setFont(fontField);
        lblVainilla.setBounds(609, 550, 210, 45);
        panelProducto.add(lblVainilla);
        
        lblPrecio = new JLabel("7800");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(729, 602, 139, 18);
        panelProducto.add(lblPrecio);

        spVainilla = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spVainilla.setBounds(609, 595, 90, 32);
        panelProducto.add(spVainilla);

        //Cheesecake
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/helado_CheesecakedeLimon_331x217.png")));
        imgProducto.setBounds(549, 686, 331, 217);
        panelProducto.add(imgProducto);

        lblCheeseCake = new JLabel("CheeseCake");
        lblCheeseCake.setFont(fontField);
        lblCheeseCake.setBounds(264, 774, 210, 45);
        panelProducto.add(lblCheeseCake);
        
        lblPrecio = new JLabel("7800");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(384, 826, 139, 18);
        panelProducto.add(lblPrecio);

        spCheesecake = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCheesecake.setBounds(264, 819, 90, 32);
        panelProducto.add(spCheesecake);

        //Artesanales
        
        //Chocolate
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/helado_ChocoLight_331x217.png")));
        imgProducto.setBounds(19, 922, 331, 217);
        panelProducto.add(imgProducto);

        lblChocolate = new JLabel("Chocolate");
        lblChocolate.setFont(fontField);
        lblChocolate.setBounds(425, 991, 210, 45);
        panelProducto.add(lblChocolate);
        
        lblPrecio = new JLabel("12000");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(544, 1043, 139, 18);
        panelProducto.add(lblPrecio);

        spChocolate = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spChocolate.setBounds(425, 1036, 90, 32);
        panelProducto.add(spChocolate);

        //Fresa Lite
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/helado_FresaLight_331x217.png")));
        imgProducto.setBounds(364, 1144, 331, 217);
        panelProducto.add(imgProducto);

        lblFresaLite = new JLabel("FresaLite");
        lblFresaLite.setFont(fontField);
        lblFresaLite.setBounds(80, 1208, 210, 45);
        panelProducto.add(lblFresaLite);
        
        lblPrecio = new JLabel("12000");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(200, 1260, 139, 18);
        panelProducto.add(lblPrecio);

        spFresaLite = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spFresaLite.setBounds(80, 1253, 90, 32);
        panelProducto.add(spFresaLite);

        //Vainilla Lite
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/helado_VainillaLight_331x217.png")));
        imgProducto.setBounds(19, 1365, 331, 217);
        panelProducto.add(imgProducto);

        lblVainillaLite = new JLabel("VainillaLite");
        lblVainillaLite.setFont(fontField);
        lblVainillaLite.setBounds(425, 1456, 210, 45);
        panelProducto.add(lblVainillaLite);
        
        lblPrecio = new JLabel("12000");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(544, 1508, 139, 18);
        panelProducto.add(lblPrecio);

        spVainillaLite = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spVainillaLite.setBounds(425, 1501, 90, 32);
        panelProducto.add(spVainillaLite);

        //Yogurt Curuba Lite
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/helado_YogurtdeCuruba_331x217.png")));
        imgProducto.setBounds(364, 1592, 331, 217);
        panelProducto.add(imgProducto);

        lblYogurtCuruba = new JLabel("YogurtCurubaLite");
        lblYogurtCuruba.setFont(fontField);
        lblYogurtCuruba.setBounds(80, 1680, 210, 45);
        panelProducto.add(lblYogurtCuruba);
        
        lblPrecio = new JLabel("12000");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(200, 1732, 139, 18);
        panelProducto.add(lblPrecio);

        spYogurtLite = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spYogurtLite.setBounds(80, 1725, 90, 32);
        panelProducto.add(spYogurtLite);

        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
    }
    public JLabel getLblSweetBanana() {
		return lblSweetBanana;
	}

	public void setLblSweetBanana(JLabel lblSweetBanana) {
		this.lblSweetBanana = lblSweetBanana;
	}

	public void inicializarCrepe(){
    	
    	revalidate();
	    repaint();
    	
    	Font fontField = new Font("Segoe UI", Font.BOLD, 16);
    	
    	//Crepe Dulce
    	
    	//Crepe nutella
    	imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_CeppeNutella_331x217.png")));
        imgProducto.setBounds(203, 16, 331, 217);
        panelProducto.add(imgProducto);

        lblCrepeNutela = new JLabel("Crepe Nutela");
        lblCrepeNutela.setFont(fontField);
        lblCrepeNutela.setBounds(609, 85, 210, 45);
        panelProducto.add(lblCrepeNutela);

        lblPrecio = new JLabel("9000");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(729, 137, 139, 18);
        panelProducto.add(lblPrecio);

        spCrepeNutella = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCrepeNutella.setBounds(609, 130, 90, 32);
        panelProducto.add(spCrepeNutella);

        //Crepe Fresas con crema y helado de vainilla
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_CreppeFresasConCremaYHelado_331x217.png")));
        imgProducto.setBounds(548, 238, 331, 217);
        panelProducto.add(imgProducto);

        lblCrepeFresas = new JLabel("<html>Crepe Fresas con crema y helado de vainilla</html>");
        lblCrepeFresas.setFont(fontField);
        lblCrepeFresas.setBounds(264, 302, 210, 45);
        panelProducto.add(lblCrepeFresas);

        lblPrecio = new JLabel("14500");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(384, 354, 139, 18);
        panelProducto.add(lblPrecio);
        
        spCrepeFresas = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCrepeFresas.setBounds(264, 347, 90, 32);
        panelProducto.add(spCrepeFresas);

        //Crepe Baby Doll
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_BabyDoll_331x217.png")));
        imgProducto.setBounds(203, 459, 331, 217);
        panelProducto.add(imgProducto);

        lblCrepeBabyDoll = new JLabel("Crepe Baby Doll");
        lblCrepeBabyDoll.setFont(fontField);
        lblCrepeBabyDoll.setBounds(609, 550, 210, 45);
        panelProducto.add(lblCrepeBabyDoll);
        
        lblPrecio = new JLabel("13900");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(729, 602, 139, 18);
        panelProducto.add(lblPrecio);

        spCrepeBaby = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCrepeBaby.setBounds(609, 595, 90, 32);
        panelProducto.add(spCrepeBaby);

        //Crepe Mont Blanc
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_MontBlanc_331x217.png")));
        imgProducto.setBounds(549, 686, 331, 217);
        panelProducto.add(imgProducto);

        lblCrepeMontBlanc = new JLabel("Crepe Mont Blanc");
        lblCrepeMontBlanc.setFont(fontField);
        lblCrepeMontBlanc.setBounds(264, 774, 210, 45);
        panelProducto.add(lblCrepeMontBlanc);
        
        lblPrecio = new JLabel("15200");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(384, 826, 139, 18);
        panelProducto.add(lblPrecio);

        spCrepeMont = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCrepeMont.setBounds(264, 819, 90, 32);
        panelProducto.add(spCrepeMont);

        //Salados
        
        //Pollo queso y champinones
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_CreppePolloQuesoyChamp_331x217.png")));
        imgProducto.setBounds(19, 922, 331, 217);
        panelProducto.add(imgProducto);

        lblCrepePollo = new JLabel("Pollo queso y champinones");
        lblCrepePollo.setFont(fontField);
        lblCrepePollo.setBounds(425, 991, 210, 45);
        panelProducto.add(lblCrepePollo);
        
        lblPrecio = new JLabel("26900");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(544, 1043, 139, 18);
        panelProducto.add(lblPrecio);

        spCrepePollo = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCrepePollo.setBounds(425, 1036, 90, 32);
        panelProducto.add(spCrepePollo);

        //Pollo thai
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_PolloThai_331x217.png")));
        imgProducto.setBounds(364, 1144, 331, 217);
        panelProducto.add(imgProducto);

        lblCrepePolloThai = new JLabel("Pollo thai");
        lblCrepePolloThai.setFont(fontField);
        lblCrepePolloThai.setBounds(80, 1208, 210, 45);
        panelProducto.add(lblCrepePolloThai);
        
        lblPrecio = new JLabel("28900");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(200, 1260, 139, 18);
        panelProducto.add(lblPrecio);

        spCrepeThai = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCrepeThai.setBounds(80, 1253, 90, 32);
        panelProducto.add(spCrepeThai);

        //Roastbeef
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_CreppeRoastbeef_331x217.png")));
        imgProducto.setBounds(19, 1365, 331, 217);
        panelProducto.add(imgProducto);

        lblCrepeRoastBeef = new JLabel("Roastbeef");
        lblCrepeRoastBeef.setFont(fontField);
        lblCrepeRoastBeef.setBounds(425, 1456, 210, 45);
        panelProducto.add(lblCrepeRoastBeef);
        
        lblPrecio = new JLabel("31900");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(544, 1508, 139, 18);
        panelProducto.add(lblPrecio);

        spCrepeRoastbeef = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCrepeRoastbeef.setBounds(425, 1501, 90, 32);
        panelProducto.add(spCrepeRoastbeef);

        //Cochinita pibil
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_CreppeCochinitaPibil_331x217.png")));
        imgProducto.setBounds(364, 1592, 331, 217);
        panelProducto.add(imgProducto);

        lblCrepeCochinita = new JLabel("Cochinita pibil");
        lblCrepeCochinita.setFont(fontField);
        lblCrepeCochinita.setBounds(80, 1680, 210, 45);
        panelProducto.add(lblCrepeCochinita);
        
        lblPrecio = new JLabel("24500");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(200, 1732, 139, 18);
        panelProducto.add(lblPrecio);

        spCrepeCochinita = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spCrepeCochinita.setBounds(80, 1725, 90, 32);
        panelProducto.add(spCrepeCochinita);

        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    	
    }
    	
    public void inicializarWaffle() {
    	
    	revalidate();
	    repaint();
    	
       Font fontField = new Font("Segoe UI", Font.BOLD, 16);
    	
    	//Waffle sencillo
    	
    	//Waffle sencillo con helado
       imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_WaffleSencilloConHelado_331x217.png")));
        imgProducto.setBounds(203, 16, 331, 217);
        panelProducto.add(imgProducto);

        lblWaffleSencillo = new JLabel("Waffle sencillo con helado");
        lblWaffleSencillo.setFont(fontField);
        lblWaffleSencillo.setBounds(609, 85, 210, 45);
        panelProducto.add(lblWaffleSencillo);

        lblPrecio = new JLabel("12900");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(729, 137, 139, 18);
        panelProducto.add(lblPrecio);

        spWaffleSencillo = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spWaffleSencillo.setBounds(609, 130, 90, 32);
        panelProducto.add(spWaffleSencillo);

        //Especial
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_WaffleEspecial_331x217.png")));
        imgProducto.setBounds(548, 238, 331, 217);
        panelProducto.add(imgProducto);

        lblWaffleEspecial = new JLabel("Especial");
        lblWaffleEspecial.setFont(fontField);
        lblWaffleEspecial.setBounds(264, 302, 210, 45);
        panelProducto.add(lblWaffleEspecial);

        lblPrecio = new JLabel("15900");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(384, 354, 139, 18);
        panelProducto.add(lblPrecio);
        
        spWaffleEspecial = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spWaffleEspecial.setBounds(264, 347, 90, 32);
        panelProducto.add(spWaffleEspecial);

        //Nutella y banano
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_WaffleNutellaYBanano_331x217.png")));
        imgProducto.setBounds(203, 459, 331, 217);
        panelProducto.add(imgProducto);

        lblWaffleNutella = new JLabel("Nutella y banano");
        lblWaffleNutella.setFont(fontField);
        lblWaffleNutella.setBounds(609, 550, 210, 45);
        panelProducto.add(lblWaffleNutella);
        
        lblPrecio = new JLabel("15900");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(729, 602, 139, 18);
        panelProducto.add(lblPrecio);

        spWaffleNutella = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spWaffleNutella.setBounds(609, 595, 90, 32);
        panelProducto.add(spWaffleNutella);

        //Tentacion melocoton
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_WaffleTentacionMelocoton_331x217.png")));
        imgProducto.setBounds(549, 686, 331, 217);
        panelProducto.add(imgProducto);

        lblWaffleMelocoton = new JLabel("Tentacion melocoton");
        lblWaffleMelocoton.setFont(fontField);
        lblWaffleMelocoton.setBounds(264, 774, 210, 45);
        panelProducto.add(lblWaffleMelocoton);
        
        lblPrecio = new JLabel("18900");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(384, 826, 139, 18);
        panelProducto.add(lblPrecio);

        spWaffleTentacion = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spWaffleTentacion.setBounds(264, 819, 90, 32);
        panelProducto.add(spWaffleTentacion);

        //Doble
        
        //Vesubio
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_Waffle_vesubio_331x217.png")));
        imgProducto.setBounds(19, 922, 331, 217);
        panelProducto.add(imgProducto);

        lblWaffleVesubio = new JLabel("Vesubio");
        lblWaffleVesubio.setFont(fontField);
        lblWaffleVesubio.setBounds(425, 991, 210, 45);
        panelProducto.add(lblWaffleVesubio);
        
        lblPrecio = new JLabel("20000");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(544, 1043, 139, 18);
        panelProducto.add(lblPrecio);

        spWaffleVesubio = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spWaffleVesubio.setBounds(425, 1036, 90, 32);
        panelProducto.add(spWaffleVesubio);

        //Merengue glaze
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_Waffle_merengue_glaze_331x217.png")));
        imgProducto.setBounds(364, 1144, 331, 217);
        panelProducto.add(imgProducto);

        lblWaffleMerengue = new JLabel("Merengue glaze");
        lblWaffleMerengue.setFont(fontField);
        lblWaffleMerengue.setBounds(80, 1208, 210, 45);
        panelProducto.add(lblWaffleMerengue);
        
        lblPrecio = new JLabel("17000");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(200, 1260, 139, 18);
        panelProducto.add(lblPrecio);

        spWaffleMerengue = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spWaffleMerengue.setBounds(80, 1253, 90, 32);
        panelProducto.add(spWaffleMerengue);

        //Nib Crunch
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_Waffle_nib_crunch_331x217.png")));
        imgProducto.setBounds(19, 1365, 331, 217);
        panelProducto.add(imgProducto);

        lblWaffleNib = new JLabel("Nib Crunch");
        lblWaffleNib.setFont(fontField);
        lblWaffleNib.setBounds(425, 1456, 210, 45);
        panelProducto.add(lblWaffleNib);
        
        lblPrecio = new JLabel("13400");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(544, 1508, 139, 18);
        panelProducto.add(lblPrecio);

        spWaffleNib = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spWaffleNib.setBounds(425, 1501, 90, 32);
        panelProducto.add(spWaffleNib);

        //Banana Royal
        imgProducto = new JLabel(new ImageIcon(getClass().getResource("/imagenes/postre_Waffle_banana_royal_331x217.png")));
        imgProducto.setBounds(364, 1592, 331, 217);
        panelProducto.add(imgProducto);

        lblWaffleBanana = new JLabel("Banana Royal");
        lblWaffleBanana.setFont(fontField);
        lblWaffleBanana.setBounds(80, 1680, 210, 45);
        panelProducto.add(lblWaffleBanana);
        
        lblPrecio = new JLabel("25000");
        lblPrecio.setFont(fontField);
        lblPrecio.setBounds(200, 1732, 139, 18);
        panelProducto.add(lblPrecio);

        spWaffleBanana = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spWaffleBanana.setBounds(80, 1725, 90, 32);
        panelProducto.add(spWaffleBanana);

        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    	
    }
    
    public void reiniciarMenu() {
        
        for (java.awt.Component c : panelProducto.getComponents()) {
            if (c != panelClasico && c != panelArtesanal) {
                panelProducto.remove(c);
            }
        }

        panelProducto.revalidate();
        panelProducto.repaint();

       
        spSweet = spChocoMenta = spVainilla = spCheesecake = null;
        spChocolate = spFresaLite = spVainillaLite = spYogurtLite = null;
        spCrepeNutella = spCrepeFresas = spCrepeBaby = spCrepeMont = null;
        spCrepePollo = spCrepeThai = spCrepeRoastbeef = spCrepeCochinita = null;
        spWaffleSencillo = spWaffleEspecial = spWaffleNutella = null;
        spWaffleTentacion = spWaffleVesubio = spWaffleMerengue = null;
        spWaffleNib = spWaffleBanana = null;
    }

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JPanel getPanelProducto() {
		return panelProducto;
	}

	public void setPanelProducto(JPanel panelProducto) {
		this.panelProducto = panelProducto;
	}

	public JPanel getPanelClasico() {
		return panelClasico;
	}

	public void setPanelClasico(JPanel panelClasico) {
		this.panelClasico = panelClasico;
	}

	public JPanel getPanelArtesanal() {
		return panelArtesanal;
	}

	public void setPanelArtesanal(JPanel panelArtesanal) {
		this.panelArtesanal = panelArtesanal;
	}

	public JButton getBtnComprar() {
		return btnComprar;
	}

	public void setBtnComprar(JButton btnComprar) {
		this.btnComprar = btnComprar;
	}

	public JLabel getImgProducto() {
		return imgProducto;
	}

	public void setImgProducto(JLabel imgProducto) {
		this.imgProducto = imgProducto;
	}

	public JLabel getLblLae() {
		return lblLae;
	}

	public void setLblLae(JLabel lblLae) {
		this.lblLae = lblLae;
	}

	public JLabel getLblPrecio() {
		return lblPrecio;
	}

	public void setLblPrecio(JLabel lblPrecio) {
		this.lblPrecio = lblPrecio;
	}

	public JSpinner getSpSweet() {
		return spSweet;
	}

	public void setSpSweet(JSpinner spSweet) {
		this.spSweet = spSweet;
	}

	public JSpinner getSpChocoMenta() {
		return spChocoMenta;
	}

	public void setSpChocoMenta(JSpinner spChocoMenta) {
		this.spChocoMenta = spChocoMenta;
	}

	public JSpinner getSpVainilla() {
		return spVainilla;
	}

	public void setSpVainilla(JSpinner spVainilla) {
		this.spVainilla = spVainilla;
	}

	public JSpinner getSpCheesecake() {
		return spCheesecake;
	}

	public void setSpCheesecake(JSpinner spCheesecake) {
		this.spCheesecake = spCheesecake;
	}

	public JSpinner getSpChocolate() {
		return spChocolate;
	}

	public void setSpChocolate(JSpinner spChocolate) {
		this.spChocolate = spChocolate;
	}

	public JSpinner getSpFresaLite() {
		return spFresaLite;
	}

	public void setSpFresaLite(JSpinner spFresaLite) {
		this.spFresaLite = spFresaLite;
	}

	public JSpinner getSpVainillaLite() {
		return spVainillaLite;
	}

	public void setSpVainillaLite(JSpinner spVainillaLite) {
		this.spVainillaLite = spVainillaLite;
	}

	public JSpinner getSpYogurtLite() {
		return spYogurtLite;
	}

	public void setSpYogurtLite(JSpinner spYogurtLite) {
		this.spYogurtLite = spYogurtLite;
	}

	public JSpinner getSpCrepeNutella() {
		return spCrepeNutella;
	}

	public void setSpCrepeNutella(JSpinner spCrepeNutella) {
		this.spCrepeNutella = spCrepeNutella;
	}

	public JSpinner getSpCrepeFresas() {
		return spCrepeFresas;
	}

	public void setSpCrepeFresas(JSpinner spCrepeFresas) {
		this.spCrepeFresas = spCrepeFresas;
	}

	public JSpinner getSpCrepeBaby() {
		return spCrepeBaby;
	}

	public void setSpCrepeBaby(JSpinner spCrepeBaby) {
		this.spCrepeBaby = spCrepeBaby;
	}

	public JSpinner getSpCrepeMont() {
		return spCrepeMont;
	}

	public void setSpCrepeMont(JSpinner spCrepeMont) {
		this.spCrepeMont = spCrepeMont;
	}

	public JSpinner getSpCrepePollo() {
		return spCrepePollo;
	}

	public void setSpCrepePollo(JSpinner spCrepePollo) {
		this.spCrepePollo = spCrepePollo;
	}

	public JSpinner getSpCrepeThai() {
		return spCrepeThai;
	}

	public void setSpCrepeThai(JSpinner spCrepeThai) {
		this.spCrepeThai = spCrepeThai;
	}

	public JSpinner getSpCrepeRoastbeef() {
		return spCrepeRoastbeef;
	}

	public void setSpCrepeRoastbeef(JSpinner spCrepeRoastbeef) {
		this.spCrepeRoastbeef = spCrepeRoastbeef;
	}

	public JSpinner getSpCrepeCochinita() {
		return spCrepeCochinita;
	}

	public void setSpCrepeCochinita(JSpinner spCrepeCochinita) {
		this.spCrepeCochinita = spCrepeCochinita;
	}

	public JSpinner getSpWaffleSencillo() {
		return spWaffleSencillo;
	}

	public void setSpWaffleSencillo(JSpinner spWaffleSencillo) {
		this.spWaffleSencillo = spWaffleSencillo;
	}

	public JSpinner getSpWaffleEspecial() {
		return spWaffleEspecial;
	}

	public void setSpWaffleEspecial(JSpinner spWaffleEspecial) {
		this.spWaffleEspecial = spWaffleEspecial;
	}

	public JSpinner getSpWaffleNutella() {
		return spWaffleNutella;
	}

	public void setSpWaffleNutella(JSpinner spWaffleNutella) {
		this.spWaffleNutella = spWaffleNutella;
	}

	public JSpinner getSpWaffleTentacion() {
		return spWaffleTentacion;
	}

	public void setSpWaffleTentacion(JSpinner spWaffleTentacion) {
		this.spWaffleTentacion = spWaffleTentacion;
	}

	public JSpinner getSpWaffleVesubio() {
		return spWaffleVesubio;
	}

	public void setSpWaffleVesubio(JSpinner spWaffleVesubio) {
		this.spWaffleVesubio = spWaffleVesubio;
	}

	public JSpinner getSpWaffleMerengue() {
		return spWaffleMerengue;
	}

	public void setSpWaffleMerengue(JSpinner spWaffleMerengue) {
		this.spWaffleMerengue = spWaffleMerengue;
	}

	public JSpinner getSpWaffleNib() {
		return spWaffleNib;
	}

	public void setSpWaffleNib(JSpinner spWaffleNib) {
		this.spWaffleNib = spWaffleNib;
	}

	public JSpinner getSpWaffleBanana() {
		return spWaffleBanana;
	}

	public void setSpWaffleBanana(JSpinner spWaffleBanana) {
		this.spWaffleBanana = spWaffleBanana;
	}

	public JPanel getPanelIzquierdo() {
		return panelIzquierdo;
	}

	public void setPanelIzquierdo(JPanel panelIzquierdo) {
		this.panelIzquierdo = panelIzquierdo;
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

	public JLabel getLabPago() {
		return labPago;
	}

	public void setLabPago(JLabel labPago) {
		this.labPago = labPago;
	}

	public JComboBox<String> getCmbPago() {
		return cmbPago;
	}

	public void setCmbPago(JComboBox<String> cmbPago) {
		this.cmbPago = cmbPago;
	}

	public JLabel getLblChocoMenta() {
		return lblChocoMenta;
	}

	public void setLblChocoMenta(JLabel lblChocoMenta) {
		this.lblChocoMenta = lblChocoMenta;
	}

	public JLabel getLblVainilla() {
		return lblVainilla;
	}

	public void setLblVainilla(JLabel lblVainilla) {
		this.lblVainilla = lblVainilla;
	}

	public JLabel getLblCheeseCake() {
		return lblCheeseCake;
	}

	public void setLblCheeseCake(JLabel lblCheeseCake) {
		this.lblCheeseCake = lblCheeseCake;
	}

	public JLabel getLblChocolate() {
		return lblChocolate;
	}

	public void setLblChocolate(JLabel lblChocolate) {
		this.lblChocolate = lblChocolate;
	}

	public JLabel getLblFresaLite() {
		return lblFresaLite;
	}

	public void setLblFresaLite(JLabel lblFresaLite) {
		this.lblFresaLite = lblFresaLite;
	}

	public JLabel getLblVainillaLite() {
		return lblVainillaLite;
	}

	public void setLblVainillaLite(JLabel lblVainillaLite) {
		this.lblVainillaLite = lblVainillaLite;
	}

	public JLabel getLblYogurtCuruba() {
		return lblYogurtCuruba;
	}

	public void setLblYogurtCuruba(JLabel lblYogurtCuruba) {
		this.lblYogurtCuruba = lblYogurtCuruba;
	}

	public JLabel getLblCrepeNutela() {
		return lblCrepeNutela;
	}

	public void setLblCrepeNutela(JLabel lblCrepeNutela) {
		this.lblCrepeNutela = lblCrepeNutela;
	}

	public JLabel getLblCrepeFresas() {
		return lblCrepeFresas;
	}

	public void setLblCrepeFresas(JLabel lblCrepeFresas) {
		this.lblCrepeFresas = lblCrepeFresas;
	}

	public JLabel getLblCrepeBabyDoll() {
		return lblCrepeBabyDoll;
	}

	public void setLblCrepeBabyDoll(JLabel lblCrepeBabyDoll) {
		this.lblCrepeBabyDoll = lblCrepeBabyDoll;
	}

	public JLabel getLblCrepeMontBlanc() {
		return lblCrepeMontBlanc;
	}

	public void setLblCrepeMontBlanc(JLabel lblCrepeMontBlanc) {
		this.lblCrepeMontBlanc = lblCrepeMontBlanc;
	}

	public JLabel getLblCrepePollo() {
		return lblCrepePollo;
	}

	public void setLblCrepePollo(JLabel lblCrepePollo) {
		this.lblCrepePollo = lblCrepePollo;
	}

	public JLabel getLblCrepePolloThai() {
		return lblCrepePolloThai;
	}

	public void setLblCrepePolloThai(JLabel lblCrepePolloThai) {
		this.lblCrepePolloThai = lblCrepePolloThai;
	}

	public JLabel getLblCrepeRoastBeef() {
		return lblCrepeRoastBeef;
	}

	public void setLblCrepeRoastBeef(JLabel lblCrepeRoastBeef) {
		this.lblCrepeRoastBeef = lblCrepeRoastBeef;
	}

	public JLabel getLblCrepeCochinita() {
		return lblCrepeCochinita;
	}

	public void setLblCrepeCochinita(JLabel lblCrepeCochinita) {
		this.lblCrepeCochinita = lblCrepeCochinita;
	}

	public JLabel getLblWaffleSencillo() {
		return lblWaffleSencillo;
	}

	public void setLblWaffleSencillo(JLabel lblWaffleSencillo) {
		this.lblWaffleSencillo = lblWaffleSencillo;
	}

	public JLabel getLblWaffleEspecial() {
		return lblWaffleEspecial;
	}

	public void setLblWaffleEspecial(JLabel lblWaffleEspecial) {
		this.lblWaffleEspecial = lblWaffleEspecial;
	}

	public JLabel getLblWaffleNutella() {
		return lblWaffleNutella;
	}

	public void setLblWaffleNutella(JLabel lblWaffleNutella) {
		this.lblWaffleNutella = lblWaffleNutella;
	}

	public JLabel getLblWaffleMelocoton() {
		return lblWaffleMelocoton;
	}

	public void setLblWaffleMelocoton(JLabel lblWaffleMelocoton) {
		this.lblWaffleMelocoton = lblWaffleMelocoton;
	}

	public JLabel getLblWaffleVesubio() {
		return lblWaffleVesubio;
	}

	public void setLblWaffleVesubio(JLabel lblWaffleVesubio) {
		this.lblWaffleVesubio = lblWaffleVesubio;
	}

	public JLabel getLblWaffleMerengue() {
		return lblWaffleMerengue;
	}

	public void setLblWaffleMerengue(JLabel lblWaffleMerengue) {
		this.lblWaffleMerengue = lblWaffleMerengue;
	}

	public JLabel getLblWaffleNib() {
		return lblWaffleNib;
	}

	public void setLblWaffleNib(JLabel lblWaffleNib) {
		this.lblWaffleNib = lblWaffleNib;
	}

	public JLabel getLblWaffleBanana() {
		return lblWaffleBanana;
	}

	public void setLblWaffleBanana(JLabel lblWaffleBanana) {
		this.lblWaffleBanana = lblWaffleBanana;
	}

}
