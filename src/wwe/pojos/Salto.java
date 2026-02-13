/**
 * @author Diego Librado Lopez
 */
package wwe.pojos;

/*
 * CLASE SALTO (HIJA)
 */
public class Salto extends Ataque {

	public Salto(int fuerza) {
		super(fuerza);
	}

	/**
	 * Método heredado dela clase Padre
	 */
	public int lanzarAtaque(Luchador oponente) {
		System.out.println("Salto a " + oponente.getNombre());
		int fuerza_ataque = aleatorio.nextInt(potencia); 
		
		if(ataqueBloqueado(fuerza_ataque, oponente)) {
			fuerza_ataque = fuerza_ataque/2;
		}
		return fuerza_ataque;
	}

	// METODO TOSTRING
	public String toString() {
		return "Salto";
	}
}
