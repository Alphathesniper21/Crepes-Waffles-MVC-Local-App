package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Helado;
import co.edu.unbosque.model.Waffle;
import co.edu.unbosque.model.WaffleDTO;

public class WaffleDAO implements DAO<WaffleDTO>{

	private ArrayList<Waffle> listaWaffles;
	private final String FILE_NAME = "waffle.csv";
	private final String SERIAL_FILE_NAME = "waffles.bin";
	
	public WaffleDAO() {
		
		listaWaffles = new ArrayList<Waffle>();
		cargarDesdeArchivoSerializado();
	}

	@Override
	public void crear(WaffleDTO producto) {
		
		Waffle waffle = DataMapper.convertirWaffleDTOAWaffle(producto);
		listaWaffles.add(waffle);
		escribirEnArchivoDeTexto();
		escribirDesdeArchivoSerializado();
	}

	@Override
	public boolean eliminar(int indice) {
		
		if(indice < 0 || indice > listaWaffles.size()) {

			return false;
		} else {
			
			listaWaffles.remove(indice);
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
	public boolean actualizar(int indice, WaffleDTO producto) {
		
		if(indice < 0 || indice > listaWaffles.size()) {

			return false;
		} else {
			
			Waffle waffleActualizado = DataMapper.convertirWaffleDTOAWaffle(producto);
			listaWaffles.set(indice, waffleActualizado);
			escribirDesdeArchivoSerializado();
			escribirEnArchivoDeTexto();
			return true;
		}
	}

	@Override
	public int contar() {
		
		return listaWaffles.size();
	}

	@Override
	public void cargarDesdeArchivoSerializado() {
		
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		
		if(contenido != null) {
			
			listaWaffles = (ArrayList<Waffle>) contenido;
		} else {
			
			listaWaffles = new ArrayList<Waffle>();
		}
	}

	@Override
	public void escribirDesdeArchivoSerializado() {
		
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaWaffles);
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
				Waffle temporal = new Waffle();
				Helado helado = new Helado();
				temporal.setNombre(columnas[0]);
				temporal.setPrecio(Float.parseFloat(columnas[1]));
				helado.setSabor(columnas[2]);
				temporal.setHeladoBase(helado);
				temporal.setTieneSalsa(Boolean.parseBoolean(columnas[3]));
				
				listaWaffles.add(temporal);
			}
		}
	}

	@Override
	public void escribirEnArchivoDeTexto() {
	
		StringBuilder sb = new StringBuilder();
		
		for (Waffle waffle : listaWaffles) {
			
			sb.append(waffle.getNombre() + ";");
			sb.append(waffle.getPrecio() + ";");
			sb.append(waffle.getHeladoBase() + ";");
			sb.append(waffle.isTieneSalsa() + "\n");
		}
		
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}
}
