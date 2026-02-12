/**
 * @author Diego Librado Lopez
 */
package wwe.pojos;

/*
 * CLASE PATADA (HIJA)
 */
public class Patada extends Ataque {

	/**
	 * Método heredado dela clase Padre
	 */
	public void lanzarAtaque(Luchador luchador) {
		System.out.println("Patada a " + luchador.getNombre());
	}

	// METODO TOSTRING
	public String toString() {
		return "Patada";
	}
}
