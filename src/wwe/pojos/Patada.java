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
	public int lanzarAtaque(Luchador rival) {
		System.out.println("Patada a " + rival.getNombre());
		int fuerza_ataque = aleatorio.nextInt(potencia); 
		
		if(ataqueBloqueado(fuerza_ataque, rival)) {
			fuerza_ataque = fuerza_ataque/2;
		}
		return fuerza_ataque;
	}

	// METODO TOSTRING
	public String toString() {
		return "Patada";
	}
}
