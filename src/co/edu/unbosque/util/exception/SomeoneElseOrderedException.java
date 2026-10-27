package co.edu.unbosque.util.exception;

public class SomeoneElseOrderedException extends Exception{
	
	public SomeoneElseOrderedException() {
		super("Alguien mas acaba de realizar el mismo pedido, por favor ordene de nuevo");
	}

}
