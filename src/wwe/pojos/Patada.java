/**
 * @author Diego Librado Lopez
 */
package wwe.pojos;

import java.util.*;

/*
 * CLASE PATADA (HIJA)
 */
public class Patada extends Ataque {
	Random aleatorio = new Random();

	public Patada(int fuerza) {
		super(fuerza);
	}

	/**
	 * Método heredado dela clase Padre
	 */
	public int lanzarAtaque(Luchador oponente) {
		System.out.println("Patada a " + oponente.getNombre());
		int fuerza_ataque = aleatorio.nextInt(potencia); 
		
		if(ataqueBloqueado(fuerza_ataque, oponente)) {
			fuerza_ataque = fuerza_ataque/2;
		}
		return fuerza_ataque;
	}

	// METODO TOSTRING
	public String toString() {
		return "Patada";
	}
}
