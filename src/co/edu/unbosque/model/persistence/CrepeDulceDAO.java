package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CrepeDulce;
import co.edu.unbosque.model.CrepeDulceDTO;

public class CrepeDulceDAO implements DAO<CrepeDulceDTO> {

    private ArrayList<CrepeDulce> listaCrepesDulces;
    private final String FILE_NAME = "crepeDulce.csv";
    private final String SERIAL_FILE_NAME = "crepeDulce.bin";

    public CrepeDulceDAO() {
        listaCrepesDulces = new ArrayList<>();
        cargarDesdeArchivoSerializado();
    }

    @Override
    public void crear(CrepeDulceDTO producto) {
        CrepeDulce crepe = DataMapper.convertirCrepeDulceDTOACrepeDulce(producto);
        listaCrepesDulces.add(crepe);
        escribirDesdeArchivoSerializado();
        escribirEnArchivoDeTexto();
    }

    @Override
    public boolean eliminar(int indice) {

        if (indice < 0 || indice >= listaCrepesDulces.size()) {
            return false;
        }

        listaCrepesDulces.remove(indice);
        escribirDesdeArchivoSerializado();
        escribirEnArchivoDeTexto();
        return true;
    }

    @Override
    public boolean actualizar(int indice, CrepeDulceDTO producto) {

        if (indice < 0 || indice >= listaCrepesDulces.size()) {
            return false;
        }

        CrepeDulce crepe = DataMapper.convertirCrepeDulceDTOACrepeDulce(producto);
        listaCrepesDulces.set(indice, crepe);
        escribirDesdeArchivoSerializado();
        escribirEnArchivoDeTexto();
        return true;
    }

    @Override
    public String mostrar() {

        StringBuilder sb = new StringBuilder();

        for (CrepeDulce c : listaCrepesDulces) {
            sb.append(c.toString()).append("\n\n");
        }

        return sb.toString();
    }

    @Override
    public int contar() {
        return listaCrepesDulces.size();
    }

    @Override
    public void cargarDesdeArchivoSerializado() {

        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);

        if (contenido != null) {
            listaCrepesDulces = (ArrayList<CrepeDulce>) contenido;
        } else {
            listaCrepesDulces = new ArrayList<>();
        }
    }

    @Override
    public void escribirDesdeArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCrepesDulces);
    }

    @Override
    public void leerDesdeArchivoDeTexto(String url) {

        String contenido = FileHandler.leerDesdeArchivoDeTexto(url);

        if (contenido == null || contenido.isBlank()) {
            return;
        }

        String[] filas = contenido.split("\n");

        for (String fila : filas) {

            String[] columnas = fila.split(";");

            CrepeDulce temp = new CrepeDulce();
            temp.setNombre(columnas[0]);
            temp.setPrecio(Float.parseFloat(columnas[1]));
            temp.setEsVegano(Boolean.parseBoolean(columnas[2]));
            temp.setTieneFruta(Boolean.parseBoolean(columnas[3]));
            temp.setTieneHelado(Boolean.parseBoolean(columnas[4]));
            temp.setSabor(columnas[5]);

            listaCrepesDulces.add(temp);
        }
    }

    @Override
    public void escribirEnArchivoDeTexto() {

        StringBuilder sb = new StringBuilder();

        for (CrepeDulce c : listaCrepesDulces) {

            sb.append(c.getNombre()).append(";");
            sb.append(c.getPrecio()).append(";");
            sb.append(c.isEsVegano()).append(";");
            sb.append(c.isTieneFruta()).append(";");
            sb.append(c.isTieneHelado()).append(";");
            sb.append(c.getSabor()).append("\n");
        }

        FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
    }

    public ArrayList<CrepeDulce> getListaCrepesDulces() {
        return listaCrepesDulces;
    }
}