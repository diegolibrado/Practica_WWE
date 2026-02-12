/**
 * @author Diego Librado Lopez
 */
package wwe.pojos;

/*
 * CLASE SALTO (HIJA)
 */
public class Salto extends Ataque {

	/**
	 * Método heredado dela clase Padre
	 */
	public void lanzarAtaque(Luchador luchador) {
		System.out.println("Salto a " + luchador.getNombre());
	}

	// METODO TOSTRING
	public String toString() {
		return "Salto";
	}
}
