package co.edu.unbosque.controller;

import java.util.Properties;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.VentanaInicio;
import co.edu.unbosque.view.VentanaMenu;
import co.edu.unbosque.view.VentanaPago;
import co.edu.unbosque.model.*;
import co.edu.unbosque.util.exception.InvalidTextException;
import co.edu.unbosque.util.exception.LanzadorDeExcepcion;
import co.edu.unbosque.util.exception.NequiCaidoException;
import co.edu.unbosque.util.exception.SomeoneElseOrderedException;
import java.util.ArrayList;

public class Controller {

	private VentanaInicio vi;
	private VentanaMenu vm;
	private ModelFacade mf;
	private VentanaPago vp;
	private Properties prop;
	private String tipoProductoActual;
	private ArrayList<Producto> carrito;

	public Controller() {
		vi = new VentanaInicio();
		vm = new VentanaMenu();
		mf = new ModelFacade();
		prop = new Properties();
		carrito = new ArrayList<>();
		agregarOyentes();
		
	}

	public void runGUI() {
		vi.setVisible(true);
		prop = FileHandler.cargarArchivoDePropiedades("esp.properties");
	}

	public void agregarOyentes() {
		vi.getBtnHelado().addActionListener(e -> mostrarMenu("helado"));
		vi.getBtnCrepe().addActionListener(e -> mostrarMenu("crepe"));
		vi.getBtnWaffle().addActionListener(e -> mostrarMenu("waffle"));
		vi.getIdioma().addActionListener(e -> seleccionarIdioma());
		vm.getBtnComprar().addActionListener(e -> procesarCompra());
	}

	public void mostrarMenu(String tipoProducto) {
		tipoProductoActual = tipoProducto;

		vi.setVisible(false);
		vm.setVisible(true);

		vm.reiniciarMenu();
		vm.revalidate();
		vm.repaint();

		switch (tipoProducto) {
		case "helado":
			vm.inicializarHelado();
			break;
		case "crepe":
			vm.inicializarCrepe();
			break;
		case "waffle":
			vm.inicializarWaffle();
			break;
		}
		
		refrescarTexto();
	}

	public void seleccionarIdioma() {

		String idiomaSeleccionado = (String) vi.getIdioma().getSelectedItem();

		switch(idiomaSeleccionado){

		case "Español":{

			prop = FileHandler.cargarArchivoDePropiedades("esp.properties");
			break;
		} case "English":{

			prop = FileHandler.cargarArchivoDePropiedades("eng.properties");
			break;
		} case "Português":{

			prop = FileHandler.cargarArchivoDePropiedades("por.properties");
			break;
		} case "Latina":{

			prop = FileHandler.cargarArchivoDePropiedades("lat.properties");
			break;
		}
		}

		refrescarTexto();

	}

	public void refrescarTexto() {

	    vi.getLblLae().setText(prop.getProperty("menu.personaje.dialogo"));

	    if ("helado".equals(tipoProductoActual) && vm.getLblSweetBanana() != null) {

	        vm.getLblSweetBanana().setText(prop.getProperty("menu.helados.sweetBanana"));
	        vm.getLblChocoMenta().setText(prop.getProperty("menu.helados.chocoMenta"));
	        vm.getLblVainilla().setText(prop.getProperty("menu.helados.vainilla"));
	        vm.getLblCheeseCake().setText(prop.getProperty("menu.helados.cheeseCake"));
	        vm.getLblChocolate().setText(prop.getProperty("menu.helados.chocolate"));
	        vm.getLblFresaLite().setText(prop.getProperty("menu.helados.fresaLite"));
	        vm.getLblVainillaLite().setText(prop.getProperty("menu.helados.vainillaLite"));
	        vm.getLblYogurtCuruba().setText(prop.getProperty("menu.helados.yogurtCurubaLite"));

	    } else if ("crepe".equals(tipoProductoActual) && vm.getLblCrepeNutela() != null) {

	        vm.getLblCrepeNutela().setText(prop.getProperty("menu.crepes.crepeNutella"));
	        vm.getLblCrepeFresas().setText(prop.getProperty("menu.crepes.crepeFresa"));
	        vm.getLblCrepeBabyDoll().setText(prop.getProperty("menu.crepes.crepeFresa"));
	        vm.getLblCrepeMontBlanc().setText(prop.getProperty("menu.crepes.MontBlanc"));
	        vm.getLblCrepePollo().setText(prop.getProperty("menu.crepes.crepePollo"));
	        vm.getLblCrepePolloThai().setText(prop.getProperty("menu.crepes.crepeThai"));
	        vm.getLblCrepeRoastBeef().setText(prop.getProperty("menu.crepes.roastbeef"));
	        vm.getLblCrepeCochinita().setText(prop.getProperty("menu.crepes.crepeCochinita"));
	        
	    } else if ("waffle".equals(tipoProductoActual) && vm.getLblCrepeNutela() != null)  {

	        vm.getLblWaffleSencillo().setText(prop.getProperty("menu.waffles.waffleSencillo"));
	        vm.getLblWaffleEspecial().setText(prop.getProperty("menu.waffles.waffleEspecial"));
	        vm.getLblWaffleNutella().setText(prop.getProperty("menu.waffles.waffleNutella"));
	        vm.getLblWaffleMelocoton().setText(prop.getProperty("menu.waffles.waffleTentacion"));
	        vm.getLblWaffleVesubio().setText(prop.getProperty("menu.waffles.waffleVesubio"));
	        vm.getLblWaffleMerengue().setText(prop.getProperty("menu.waffles.waffleMerengue"));
	        vm.getLblWaffleNib().setText(prop.getProperty("menu.waffles.waffleNib"));
	        vm.getLblSweetBanana().setText(prop.getProperty("menu.waffles.waffleBanana"));
	    }

	    if(vp != null) {
	    	
	    	vp.getLabNombre().setText(prop.getProperty("menu.menuPago.cliente"));
	    	vp.getLabCedula().setText(prop.getProperty("menu.menuPago.cedula"));
	    	vp.getLabNumero().setText(prop.getProperty("menu.menuPago.numero"));
	    	vp.getLblPago().setText(prop.getProperty("menu.menuPago.forma"));
	    	vp.getLblLae().setText(prop.getProperty("menu.menuPago.pie"));
		    vp.getBtnPagar().setText(prop.getProperty("menu.menuPago.botonPagar"));
		    vp.getBtnCancelar().setText(prop.getProperty("menu.menuPago.botonCancelar"));
	    }
	    
        vm.getBtnComprar().setText(prop.getProperty("menu.menuCompra.botonComprar"));

	}


	public void procesarCompra() {
		double total = 0;
		StringBuilder detalle = new StringBuilder();

		switch(tipoProductoActual) {
		case "helado":
			total = calcularTotalHelados(detalle);
			break;
		case "crepe":
			total = calcularTotalCrepes(detalle);
			break;
		case "waffle":
			total = calcularTotalWaffles(detalle);
			break;
		}

		if(total > 0) {
			mostrarResumenCompra(total, detalle.toString());
			mostrarPanelPago();
		} else {
			JOptionPane.showMessageDialog(vm, 
					prop.getProperty("menu.JOptionPane.advertencia.noSeleccion"), 
					"Carrito Vacío", 
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public double agregarProducto(JSpinner spinner, Producto producto, StringBuilder detalle) {

		if (spinner == null) return 0;

		int cantidad = (Integer) spinner.getValue();

		if (cantidad > 0) {

			float precioUnitario = producto.calcularPrecio();
	        double subtotal = cantidad * precioUnitario;

	        for (int i = 0; i < cantidad; i++) {
	            carrito.add(producto);
	        }

	        detalle.append(String.format("%s x%d = $%.0f\n",
	                producto.getNombre(), cantidad, subtotal));
	        return subtotal;
		}

		return 0;
	}

	public double calcularTotalHelados(StringBuilder detalle) {

		double total = 0;

		total += agregarProducto(vm.getSpSweet(),
				new Helado("Sweet Banana", "Banana", false), detalle);

		total += agregarProducto(vm.getSpChocoMenta(),
				new Helado("Helado Menta", "Menta", false), detalle);

		total += agregarProducto(vm.getSpVainilla(),
				new Helado("Helado Vainilla", "Vainilla", false), detalle);

		total += agregarProducto(vm.getSpCheesecake(),
				new Helado("Cheesecake Limón", "Limón", false), detalle);

		total += agregarProducto(vm.getSpChocolate(),
				new Helado("Helado Chocolate", "Chocolate", true), detalle);

		total += agregarProducto(vm.getSpFresaLite(),
				new Helado("Helado Fresa", "Fresa", true), detalle);

		total += agregarProducto(vm.getSpVainillaLite(),
				new Helado("Helado Vainilla Light", "Vainilla", true), detalle);

		total += agregarProducto(vm.getSpYogurtLite(),
				new Helado("Helado Yogurt Curuba", "Curuba", true), detalle);

		return total;
	}

	public double calcularTotalCrepes(StringBuilder detalle) {

		double total = 0;

		total += agregarProducto(vm.getSpCrepeNutella(),
				new CrepeDulce("Crepe de Nutella", 0, false, true, false, "Nutella"),
				detalle);

		total += agregarProducto(vm.getSpCrepeFresas(),
				new CrepeDulce("Crepe de Fresas con Crema y Helado de Vainilla", 0, false, true, true, "Vainilla"),
				detalle);

		total += agregarProducto(vm.getSpCrepeBaby(),
				new CrepeDulce("Crepe Baby Doll", 0, false, false, false, "Chocolate"),
				detalle);

		total += agregarProducto(vm.getSpCrepeMont(),
				new CrepeDulce("Crepe Mont Blanc", 0, false, false, false, "Chocolate Blanco"),
				detalle);

		total += agregarProducto(vm.getSpCrepePollo(),
				new CrepeSalado("Crepe de pollo, Queso y  Champinones", 0, false, "Pollo", "Queso"),
				detalle);

		total += agregarProducto(vm.getSpCrepeThai(),
				new CrepeSalado("Crepe de Pollo Thai", 0, false, "Pollo", "Thai"),
				detalle);

		total += agregarProducto(vm.getSpCrepeRoastbeef(),
				new CrepeSalado("Crepe de Roastbeef", 0, false, "Roastbeef", "BBQ"),
				detalle);

		total += agregarProducto(vm.getSpCrepeCochinita(),
				new CrepeSalado("Crepe de Cochinita Pibil", 0, false, "Cochinita", "Mexicana"),
				detalle);

		return total;
	}

	public double calcularTotalWaffles(StringBuilder detalle) {

		double total = 0;

		total += agregarProducto(vm.getSpWaffleSencillo(),
				new Waffle("Waffle Sencillo con Helado", 0, null, false),
				detalle);

		total += agregarProducto(vm.getSpWaffleEspecial(),
				new Waffle("Waffle Especial", 0, null, true),
				detalle);

		total += agregarProducto(vm.getSpWaffleNutella(),
				new Waffle("Waffle de Nutella y Banano", 0, null, true),
				detalle);

		total += agregarProducto(vm.getSpWaffleTentacion(),
				new Waffle("Waffle Tentacion Melocoton", 0, null, true),
				detalle);

		total += agregarProducto(vm.getSpWaffleVesubio(),
				new Waffle("Waffle Vesubio", 0, null, true),
				detalle);

		total += agregarProducto(vm.getSpWaffleMerengue(),
				new Waffle("Waffle Merengue Glaze", 0, null, true),
				detalle);

		total += agregarProducto(vm.getSpWaffleNib(),
				new Waffle("Waffle Nib Crunch", 0, null, true),
				detalle);

		total += agregarProducto(vm.getSpWaffleBanana(),
				new Waffle("Waffle Banana Royal", 0, null, true),
				detalle);

		return total;
	}

	public void mostrarResumenCompra(double total, String detalle) {
		JOptionPane.showMessageDialog(vm, detalle + "\n" + String.format("TOTAL: $%.0f", total),
				"Resumen de Compra",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarPanelPago() {
		vp = new VentanaPago(); 
		vm.setVisible(false);

		vp.getBtnPagar().addActionListener(e -> procesarPago());
		vp.getBtnCancelar().addActionListener(e -> cancelarPedido());
		
		refrescarTexto();
	}

	public void procesarPago() {

		if (!validarDatosPago()) {
			return;
		}

		String formaPago = vp.getFormaPagoSeleccionada();

		try {
			LanzadorDeExcepcion.validarNequi(formaPago);
			LanzadorDeExcepcion.pedidoExterno(formaPago);
			guardarPedidoEnArchivo();



			JOptionPane.showMessageDialog(vm,
					prop.getProperty("menu.JOptionPane.pagoExitoso"),
					prop.getProperty("menu.JOptionPane.tituloPago"),
					JOptionPane.INFORMATION_MESSAGE);

			vp.dispose();
			reiniciarFlujo();

		} catch (NequiCaidoException e) {

			JOptionPane.showMessageDialog(vp,
					prop.getProperty("menu.JOPtionPane.nequiCaido"),
							prop.getProperty("menu.JOptionPane.tituloErrorPago"),
							JOptionPane.WARNING_MESSAGE);


			vp.setVisible(true);

		} catch (SomeoneElseOrderedException e) {

			JOptionPane.showMessageDialog(vp,
					prop.getProperty("menu.JOptionPane.errorPedidoTomado"),
							prop.getProperty("menu.JOptionPane.tituloErrorPedidoTomado"),
							JOptionPane.ERROR_MESSAGE);

			vp.dispose();
			reiniciarFlujo();
		}
	}
	
	public void guardarPedidoEnArchivo() {

	    switch (tipoProductoActual) {

	        case "helado":
	            for (Producto p : carrito) {
	                Helado h = (Helado) p;
	                mf.getHeladoDAO().crear(
	                    new HeladoDTO(
	                        h.getNombre(),
	                        h.getPrecio(),
	                        h.getSabor(),
	                        h.isEsLight()
	                    )
	                );
	            }
	            break;

	        case "crepe":
	            for (Producto p : carrito) {

	                if (p instanceof CrepeDulce) {
	                    CrepeDulce c = (CrepeDulce) p;
	                    mf.getCrepeDulceDAO().crear(
	                        new CrepeDulceDTO(
	                            c.getNombre(),
	                            c.getPrecio(),
	                            c.isEsVegano(),
	                            c.isTieneFruta(),
	                            c.isTieneHelado(),
	                            c.getSabor()
	                        )
	                    );
	                } else if (p instanceof CrepeSalado) {
	                    CrepeSalado c = (CrepeSalado) p;
	                    mf.getCrepeSaladoDAO().crear(
	                        new CrepeSaladoDTO(
	                            c.getNombre(),
	                            c.getPrecio(), 
	                            false, 
	                            c.getProteina(), 
	                            c.getSalsa()        
	                        )
	                    );
	                }
	            }
	            break;

	        case "waffle":
	            for (Producto p : carrito) {
	                Waffle w = (Waffle) p;
	                mf.getWaffleDAO().crear(
	                    new WaffleDTO(
	                        w.getNombre(),
	                        w.getPrecio()
	      
	                   )
	                );
	            }
	            break;
	    }
	}

	public boolean validarDatosPago() {

	    String nombre = vp.getTxtNombre().getText().trim();
	    String cedula = vp.getTxtCedula().getText().trim();
	    String telefono = vp.getTxtNumero().getText().trim();

	    if (nombre.isEmpty()) {
	        mostrarError("Por favor ingrese su nombre");
	        return false;
	    }

	    try {
	        LanzadorDeExcepcion.verificarTextoInvalido(nombre);
	    } catch (InvalidTextException e) {
	        mostrarError("El nombre no puede contener números ni símbolos");
	        return false;
	    }

	    if (cedula.isEmpty() || !cedula.matches("\\d+")) {
	        mostrarError("Ingrese una cédula válida (solo números)");
	        return false;
	    }

	    if (telefono.isEmpty() || !telefono.matches("\\d{10}")) {
	        mostrarError("Ingrese un teléfono válido (10 dígitos)");
	        return false;
	    }

	    return true;
	}

	public void cancelarPedido() {
		int confirmacion = JOptionPane.showConfirmDialog(vm,
				prop.getProperty("menu.JOptionPane.confirmacion.cancelar"),
				"Confirmar Cancelación",
				JOptionPane.YES_NO_OPTION);

		if(confirmacion == JOptionPane.YES_OPTION) {
			vp.dispose();    
			reiniciarFlujo(); 
		}
	}

	public void reiniciarFlujo() {
		tipoProductoActual = null;
		carrito.clear();
		vm.setVisible(false);
		vi.setVisible(true);
	}

	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(vm, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public ModelFacade getModelFacade() {
		return mf;
	}

	public VentanaInicio getVentanaInicio() {
		return vi;
	}

	public VentanaMenu getVentanaMenu() {
		return vm;
	}
	public VentanaPago getVp() {
		return vp;
	}
	public void setVp(VentanaPago vp) {
		this.vp = vp;
	}

	public VentanaInicio getVi() {
		return vi;
	}

	public void setVi(VentanaInicio vi) {
		this.vi = vi;
	}

	public VentanaMenu getVm() {
		return vm;
	}

	public void setVm(VentanaMenu vm) {
		this.vm = vm;
	}

	public ModelFacade getMf() {
		return mf;
	}

	public void setMf(ModelFacade mf) {
		this.mf = mf;
	}

	public String getTipoProductoActual() {
		return tipoProductoActual;
	}

	public void setTipoProductoActual(String tipoProductoActual) {
		this.tipoProductoActual = tipoProductoActual;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

}