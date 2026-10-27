package co.edu.unbosque.model;

import java.io.Serializable;

public class CrepeDulceDTO implements Serializable {

    private String nombre;
    private float precio;
    private boolean esVegano;
    private boolean tieneFruta;
    private boolean tieneHelado;
    private String sabor;

    public CrepeDulceDTO() {
    }

    public CrepeDulceDTO(String nombre, float precio, boolean esVegano,
                         boolean tieneFruta, boolean tieneHelado, String sabor) {
        this.nombre = nombre;
        this.precio = precio;
        this.esVegano = esVegano;
        this.tieneFruta = tieneFruta;
        this.tieneHelado = tieneHelado;
        this.sabor = sabor;
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

    public boolean isEsVegano() {
        return esVegano;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }

    public boolean isTieneFruta() {
        return tieneFruta;
    }

    public void setTieneFruta(boolean tieneFruta) {
        this.tieneFruta = tieneFruta;
    }

    public boolean isTieneHelado() {
        return tieneHelado;
    }

    public void setTieneHelado(boolean tieneHelado) {
        this.tieneHelado = tieneHelado;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nPrecio: " + precio +
               "\nEs vegano: " + esVegano +
               "\nTiene fruta: " + tieneFruta +
               "\nTiene helado: " + tieneHelado +
               "\nSabor: " + sabor;
    }
}
