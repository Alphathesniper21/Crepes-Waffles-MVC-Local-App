package co.edu.unbosque.model;

import java.io.Serializable;

public class Waffle extends Producto implements Serializable {

    private Helado heladoBase;
    private boolean tieneSalsa;

    public Waffle() {
    }

    public Waffle(String nombre, float precio, Helado heladoBase, boolean tieneSalsa) {
        super(nombre, precio);
        this.heladoBase = heladoBase;
        this.tieneSalsa = tieneSalsa;
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

    public float calcularPrecio() {

        if (getNombre().equalsIgnoreCase("Waffle Sencillo con Helado")) {
            return 12900;

        } else if (getNombre().equalsIgnoreCase("Waffle Especial")) {
            return 15900;

        } else if (getNombre().equalsIgnoreCase("Waffle de Nutella y Banano")) {
            return 15900;

        } else if (getNombre().equalsIgnoreCase("Waffle Tentacion Melocoton")) {
            return 18900;

        } else if(getNombre().equals("Waffle Vesubio")) {
        	
        	return 20000;
        } else if(getNombre().equalsIgnoreCase("Waffle Merengue Glaze")) {
        	
        	return 17000;
        } else if(getNombre().equalsIgnoreCase("Waffle Nib Crunch")) {
        	
        	return 13400;
        } else if(getNombre().equalsIgnoreCase("Waffle Banana Royal")) {
        	
        	return 25000;
        } else {
            return getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHelado base: " + heladoBase +
                "\nTiene salsa: " + tieneSalsa;
    }
}
