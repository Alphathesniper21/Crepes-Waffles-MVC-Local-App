package co.edu.unbosque.model.persistence;

public interface DAO <E> {
	
	public void crear(E producto);
	public boolean eliminar(int indice);
	public String mostrar();
	public boolean actualizar(int indice, E producto);
	public int contar();
	
	public void cargarDesdeArchivoSerializado();
	public void escribirDesdeArchivoSerializado();
	public void leerDesdeArchivoDeTexto(String url);
	public void escribirEnArchivoDeTexto();
}
