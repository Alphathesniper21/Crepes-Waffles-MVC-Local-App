package co.edu.unbosque.model;

public abstract class Crepe extends Producto {

    private boolean esVegano;
    
    public Crepe() {}
    
	public Crepe(boolean esVegano) {
		super();
		this.esVegano = esVegano;
	}

	public Crepe(String nombre, float precio, boolean esVegano) {
		super(nombre, precio);
		this.esVegano = esVegano;
	}

	public boolean isEsVegano() {
		return esVegano;
	}

	public void setEsVegano(boolean esVegano) {
		this.esVegano = esVegano;
	}

	@Override
	public String toString() {
		return super.toString() + "Es vegano: " + esVegano;
	}
    
}
