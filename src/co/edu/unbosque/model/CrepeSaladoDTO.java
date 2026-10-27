package co.edu.unbosque.model;

public class CrepeSaladoDTO {

    private String nombre;
    private float precio;
    private boolean esVegano;
    private String proteina;
    private String salsa;

    public CrepeSaladoDTO() {
    }

    public CrepeSaladoDTO(String nombre, float precio, boolean esVegano,
                          String proteina, String salsa) {
        this.nombre = nombre;
        this.precio = precio;
        this.esVegano = esVegano;
        this.proteina = proteina;
        this.salsa = salsa;
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

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nPrecio: " + precio +
               "\nEs vegano: " + esVegano +
               "\nProteina: " + proteina +
               "\nSalsa: " + salsa;
    }
}
