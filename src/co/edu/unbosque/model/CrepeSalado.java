package co.edu.unbosque.model;

import java.io.Serializable;

public class CrepeSalado extends Crepe implements Serializable {

    private String proteina;
    private String salsa;

    public CrepeSalado() {
    }

    public CrepeSalado(String nombre, float precio, boolean esVegano,
                       String proteina, String salsa) {
        super(nombre, precio, esVegano);
        this.proteina = proteina;
        this.salsa = salsa;
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

    public float calcularPrecio() {

        if (getNombre().equals("Crepe de pollo, Queso y Champinones")) {
            return 26900;
        } else if (getNombre().equals("Crepe de Pollo Thai")) {
            return 28900;
        } else if (getNombre().equals("Crepe de Roastbeef")) {
            return 31900;
        } else if (getNombre().equals("Crepe de Cochinita Pibil")) {
            return 24500;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProteina: " + proteina +
                "\nSalsa: " + salsa;
    }
}
