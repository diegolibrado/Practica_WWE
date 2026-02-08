/**
 * @author Diego Librado Lopez
 */
package pojos;

/*
 * CLASE PUÑETAZO (HIJA)
 */
public class Punch extends Ataque {

	/**
	 * Método heredado dela clase Padre
	 */
	public void lanzarAtaque(Luchador luchador) {
		System.out.println("Puñetazo a " + luchador.getNombre());
	}

	// METODO TOSTRING
	public String toString() {
		return "Puñetazo";
	}
}
