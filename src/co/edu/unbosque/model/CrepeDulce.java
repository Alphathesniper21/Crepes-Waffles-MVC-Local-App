package co.edu.unbosque.model;

public class CrepeDulce extends Crepe {

    private boolean tieneFruta;
    private boolean tieneHelado;
    private String sabor;
    
    public CrepeDulce() {
    }

    public CrepeDulce(String nombre, float precio, boolean esVegano,
                      boolean tieneFruta, boolean tieneHelado, String sabor) {

        super(nombre, precio, esVegano);
        this.tieneFruta = tieneFruta;
        this.tieneHelado = tieneHelado;
        this.sabor = sabor;
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
    public float calcularPrecio() {

        float total = super.calcularPrecio();

        if (tieneFruta) {
            total += 1500;
        }

        if (tieneHelado) {
            total += 2000;
        }

        return total;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Tiene fruta: " + tieneFruta + "\n" +
               "Tiene helado: " + tieneHelado + "\n" +
               "Sabor: " + sabor + "\n" +
               "Precio final: $" + calcularPrecio() + "\n";
    }
}

