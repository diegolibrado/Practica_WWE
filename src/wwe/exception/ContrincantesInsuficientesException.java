package wwe.exception;

public class ContrincantesInsuficientesException extends Exception{
	public ContrincantesInsuficientesException () {
		System.out.println("No hay suficientes luchadores para empezar el combate");
	}
}
