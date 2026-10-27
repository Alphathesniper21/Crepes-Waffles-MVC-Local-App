package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Helado;
import co.edu.unbosque.model.HeladoDTO;

public class HeladoDAO implements DAO<HeladoDTO>{

	private ArrayList<Helado> listaHelados;
	private final String FILE_NAME = "helado.csv";
	private final String SERIAL_FILE_NAME = "helados.csv";

	public HeladoDAO() {

		listaHelados = new ArrayList<Helado>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(HeladoDTO producto) {

		Helado helado = DataMapper.convertirHeladoDTOAHelado(producto);
		listaHelados.add(helado);
		escribirEnArchivoDeTexto();
		escribirDesdeArchivoSerializado();
	}

	@Override
	public boolean eliminar(int indice) {

		if(indice < 0 || indice > listaHelados.size()) {

			return false;
		} else { 

			listaHelados.remove(indice);
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
	public boolean actualizar(int indice, HeladoDTO producto) {

		if(indice < 0 || indice > listaHelados.size()) {

			return false;
		} else {

			listaHelados.remove(indice);
			escribirDesdeArchivoSerializado();
			escribirEnArchivoDeTexto();
			return true;
		}
	}

	@Override
	public int contar() {

		return listaHelados.size();
	}

	@Override
	public void cargarDesdeArchivoSerializado() {

		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);

		if(contenido != null) {

			listaHelados = (ArrayList<Helado>) contenido;
		} else {

			listaHelados = new ArrayList<Helado>();
		}
	}

	@Override
	public void escribirDesdeArchivoSerializado() {

		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHelados);
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
				Helado temporal = new Helado();
				temporal.setNombre(columnas[0]);
				temporal.setPrecio(Float.parseFloat(columnas[1]));
				temporal.setSabor(columnas[2]);
				temporal.setEsLight(Boolean.parseBoolean(columnas[3]));
				
				listaHelados.add(temporal);
			}
		} 
	}

	@Override
	public void escribirEnArchivoDeTexto() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Helado helado : listaHelados) {
			
			sb.append(helado.getNombre() + ";");
			sb.append(helado.getPrecio() + ";");
			sb.append(helado.getSabor() + ";");
			sb.append(helado.isEsLight() + "\n");
		}
		
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	public ArrayList<Helado> getListaHelados() {
		return listaHelados;
	}

	public void setListaHelados(ArrayList<Helado> listaHelados) {
		this.listaHelados = listaHelados;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

}
