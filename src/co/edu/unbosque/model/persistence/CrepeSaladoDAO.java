package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Crepe;
import co.edu.unbosque.model.CrepeSalado;
import co.edu.unbosque.model.CrepeSaladoDTO;

public class CrepeSaladoDAO implements DAO<CrepeSaladoDTO>{

	private ArrayList<CrepeSalado> listaCrepesSalados;
	private final String FILE_NAME = "crepesSalado.csv";
	private final String SERIAL_FILE_NAME = "crepesSalados.bin";

	public CrepeSaladoDAO() {

		listaCrepesSalados = new ArrayList<CrepeSalado>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(CrepeSaladoDTO producto) {

		CrepeSalado crepeSalado = DataMapper.convertirCrepeSaladoDTOACrepeSalado(producto);
		listaCrepesSalados.add(crepeSalado);
		escribirEnArchivoDeTexto();
		escribirDesdeArchivoSerializado();
	}

	@Override
	public boolean eliminar(int indice) {

		if(indice < 0 || indice > listaCrepesSalados.size()) {

			return false;
		} else {

			listaCrepesSalados.remove(indice);
			escribirDesdeArchivoSerializado();
			escribirEnArchivoDeTexto();
			return true;
		}
	}

	@Override
	public String mostrar() {

		return (String) FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
	}

	@Override
	public boolean actualizar(int indice, CrepeSaladoDTO producto) {

		if(indice < 0 || indice > listaCrepesSalados.size()) {

			return false;
		} else {

			listaCrepesSalados.remove(indice);
			escribirDesdeArchivoSerializado();
			escribirEnArchivoDeTexto();
			return true;
		}
	}

	@Override
	public int contar() {

		return listaCrepesSalados.size();
	}

	@Override
	public void cargarDesdeArchivoSerializado() {

		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);

		if(contenido != null) {

			listaCrepesSalados = (ArrayList<CrepeSalado>) contenido;
		} else {

			listaCrepesSalados = new ArrayList<CrepeSalado>();
		} 
	}

	@Override
	public void escribirDesdeArchivoSerializado() {

		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCrepesSalados);
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {

		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto(url);
		String[] filas = contenido.split("\n");

		if(contenido == "" || contenido.isBlank()) {

			return;
		} else {

			for(int i = 0; i < filas.length; i++) {

				String[] columnas = filas[i].split(";");
				CrepeSalado temporal = new CrepeSalado();
				temporal.setNombre(columnas[0]);
				temporal.setPrecio(Float.parseFloat(columnas[1]));
				temporal.setProteina(columnas[2]);
				temporal.setSalsa(columnas[3]);
				
				listaCrepesSalados.add(temporal);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		
		StringBuilder sb = new StringBuilder();
		
		for (CrepeSalado crepeSalado : listaCrepesSalados) {
			
			sb.append(crepeSalado.getNombre() + ";");
			sb.append(crepeSalado.getPrecio() + ";");
			sb.append(crepeSalado.getProteina() + ";");
			sb.append(crepeSalado.getSalsa() + ";");
		}
		
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	public ArrayList<CrepeSalado> getListaCrepesSalados() {
		return listaCrepesSalados;
	}

	public void setListaCrepesSalados(ArrayList<CrepeSalado> listaCrepesSalados) {
		this.listaCrepesSalados = listaCrepesSalados;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}
	
}
