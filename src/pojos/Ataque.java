package pojos;

import java.util.*;

public abstract class Ataque {
	//ATRIBUTOS DE LA CLASE ATAQUE
	private int potencia;
	
	//MÉTODOS DE LA CLASE ATAQUE
	
	public abstract static void lanzarAtaque();
	
	
	public abstract static void ataqueBloqueado(int fuerzaAtaque) {
		
	}

}
