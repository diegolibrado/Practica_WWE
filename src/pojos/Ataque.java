package pojos;
/*
 * CLASE ATAQUE (PADRE)
 */
import java.util.*;

public abstract class Ataque {
	//ATRIBUTOS DE LA CLASE ATAQUE
	private int potencia;
	Luchador luchador1 = new Luchador();
	
	//MÉTODOS DE LA CLASE ATAQUE
	
	/**
	 * Método abstracto para que el Luchador lance el ataque
	 * @param luchador
	 */
	public abstract void lanzarAtaque(Luchador luchador);
	
	public static void ataqueBloqueado(int fuerzaAtaque, Luchador luchador1) {
		Random aleatorio = new Random();
		
		int daño = aleatorio.nextInt(Luchador.getSalud());
		
		if(daño > Luchador.getFuerza()) {
			
		}
	}

	public int getPotencia() {
		return potencia;
	}
}
