package co.edu.unbosque.util.exception;

import java.util.Random;

public class LanzadorDeExcepcion {
	
	
	public static void validarNequi(String formaPago) throws NequiCaidoException {
        if (formaPago != null && formaPago.toLowerCase().contains("nequi")) {
            Random rand = new Random();
            int numeroAleatorio = rand.nextInt(100);

            if (numeroAleatorio < 30) {
                throw new NequiCaidoException();
            }
        }
    }
	
	public static void pedidoExterno(String formaPago) throws SomeoneElseOrderedException{
		if(formaPago !=null) {
			Random rand = new Random();
			int numeroAleatorio = rand.nextInt(100);
			
			if (numeroAleatorio < 25) {
				throw new SomeoneElseOrderedException();
			}
		}
	}
	
	public static void verificarTextoInvalido(String nombre) throws InvalidTextException{

		for(int i = 0; i < nombre.length(); i++) {

			char letra = nombre.charAt(i);

			if(!Character.isLetter(letra) && !Character.isWhitespace(letra)) {

				throw new InvalidTextException();
			}
		}
	}
	

	public static void verificarEntrada(String entrada) throws InvalidNumberException {
	    float numero;

	    try {
	        numero = Float.parseFloat(entrada);
	        
	    } catch (NumberFormatException e) {
	
	        throw new InvalidNumberException();
	    }


	    if (numero <= 0) {
	        throw new InvalidNumberException();
	    }
	}

}
