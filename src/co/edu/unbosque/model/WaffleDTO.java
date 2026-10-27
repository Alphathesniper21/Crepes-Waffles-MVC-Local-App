package co.edu.unbosque.model;

public class WaffleDTO extends Producto{

	private Helado heladoBase;
	private boolean tieneSalsa;
	
	public WaffleDTO() {
		// TODO Auto-generated constructor stub
	}

	public WaffleDTO(Helado heladoBase, boolean tieneSalsa) {
		super();
		this.heladoBase = heladoBase;
		this.tieneSalsa = tieneSalsa;
	}

	public WaffleDTO(String nombre, float precio, Helado heladoBase, boolean tieneSalsa) {
		super(nombre, precio);
		this.heladoBase = heladoBase;
		this.tieneSalsa = tieneSalsa;
	}
	
	public WaffleDTO(String nombre, float precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public Helado getHeladoBase() {
		return heladoBase;
	}

	public void setHeladoBase(Helado heladoBase) {
		this.heladoBase = heladoBase;
	}

	public boolean isTieneSalsa() {
		return tieneSalsa;
	}

	public void setTieneSalsa(boolean tieneSalsa) {
		this.tieneSalsa = tieneSalsa;
	}

	@Override
	public String toString() {
		return super.toString() + "Helado base: " + heladoBase 
				+ "\nTiene salsa: " + tieneSalsa;
	}
	
}
