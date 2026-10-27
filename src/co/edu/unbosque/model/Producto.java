package co.edu.unbosque.model;

import java.io.Serializable;

public abstract class Producto implements Serializable {

    private String nombre;
    private float precio;
    
    public Producto() {
    	// TODO Auto-generated constructor stub
    }

    public Producto(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	 public float calcularPrecio() {
	        return precio;
	    }

	@Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nPrecio: " + precio;
    }
}
