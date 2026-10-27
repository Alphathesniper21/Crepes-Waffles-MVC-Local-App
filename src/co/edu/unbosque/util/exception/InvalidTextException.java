package co.edu.unbosque.util.exception;

public class InvalidTextException extends Exception{
	
	public InvalidTextException() {
		super("Los textos unicamente contienen letras, por favor intenete nuevamente");
	}

}
