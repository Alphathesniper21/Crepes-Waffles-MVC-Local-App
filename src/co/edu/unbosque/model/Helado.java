package co.edu.unbosque.model;

import java.io.Serializable;

public class Helado extends Producto implements Serializable {

    private String sabor;
    private boolean esLight;

    public Helado() {
    }

    public Helado(String nombre, String sabor, boolean esLight) {
        super(nombre, 0);
        this.sabor = sabor;
        this.esLight = esLight;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isEsLight() {
        return esLight;
    }

    public void setEsLight(boolean esLight) {
        this.esLight = esLight;
    }

    public float calcularPrecio() {

        if (esLight) {
            return 12000;
        } else {
            return 7800;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSabor: " + sabor +
                "\nEs light: " + esLight;
    }
}