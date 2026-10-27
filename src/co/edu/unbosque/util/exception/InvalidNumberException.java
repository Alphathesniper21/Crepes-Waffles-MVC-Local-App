package co.edu.unbosque.util.exception;

public class InvalidNumberException extends Exception{
	
	public InvalidNumberException() {
        super("Se le esta solicitando un valor numerico y  positivo, por favor intentelo de nuevo.");
    }


}
