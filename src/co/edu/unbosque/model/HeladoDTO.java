package co.edu.unbosque.model;

public class HeladoDTO extends Producto{

	private String sabor;
    private boolean esLight;
    
    public HeladoDTO() {
		// TODO Auto-generated constructor stub
	}

	public HeladoDTO(String sabor, boolean esLight) {
		super();
		this.sabor = sabor;
		this.esLight = esLight;
	}

	public HeladoDTO(String nombre, float precio, String sabor, boolean esLight) {
		super(nombre, precio);
		this.sabor = sabor;
		this.esLight = esLight;
	}
	
	public HeladoDTO(String nombre, float precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isesLight() {
		return esLight;
	}

	public void setesLight(boolean esLight) {
		this.esLight = esLight;
	}

	public float calcularPrecio() {

		if (this.esLight == true) {

			return 12000;
		} else {

			return 7800;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "Sabor del helado: " + sabor  
				+ "\nEs light=" + esLight;
	}
    
}
