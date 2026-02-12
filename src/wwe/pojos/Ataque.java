/**
 * @author Diego Librado Lopez
 */
package wwe.pojos;

/*
 * CLASE ATAQUE (PADRE)
 */
import java.util.*;

public abstract class Ataque {
	// ATRIBUTOS DE LA CLASE ATAQUE
	private int potencia;

	// MÉTODOS DE LA CLASE ATAQUE

	/**
	 * Método abstracto para que el Luchador lance el ataque
	 * 
	 * @param luchador objeto de tipo Luchador
	 */
	public abstract void lanzarAtaque(Luchador luchador);

	public static boolean ataqueBloqueado(int fuerzaAtaque, Luchador luchador) {
		Random aleatorio = new Random();

		if(luchador.getSalud() <= 0) {
			return false;
		}
		// Genera un numero aleatorio entre 0 y la salud del luchador
		int bloqueo = aleatorio.nextInt(luchador.getSalud());

		if (bloqueo > fuerzaAtaque) {
			System.out.println("¡¡ATAQUE BLOQUEADO!!");
			return true;
		}else {
			return false;
		}
	}

	// GETTER
	public int getPotencia() {
		return potencia;
	}
	
	
	
	

}
