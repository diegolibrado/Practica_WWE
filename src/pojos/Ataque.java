/**
 * @author Diego Librado Lopez
 */
package pojos;

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

	public static void ataqueBloqueado(int fuerzaAtaque, Luchador luchador) {
		Random aleatorio = new Random();

		// Genera un numero aleatorio entre 0 y la salud del luchador
		int daño = aleatorio.nextInt(luchador.getSalud());

		if (daño > luchador.getFuerza()) {

		}
	}

	// GETTER
	public int getPotencia() {
		return potencia;
	}

}
