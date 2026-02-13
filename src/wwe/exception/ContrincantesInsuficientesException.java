package wwe.exception;

public class ContrincantesInsuficientesException extends Exception{
	public ContrincantesInsuficientesException (String mensaje) {
		System.out.println("No hay suficientes luchadores para empezar el combate");
	}
}
