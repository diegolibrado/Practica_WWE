/**
 * @author Diego Librado Lopez
 */
package wwe.pojos;

/*
 * CLASE PUÑETAZO (HIJA)
 */
public class Punch extends Ataque {

	public Punch(int fuerza) {
		super(fuerza);
	}

	/**
	 * Método heredado dela clase Padre
	 */
	public int lanzarAtaque(Luchador oponente) {
		System.out.println("Puñetazo a " + oponente.getNombre());
		int fuerza_ataque = aleatorio.nextInt(potencia); 
		
		if(ataqueBloqueado(fuerza_ataque, oponente)) {
			fuerza_ataque = fuerza_ataque/2;
		}
		return fuerza_ataque;
	}

	// METODO TOSTRING
	public String toString() {
		return "Puñetazo";
	}
}
